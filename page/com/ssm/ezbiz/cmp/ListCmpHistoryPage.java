package com.ssm.ezbiz.cmp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.extensions.markup.html.repeater.data.table.NavigatorLabel;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;

import com.ssm.ezbiz.service.CmpMasterHistoryService;
import com.ssm.ezbiz.service.CmpMasterService;
import com.ssm.ezbiz.service.CmpTransactionService;
import com.ssm.llp.base.common.Parameter;
import com.ssm.llp.base.common.sec.UserEnvironmentHelper;
import com.ssm.llp.base.exception.SSMException;
import com.ssm.llp.base.page.SSMPagingNavigator;
import com.ssm.llp.base.page.SecBasePage;
import com.ssm.llp.base.page.table.SSMDataView;
import com.ssm.llp.base.page.table.SSMSessionSortableDataProvider;
import com.ssm.llp.base.wicket.component.SSMAjaxButton;
import com.ssm.llp.base.wicket.component.SSMDateTextField;
import com.ssm.llp.base.wicket.component.SSMLabel;
import com.ssm.llp.base.wicket.component.SSMTextField;
import com.ssm.llp.ezbiz.model.CmpMaster;
import com.ssm.llp.ezbiz.model.CmpTransaction;
import com.ssm.llp.mod1.model.LlpUserProfile;
import com.ssm.llp.mod1.service.LlpUserProfileService;

public class ListCmpHistoryPage extends SecBasePage{


	@SpringBean(name = "LlpUserProfileService")
	private LlpUserProfileService llpUserProfileService;
	
	@SpringBean(name = "CmpMasterService")
	private CmpMasterService CmpMasterService;
	
	//@SpringBean(name = "CmpMasterHistoryService")
	//private CmpMasterHistoryService cmpMasterHistoryService;
	
	@SpringBean(name = "CmpTransactionService")
	private CmpTransactionService cmpTransactionService;
	

	public ListCmpHistoryPage() {
		setDefaultModel(new CompoundPropertyModel(new LoadableDetachableModel() {
		
			protected Object load() {
				ListCmpPageFormModel listCmpPageFormModel = new ListCmpPageFormModel();
				
				String icNo = "";
				if(!UserEnvironmentHelper.isInternalUser()){
					LlpUserProfile profile = llpUserProfileService.findProfileInfoByUserId(UserEnvironmentHelper.getLoginName());
					if(profile!=null){
						icNo = profile.getIdNo();
					}
				}
				listCmpPageFormModel.setCmpIcNo(icNo);
				
				return listCmpPageFormModel;
			}
		}));
		add(new ListCmpPageForm("form", (IModel<ListCmpPageFormModel>) getDefaultModel()));
	}
	
	private class ListCmpPageForm extends Form implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public ListCmpPageForm(String id, IModel<ListCmpPageFormModel> m) {
			super(id, m);
			m.getObject();
			
						
			SSMDateTextField createDtFrom = new SSMDateTextField("createDtFrom");
			createDtFrom.setLabelKey("page.lbl.ezbiz.cmpcreateDtFrom");
			add(createDtFrom);
			
			SSMDateTextField createDtTo = new SSMDateTextField("createDtTo");
			createDtTo.setLabelKey("page.lbl.ezbiz.cmpcreateDtTo");
			add(createDtTo);
			
			//SSMDropDownChoice cmpEntityType = new SSMDropDownChoice("cmpEntityType", Parameter.ENTITY_TYPE);
			//cmpEntityType.setLabelKey("page.lbl.ezbiz.cmpEntityType");
			//add(cmpEntityType);
			
			SSMTextField cmpNo = new SSMTextField("cmpNo");
			cmpNo.setLabelKey("page.lbl.ezbiz.cmpNo");
			add(cmpNo);
			
			SSMAjaxButton search = new SSMAjaxButton("search") {
				@Override
				public void onSubmit(AjaxRequestTarget target, Form<?> form) {
					ListCmpPageFormModel searchModelForm = (ListCmpPageFormModel) form.getDefaultModelObject();
					
					populateTable(searchModelForm,target);
					
				}
			};
			add(search);
			populateTable(null,null);
		}
		
		public void populateTable(ListCmpPageFormModel listCmpPageFormModel, AjaxRequestTarget target){
			WebMarkupContainer wmcSearchResult = new WebMarkupContainer("wmcSearchResult");
			wmcSearchResult.setOutputMarkupId(true);
			wmcSearchResult.setVisible(true);
			
			List<CmpTransaction> cmpTransactionList = new ArrayList<CmpTransaction>();
			try {
				if(listCmpPageFormModel != null && target !=null){
					String idName = "";
					LlpUserProfile profile = llpUserProfileService.findProfileInfoByUserId(UserEnvironmentHelper.getLoginName());
					if(profile!=null){
						idName = profile.getLoginId();
					}
					
					cmpTransactionList = cmpTransactionService.findByDate(listCmpPageFormModel.getCreateDtFrom(), listCmpPageFormModel.getCreateDtTo(), listCmpPageFormModel.getCmpNo(), idName, null, "list");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			SSMSessionSortableDataProvider dp = new SSMSessionSortableDataProvider("cmpNo", cmpTransactionList);
			final SSMDataView<CmpTransaction> dataView = new SSMDataView<CmpTransaction>("sorting", dp) {
				private static final long serialVersionUID = 1L;


				protected void populateItem(final Item<CmpTransaction> item) {
					final CmpTransaction cmpTransaction = item.getModelObject();
					
					List<CmpMaster> listCmpMaster = null;
					try {
						listCmpMaster = CmpMasterService.findByTransCode(cmpTransaction.getCmpTransactionCode());
					} catch (SSMException e) {
						e.printStackTrace();
					}
					
					String cmpNoStr = "";
					String entityTypeStr = "";
					String entityNoStr = "";
					String entityNameStr = "";
					
					if(listCmpMaster != null && listCmpMaster.size()>0){
						CmpMaster cmpMaster = listCmpMaster.get(0);
						cmpNoStr = cmpMaster.getCmpNo();
						entityTypeStr = cmpMaster.getEntityType();
						entityNoStr = cmpMaster.getEntityNo();
						entityNameStr = cmpMaster.getEntityName();
					}
			        
					item.add(new SSMLabel("cmpNo", cmpNoStr));
					item.add(new SSMLabel("cmpTrans", cmpTransaction.getCmpTransactionCode()));
					item.add(new SSMLabel("cmpPayTrans", cmpTransaction.getStatus(), Parameter.CMP_TRANSACTION_STATUS));
					item.add(new SSMLabel("cmpEntityType", entityTypeStr , Parameter.CMP_ENTITY_TYPE));
					item.add(new SSMLabel("cmpEntityNo", entityNoStr));
					item.add(new SSMLabel("cmpEntityName", entityNameStr));
					item.add(new SSMLabel("cmpAmt", cmpTransaction.getTotalAmt()));					

//					item.add(new Link("detail", item.getDefaultModel()) {
//						public void onClick() {
//							CmpMaster cmpMaster = item.getModelObject();
//							setResponsePage(new ListCmpDetailHistoryPage(cmpMaster));
//						}
//					});

					item.add(AttributeModifier.replace("class", new AbstractReadOnlyModel<String>() {
						private static final long serialVersionUID = 1L;

						@Override
						public String getObject() {
							return (item.getIndex() % 2 == 1) ? "even" : "odd";
						}
					}));
				}
			};

			dataView.setItemsPerPage(20L);

			wmcSearchResult.add(dataView);
			wmcSearchResult.add(new SSMPagingNavigator("navigator", dataView));
			wmcSearchResult.add(new NavigatorLabel("navigatorLabel", dataView));
			if(target==null){
				add(wmcSearchResult);
			}else{
				replace(wmcSearchResult);
				target.add(wmcSearchResult);
			}
		}
		
	}
	
	private class ListCmpPageFormModel {
		private String cmpIcNo;
		private String cmpNo;
		private String cmpTrans;
		private String cmpPayTrans;
		private String cmpEntityType;
		private String cmpEntityNo;
		private String cmpEntityName;
		private String cmpAmt;
		private Date createDtFrom;
		private Date createDtTo;
		public String getCmpIcNo() {
			return cmpIcNo;
		}
		public void setCmpIcNo(String cmpIcNo) {
			this.cmpIcNo = cmpIcNo;
		}
		public String getCmpNo() {
			return cmpNo;
		}
		public void setCmpNo(String cmpNo) {
			this.cmpNo = cmpNo;
		}
		public String getcmpTrans() {
			return cmpTrans;
		}
		public void setcmpTrans(String cmpTrans) {
			this.cmpTrans = cmpTrans;
		}
		public String getcmpPayTrans() {
			return cmpPayTrans;
		}
		public void setcmpPayTrans(String cmpPayTrans) {
			this.cmpPayTrans = cmpPayTrans;
		}
		public String getCmpEntityType() {
			return cmpEntityType;
		}
		public void setCmpEntityType(String cmpEntityType) {
			this.cmpEntityType = cmpEntityType;
		}
		public String getCmpEntityNo() {
			return cmpEntityNo;
		}
		public void setCmpEntityNo(String cmpEntityNo) {
			this.cmpEntityNo = cmpEntityNo;
		}
		public String getCmpEntityName() {
			return cmpEntityName;
		}
		public void setCmpEntityName(String cmpEntityName) {
			this.cmpEntityName = cmpEntityName;
		}
		public String getCmpAmt() {
			return cmpAmt;
		}
		public void setCmpAmt(String cmpAmt) {
			this.cmpAmt = cmpAmt;
		}
		public Date getCreateDtFrom() {
			return createDtFrom;
		}

		public void setCreateDtFrom(Date createDtFrom) {
			this.createDtFrom = createDtFrom;
		}

		public Date getCreateDtTo() {
			return createDtTo;
		}

		public void setCreateDtTo(Date createDtTo) {
			this.createDtTo = createDtTo;
		}
	}
}
