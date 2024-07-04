package com.ssm.common.mobile;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.extensions.markup.html.repeater.data.table.NavigatorLabel;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.navigation.paging.PagingNavigator;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;

import com.ssm.base.common.code.CommonConstant;
import com.ssm.ezbiz.service.RobRenewalService;
import com.ssm.llp.base.common.sec.UserEnvironmentHelper;
import com.ssm.llp.base.common.service.LlpParametersService;
import com.ssm.llp.base.page.table.SSMDataView;
import com.ssm.llp.base.page.table.SSMSessionSortableDataProvider;
import com.ssm.llp.base.wicket.component.SSMLabel;
import com.ssm.llp.mod1.model.LlpUserProfile;
import com.ssm.llp.mod1.service.LlpUserProfileService;
import com.ssm.webis.param.BusinessInfo;

public class ListRobRenewalPageMobile extends SecBasePageMobile {

	@SpringBean(name = "LlpParametersService")
	private LlpParametersService llpParametersService;
	
	@SpringBean(name = "LlpUserProfileService")
	private LlpUserProfileService llpUserProfileService;
	
	@SpringBean(name = "RobRenewalService")
	private RobRenewalService robRenewalService;

	@SuppressWarnings({ "unchecked", "serial", "rawtypes", "unused" })
	public ListRobRenewalPageMobile() {

		try {
			String icNo = "";
			if(!UserEnvironmentHelper.isInternalUser()){
				LlpUserProfile profile = llpUserProfileService.findProfileInfoByUserId(UserEnvironmentHelper.getLoginName());
				if(profile!=null){
					icNo = profile.getIdNo();
				}
			}
			List<BusinessInfo> businessInfoListTmp = robRenewalService.findListRobRenewalByIcWS(icNo);
			List<BusinessInfo> businessInfoList  = new ArrayList<BusinessInfo>();
			for (int i = 0; i < businessInfoListTmp.size(); i++) {
				if(!businessInfoListTmp.get(i).getCanRenew().equals(CommonConstant.NO)){
					businessInfoList.add(businessInfoListTmp.get(i));
				}
			}
			
			SSMSessionSortableDataProvider dp = new SSMSessionSortableDataProvider("brNo", businessInfoList);

			final SSMDataView<BusinessInfo> dataView = new SSMDataView<BusinessInfo>("sorting", dp) {

				protected void populateItem(final Item<BusinessInfo> item) {
					BusinessInfo businessInfo = item.getModelObject();

					item.add(new SSMLabel("brNo", businessInfo.getBrNo() + "-" + businessInfo.getChkDigit()));
					item.add(new SSMLabel("brName", businessInfo.getBizName()));
					item.add(new SSMLabel("expDate", businessInfo.getEndDate()));

					item.add(new Link("editRenew", item.getDefaultModel()) {
						public void onClick() {
							BusinessInfo businessInfoSelected = (BusinessInfo) getModelObject();
							setResponsePage(new EditRobRenewalPageMobile(businessInfoSelected));
						}
					});

					item.add(AttributeModifier.replace("class", new AbstractReadOnlyModel<String>() {
						private static final long serialVersionUID = 1L;

						@Override
						public String getObject() {
							return (item.getIndex() % 2 == 1) ? "even" : "odd";
						}
					}));

				}

			};

			add(dataView);
			add(new PagingNavigator("navigator", dataView));
			add(new NavigatorLabel("navigatorLabel", dataView));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public String getPageTitle() {
		return "page.title.mybiz.ownBizRenewal";
	}
}