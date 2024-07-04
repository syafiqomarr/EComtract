package com.ssm.llp.ezbiz.model;

// Generated Aug 15, 2016 3:52:32 PM by Hibernate Tools 3.4.0.CR1

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

import com.ssm.base.common.util.DateUtil;
import com.ssm.llp.base.common.model.LlpFileData;
import com.ssm.webis.param.BizProfileDetResp;

/**
 * RobFormB generated by hbm2java
 */
@Entity
@Audited
@Table(name = "rob_form_b")
public class RobFormB implements java.io.Serializable {

	private String robFormBCode;
	private String brNo;
	private String checkDigit;
	private String bizName;
	private String status;
	private String bizType;
//	private Long businessInfoDataId;
//	private Long formBDataId;
//	private Long supportingDocId;
	private String isHasSupportingDoc;
	private String isBuyInfo;
	private String isPayCmp;
	private Boolean isB1 = Boolean.FALSE;
	private Boolean isB2 = Boolean.FALSE;
	private Boolean isB3 = Boolean.FALSE;
	private Boolean isB4 = Boolean.FALSE;
	private String cmpNo;
	private Date submitDt;
	private Date resubmitDt;
	private Date paymentDt;
	private Date bizExpDt;
	private Date createDt;
	private String createBy;
	private Date updateDt;
	private String updateBy;
	private long rowVersion;

	private Date b3AmmendmendDt;
	private Date b4AmmendmendDt;
	private double cmpAmt;
	private double bizInfoAmt;
	private double totalAmt;
	private double branchesAmt;
	private double gstAmt;
	
	private String approveRejectNotes;
	private Date approveRejectDt;
	private String prosessingBranch;
	private String approveRejectBranch;
	private String approveRejectBy;
	private String isFromSSMPc =  com.ssm.llp.base.common.Parameter.YES_NO_no;
	
	
	

	private LlpFileData formBData;
	private LlpFileData supportingDocData;
	private LlpFileData certFileData;
	private LlpFileData businessInfoData;
	private LlpFileData cmpNoticeFileData;
	
	
	private BizProfileDetResp bizProfileDetResp;
	private RobFormB1 robFormB1;
	private RobFormB2 robFormB2;
	private List<RobFormB3> listRobFormB3;
	private List<RobFormB4> listRobFormB4;
	private List<RobFormOwnerVerification> listRobFormOwnerVerification;
	private String hashBizInfo;
	
	//ALL TRANSIENT START
	
	private String queryAnswer;
	private List<RobFormNotes> listRobFormNotes = new ArrayList<RobFormNotes>(0);
	

	public RobFormB() {
	}

	public RobFormB(String robFormBCode, Date createDt, String createBy, Date updateDt, String updateBy) {
		this.robFormBCode = robFormBCode;
		this.createDt = createDt;
		this.createBy = createBy;
		this.updateDt = updateDt;
		this.updateBy = updateBy;
	}

	public RobFormB(String robFormBCode, String brNo, String checkDigit, String bizName, String status, Date createDt, String createBy,
			Date updateDt, String updateBy, double cmpAmt, double bizInfoAmt, double totalAmt, Long businessInfoDataId, Long formBDataId,
			Long supportingDocId, String isHasSupportingDoc, String isBuyInfo, String isPayCmp, Boolean isB1, Boolean isB2, Boolean isB3, String cmpNo,
			double gstAmt, Date submitDt, Date resubmitDt, Date paymentDt, Date approveRejectDt, String approveRejectNotes) {
		this.robFormBCode = robFormBCode;
		this.brNo = brNo;
		this.checkDigit = checkDigit;
		this.bizName = bizName;
		this.status = status;
		this.createDt = createDt;
		this.createBy = createBy;
		this.updateDt = updateDt;
		this.updateBy = updateBy;
		this.cmpAmt = cmpAmt;
		this.bizInfoAmt = bizInfoAmt;
		this.totalAmt = totalAmt;
		this.isHasSupportingDoc = isHasSupportingDoc;
		this.isBuyInfo = isBuyInfo;
		this.isPayCmp = isPayCmp;
		this.isB1 = isB1;
		this.isB2 = isB2;
		this.isB3 = isB3;
		this.cmpNo = cmpNo;
		this.gstAmt = gstAmt;
		this.submitDt = submitDt;
		this.resubmitDt = resubmitDt;
		this.paymentDt = paymentDt;
		this.approveRejectDt = approveRejectDt;
		this.approveRejectNotes = approveRejectNotes;
	}

	@Id
    @GenericGenerator(name="ref_no", strategy="com.ssm.llp.base.hibernate.LlpIdGenerator", 
    parameters={@Parameter(name = "genCode", value = "ROB_FORM_B_RUNNING_NO"),
    			@Parameter(name = "fieldCode", value = "EB"),
    			@Parameter(name = "moduleCode", value = "-B"),
    			@Parameter(name = "yearMonthDay", value = "yyyyMMdd"),
    			@Parameter(name = "lastNoPattern", value = "00000")})
    @GeneratedValue(generator="ref_no")
	@Column(name = "rob_form_b_code", unique = true, nullable = false, length = 25)
	public String getRobFormBCode() {
		return this.robFormBCode;
	}

	public void setRobFormBCode(String robFormBCode) {
		this.robFormBCode = robFormBCode;
	}

	@Column(name = "br_no", length = 20)
	public String getBrNo() {
		return this.brNo;
	}

	public void setBrNo(String brNo) {
		this.brNo = brNo;
	}

	@Column(name = "check_digit", length = 1)
	public String getCheckDigit() {
		return this.checkDigit;
	}

	public void setCheckDigit(String checkDigit) {
		this.checkDigit = checkDigit;
	}

	@Column(name = "biz_name", length = 100)
	public String getBizName() {
		return this.bizName;
	}

	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	@Column(name = "status", length = 10)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_dt", nullable = false, length = 3594)
	public Date getCreateDt() {
		return this.createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	@Column(name = "create_by", nullable = false, length = 50)
	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_dt", nullable = false, length = 3594)
	public Date getUpdateDt() {
		return this.updateDt;
	}

	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}

	@Column(name = "update_by", nullable = false, length = 50)
	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	@Column(name = "cmp_amt", precision = 16)
	public double getCmpAmt() {
		return this.cmpAmt;
	}

	public void setCmpAmt(double cmpAmt) {
		this.cmpAmt = cmpAmt;
	}

	@Column(name = "biz_info_amt", precision = 16)
	public double getBizInfoAmt() {
		return this.bizInfoAmt;
	}

	public void setBizInfoAmt(double bizInfoAmt) {
		this.bizInfoAmt = bizInfoAmt;
	}

	@Column(name = "total_amt", precision = 16)
	public double getTotalAmt() {
		return this.totalAmt;
	}

	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}

//	@Column(name = "business_info_data_id")
//	public Long getBusinessInfoDataId() {
//		return this.businessInfoDataId;
//	}
//
//	public void setBusinessInfoDataId(Long businessInfoDataId) {
//		this.businessInfoDataId = businessInfoDataId;
//	}

//	@Column(name = "form_b_data_id")
//	public Long getFormBDataId() {
//		return this.formBDataId;
//	}
//
//	public void setFormBDataId(Long formBDataId) {
//		this.formBDataId = formBDataId;
//	}

//	@Column(name = "supporting_doc_id")
//	public Long getSupportingDocId() {
//		return this.supportingDocId;
//	}
//
//	public void setSupportingDocId(Long supportingDocId) {
//		this.supportingDocId = supportingDocId;
//	}

	@Column(name = "is_has_supporting_doc", length = 1)
	public String getIsHasSupportingDoc() {
		return this.isHasSupportingDoc;
	}

	public void setIsHasSupportingDoc(String isHasSupportingDoc) {
		this.isHasSupportingDoc = isHasSupportingDoc;
	}

	@Column(name = "is_buy_info", length = 1)
	public String getIsBuyInfo() {
		return this.isBuyInfo;
	}

	public void setIsBuyInfo(String isBuyInfo) {
		this.isBuyInfo = isBuyInfo;
	}

	@Column(name = "is_pay_cmp", length = 1)
	public String getIsPayCmp() {
		return this.isPayCmp;
	}

	public void setIsPayCmp(String isPayCmp) {
		this.isPayCmp = isPayCmp;
	}

	@Column(name = "is_b1")
	public Boolean getIsB1() {
		return this.isB1;
	}

	public void setIsB1(Boolean isB1) {
		this.isB1 = isB1;
	}

	@Column(name = "is_b2")
	public Boolean getIsB2() {
		return this.isB2;
	}

	public void setIsB2(Boolean isB2) {
		this.isB2 = isB2;
	}

	@Column(name = "is_b3")
	public Boolean getIsB3() {
		return this.isB3;
	}

	public void setIsB3(Boolean isB3) {
		this.isB3 = isB3;
	}
	
	@Column(name = "is_b4")
	public Boolean getIsB4() {
		return this.isB4;
	}

	public void setIsB4(Boolean isB4) {
		this.isB4 = isB4;
	}

	@Column(name = "cmp_no", length = 50)
	public String getCmpNo() {
		return this.cmpNo;
	}

	public void setCmpNo(String cmpNo) {
		this.cmpNo = cmpNo;
	}

	@Column(name = "gst_amt", precision = 16)
	public double getGstAmt() {
		return this.gstAmt;
	}

	public void setGstAmt(double gstAmt) {
		this.gstAmt = gstAmt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "submit_dt", length = 3594)
	public Date getSubmitDt() {
		return this.submitDt;
	}

	public void setSubmitDt(Date submitDt) {
		this.submitDt = submitDt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "resubmit_dt", length = 3594)
	public Date getResubmitDt() {
		return this.resubmitDt;
	}

	public void setResubmitDt(Date resubmitDt) {
		this.resubmitDt = resubmitDt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "payment_dt", length = 3594)
	public Date getPaymentDt() {
		return paymentDt;
	}

	public void setPaymentDt(Date paymentDt) {
		this.paymentDt = paymentDt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "biz_exp_dt",length = 2052)
	public Date getBizExpDt() {
		return bizExpDt;
	}

	public void setBizExpDt(Date bizExpDt) {
		this.bizExpDt = bizExpDt;
	}

	@Transient
	public BizProfileDetResp getBizProfileDetResp() {
		return bizProfileDetResp;
	}

	public void setBizProfileDetResp(BizProfileDetResp bizProfileDetResp) {
		this.bizProfileDetResp = bizProfileDetResp;
	}

	@Transient
	public RobFormB1 getRobFormB1() {
		return robFormB1;
	}

	public void setRobFormB1(RobFormB1 robFormB1) {
		this.robFormB1 = robFormB1;
	}

	@Transient
	public RobFormB2 getRobFormB2() {
		return robFormB2;
	}

	public void setRobFormB2(RobFormB2 robFormB2) {
		this.robFormB2 = robFormB2;
	}

	@Transient
	public List<RobFormB3> getListRobFormB3() {
		return listRobFormB3;
	}

	public void setListRobFormB3(List<RobFormB3> listRobFormB3) {
		this.listRobFormB3 = listRobFormB3;
	}

	@Transient
	public List<RobFormOwnerVerification> getListRobFormOwnerVerification() {
		return listRobFormOwnerVerification;
	}

	public void setListRobFormOwnerVerification(List<RobFormOwnerVerification> listRobFormOwnerVerification) {
		this.listRobFormOwnerVerification = listRobFormOwnerVerification;
	}

	
	@Transient
	public int getNewBranchCount() {
		List<RobFormB3> listBranch = getListRobFormB3();
		int branchCount = 0;
		for (int i = 0;listBranch!=null && i < listBranch.size(); i++) {
			RobFormB3 b3Tmp = listBranch.get(i);
			if(com.ssm.llp.base.common.Parameter.ROB_FORM_B3_AMENDMENT_TYPE_NEW.equals(b3Tmp.getAmmendmentType())){
				branchCount++;
			}
		}
		return branchCount;
	}

	@Column(name = "branches_amt", precision = 16)
	public double getBranchesAmt() {
		return branchesAmt;
	}

	public void setBranchesAmt(double branchesAmt) {
		this.branchesAmt = branchesAmt;
	}

	@Transient
	public int getBalanceYear() {
		
		Date submisionDt = new Date();
		if(getSubmitDt()!=null){
			submisionDt = getSubmitDt();
		}
		if(getResubmitDt()!=null){
			submisionDt = getResubmitDt();
		}
		if(submisionDt.after(getBizExpDt())){
			return 1;
		}
		
		Calendar calDt = Calendar.getInstance();
		calDt.setTime(submisionDt);// 
		
		int totalBalYear = 0;
		while(calDt.getTime().before(getBizExpDt())){
			totalBalYear = totalBalYear+1;
			calDt.add(Calendar.YEAR, 1);
			if(totalBalYear==10){
				break;
			}
		}
//		
		return totalBalYear;
	}
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "robFormCode")
	@OrderBy("robFormNoteId ASC")
	public List<RobFormNotes> getListRobFormNotes() {
		return listRobFormNotes;
	}

	public void setListRobFormNotes(List<RobFormNotes> listRobFormNotes) {
		this.listRobFormNotes = listRobFormNotes;
	}

	@Transient
	public String getQueryAnswer() {
		return queryAnswer;
	}

	public void setQueryAnswer(String queryAnswer) {
		this.queryAnswer = queryAnswer;
	}

	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="business_info_data_id")
	@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
	public LlpFileData getBusinessInfoData() {
		return businessInfoData;
	}

	public void setBusinessInfoData(LlpFileData businessInfoData) {
		this.businessInfoData = businessInfoData;
	}
	

	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="form_b_data_id")
	@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
	public LlpFileData getFormBData() {
		return formBData;
	}

	public void setFormBData(LlpFileData formBData) {
		this.formBData = formBData;
	}


	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="supporting_doc_id")
	@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
	public LlpFileData getSupportingDocData() {
		return supportingDocData;
	}

	public void setSupportingDocData(LlpFileData supportingDocData) {
		this.supportingDocData = supportingDocData;
	}

	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="cert_file_data_id")
	@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
	public LlpFileData getCertFileData() {
		return certFileData;
	}

	public void setCertFileData(LlpFileData certFileData) {
		this.certFileData = certFileData;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "b3_ammendmend_dt", length = 2052)
	public Date getB3AmmendmendDt() {
		return b3AmmendmendDt;
	}

	public void setB3AmmendmendDt(Date b3AmmendmendDt) {
		this.b3AmmendmendDt = b3AmmendmendDt;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "b4_ammendmend_dt", length = 2052)
	public Date getB4AmmendmendDt() {
		return b4AmmendmendDt;
	}

	public void setB4AmmendmendDt(Date b4AmmendmendDt) {
		this.b4AmmendmendDt = b4AmmendmendDt;
	}
	
	@Transient
	public String getBrNoWithCheckDigit(){
		return getBrNo()+"-"+getCheckDigit();
	}


	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="cmp_notice_file_id")
	@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
	public LlpFileData getCmpNoticeFileData() {
		return cmpNoticeFileData;
	}

	public void setCmpNoticeFileData(LlpFileData cmpNoticeFileData) {
		this.cmpNoticeFileData = cmpNoticeFileData;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "approve_reject_dt")
	public Date getApproveRejectDt() {
		return approveRejectDt;
	}

	public void setApproveRejectDt(Date approveRejectDt) {
		this.approveRejectDt = approveRejectDt;
	}
	
	@Column(name = "approve_reject_notes")
	public String getApproveRejectNotes() {
		return approveRejectNotes;
	}

	public void setApproveRejectNotes(String approveRejectNotes) {
		this.approveRejectNotes = approveRejectNotes;
	}
	
	@Column(name = "prosessing_branch", length = 5)
	public String getProsessingBranch() {
		return prosessingBranch;
	}

	public void setProsessingBranch(String prosessingBranch) {
		this.prosessingBranch = prosessingBranch;
	}

	@Column(name = "hash_biz_info", length = 50)
	public String getHashBizInfo() {
		return hashBizInfo;
	}

	public void setHashBizInfo(String hashBizInfo) {
		this.hashBizInfo = hashBizInfo;
	}
	
	@Version
	@Column(name = "row_version")
	public long getRowVersion() {
		return rowVersion;
	}

	public void setRowVersion(long rowVersion) {
		this.rowVersion = rowVersion;
	}


	@Column(name = "approve_reject_branch")
	public String getApproveRejectBranch() {
		return approveRejectBranch;
	}

	public void setApproveRejectBranch(String approveRejectBranch) {
		this.approveRejectBranch = approveRejectBranch;
	}

	@Column(name = "approve_reject_by")
	public String getApproveRejectBy() {
		return approveRejectBy;
	}

	public void setApproveRejectBy(String approveRejectBy) {
		this.approveRejectBy = approveRejectBy;
	}
	
	@Column(name = "is_from_ssm_pc") 
	public String getIsFromSSMPc() {
		return isFromSSMPc;
	}

	public void setIsFromSSMPc(String isFromSSMPc) {
		this.isFromSSMPc = isFromSSMPc;
	}

	@Transient
	public List<RobFormB4> getListRobFormB4() {
		return listRobFormB4;
	}

	public void setListRobFormB4(List<RobFormB4> listRobFormB4) {
		this.listRobFormB4 = listRobFormB4;
	}

	@Column(name = "biz_type") 
	public String getBizType() {
		return bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
}
