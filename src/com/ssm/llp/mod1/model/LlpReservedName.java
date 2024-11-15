package com.ssm.llp.mod1.model;

// Generated Nov 30, 2012 9:49:47 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.envers.Audited;

/**
 * LlpReservedName generated by hbm2java
 */
@Entity
@Table(name = "rob_reserved_name")
@Audited
public class LlpReservedName implements java.io.Serializable {

	private long idReservedName;
	private String refNo;
	private String applyLlpName;
	private String llpNo;
	private Date resultDate;
	private Date expNameDate;
	private String regType;
	private String status;
	private String profAuthOrg;
	private String profAuthLetterRefNo;
	private Date profAuthLetterDate;
	private String profLetterPurpose;
	private String profLetterSign;
	private String profRemark;
	private Date createDt;
	private String createBy;
	private Date updateDt;
	private String updateBy;
	private String lodgeBy;
	private String officerRemark;
	private String profBodyType;
	private String nameSearch;
	private String conversionType;
	private String conversionNo;
	private String clarifySingleLetter;
	private String clarifyMeaning;
	private Boolean declareChk = Boolean.FALSE;	
	private String conversionName;
	private Boolean authorizationChk = Boolean.FALSE;	

	public LlpReservedName() {
	}

	public LlpReservedName(long idReservedName, String refNo,
			String applyLlpName, Date resultDate, Date expNameDate,
			String purposeApply, String status, Date createDt, String createBy,
			Date updateDt, String updateBy) {
		this.idReservedName = idReservedName;
		this.refNo = refNo;
		this.applyLlpName = applyLlpName;
		this.resultDate = resultDate;
		this.expNameDate = expNameDate;
		this.regType = regType;
		this.status = status;
		this.createDt = createDt;
		this.createBy = createBy;
		this.updateDt = updateDt;
		this.updateBy = updateBy;
	}

	public LlpReservedName(long idReservedName, String refNo,
			String applyLlpName, String llpNo, Date resultDate,
			Date expNameDate, String purposeApply, String extraExplanation,
			String status, String llpCompanyType, String profAuthOrg,
			String profAuthLetterRefNo, Date profAuthLetterDate,
			String profLetterPurpose, String profLetterSign, String profRemark,
			Date createDt, String createBy, Date updateDt, String updateBy,String clarifySingleLetter, String clarifyMeaning) {
		this.idReservedName = idReservedName;
		this.refNo = refNo;
		this.applyLlpName = applyLlpName;
		this.llpNo = llpNo;
		this.resultDate = resultDate;
		this.expNameDate = expNameDate;
		this.regType = regType;
		this.status = status;
		this.profAuthOrg = profAuthOrg;
		this.profAuthLetterRefNo = profAuthLetterRefNo;
		this.profAuthLetterDate = profAuthLetterDate;
		this.profLetterPurpose = profLetterPurpose;
		this.profLetterSign = profLetterSign;
		this.profRemark = profRemark;
		this.createDt = createDt;
		this.createBy = createBy;
		this.updateDt = updateDt;
		this.updateBy = updateBy;
		this.clarifySingleLetter = clarifySingleLetter;
		this.clarifyMeaning = clarifyMeaning;
	}

	@Column(name = "id_reserved_name", unique = true, nullable = false, updatable=false, insertable=false)
	public long getIdReservedName() {
		return this.idReservedName;
	}

	public void setIdReservedName(long idReservedName) {
		this.idReservedName = idReservedName;
	}

	 @Id
	    @GenericGenerator(name="ref_no", strategy="com.ssm.llp.base.hibernate.LlpIdGenerator", 
	    parameters={@Parameter(name = "genCode", value = "LLP_RESERVED_NAME_RUNNING_NO"),
	    			@Parameter(name = "fieldCode", value = "LLP"),
	    			@Parameter(name = "moduleCode", value = "03"),
	    			@Parameter(name = "yearMonthDay", value = "yyyyMM"),
	    			@Parameter(name = "lastNoPattern", value = "00000")})
	    @GeneratedValue(generator="ref_no")
	    @Column(name = "ref_no", length = 50)
	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	@Column(name = "apply_llp_name", nullable = false, length = 100)
	public String getApplyLlpName() {
		return this.applyLlpName;
	}

	public void setApplyLlpName(String applyLlpName) {
		this.applyLlpName = applyLlpName;
	}

	@Column(name = "llp_no", length = 30)
	public String getLlpNo() {
		return this.llpNo;
	}

	public void setLlpNo(String llpNo) {
		this.llpNo = llpNo;
	}

	@Column(name = "result_date", nullable = false, length = 2052)
	public Date getResultDate() {
		return this.resultDate;
	}

	public void setResultDate(Date resultDate) {
		this.resultDate = resultDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "exp_name_date", nullable = false, length = 2052)
	public Date getExpNameDate() {
		return this.expNameDate;
	}

	public void setExpNameDate(Date expNameDate) {
		this.expNameDate = expNameDate;
	}

	@Column(name = "reg_type", nullable = false, length = 4)
	public String getRegType() {
		return this.regType;
	}

	public void setRegType(String regType) {
		this.regType = regType;
	}


	@Column(name = "status", nullable = false, length = 2)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "prof_auth_org")
	public String getProfAuthOrg() {
		return this.profAuthOrg;
	}

	public void setProfAuthOrg(String profAuthOrg) {
		this.profAuthOrg = profAuthOrg;
	}

	@Column(name = "prof_auth_letter_ref_no")
	public String getProfAuthLetterRefNo() {
		return this.profAuthLetterRefNo;
	}

	public void setProfAuthLetterRefNo(String profAuthLetterRefNo) {
		this.profAuthLetterRefNo = profAuthLetterRefNo;
	}

	@Column(name = "prof_auth_letter_date", length = 4)
	public Date getProfAuthLetterDate() {
		return this.profAuthLetterDate;
	}

	public void setProfAuthLetterDate(Date profAuthLetterDate) {
		this.profAuthLetterDate = profAuthLetterDate;
	}

	@Column(name = "prof_letter_purpose")
	public String getProfLetterPurpose() {
		return this.profLetterPurpose;
	}

	public void setProfLetterPurpose(String profLetterPurpose) {
		this.profLetterPurpose = profLetterPurpose;
	}

	@Column(name = "prof_letter_sign")
	public String getProfLetterSign() {
		return this.profLetterSign;
	}

	public void setProfLetterSign(String profLetterSign) {
		this.profLetterSign = profLetterSign;
	}

	@Column(name = "prof_remark")
	public String getProfRemark() {
		return this.profRemark;
	}

	public void setProfRemark(String profRemark) {
		this.profRemark = profRemark;
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

	@Column(name = "lodge_by", nullable = false, length = 50)
	public String getLodgeBy() {
		return lodgeBy;
	}

	public void setLodgeBy(String lodgeBy) {
		this.lodgeBy = lodgeBy;
	}

	@Column(name = "officer_remark")
	public String getOfficerRemark() {
		return officerRemark;
	}

	public void setOfficerRemark(String officerRemark) {
		this.officerRemark = officerRemark;
	}
	
	@Column(name = "prof_body_type")
	public String getProfBodyType() {
		return profBodyType;
	}

	public void setProfBodyType(String profBodyType) {
		this.profBodyType = profBodyType;
	}

	@Column(name = "name_search")
	public String getNameSearch() {
		return nameSearch;
	}

	public void setNameSearch(String nameSearch) {
		this.nameSearch = nameSearch;
	}

	@Column(name = "conversion_type")
	public String getConversionType() {
		return conversionType;
	}

	public void setConversionType(String conversionType) {
		this.conversionType = conversionType;
	}

	@Column(name = "conversion_no")
	public String getConversionNo() {
		return conversionNo;
	}

	public void setConversionNo(String conversionNo) {
		this.conversionNo = conversionNo;
	}
	
	

	
	@Column(name = "clarify_single_letter")
	public String getClarifySingleLetter() {
		return clarifySingleLetter;
	}

	public void setClarifySingleLetter(String clarifySingleLetter) {
		this.clarifySingleLetter = clarifySingleLetter;
	}
	
	@Column(name = "clarify_meaning")
	public String getClarifyMeaning() {
		return clarifyMeaning;
	}

	public void setClarifyMeaning(String clarifyMeaning) {
		this.clarifyMeaning = clarifyMeaning;
	}
	
	@Transient
	public Boolean getDeclareChk() {
		return declareChk;
	}

	public void setDeclareChk(Boolean declareChk) {
		this.declareChk = declareChk;
	}

	@Column(name = "conversion_name", nullable = true, length = 255)
	public String getConversionName() {
		return conversionName;
	}

	public void setConversionName(String conversionName) {
		this.conversionName = conversionName;
	}
	
	@Transient
	public Boolean getAuthorizationChk() {
		return authorizationChk;
	}

	public void setAuthorizationChk(Boolean authorizationChk) {
		this.authorizationChk = authorizationChk;
	}
	
}
