package com.ssm.llp.base.common.model;

// Generated Dec 6, 2012 1:24:13 PM by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.envers.Audited;

import com.ssm.llp.ezbiz.model.RobPaymentCreditNote;

/**
 * LlpPaymentTransaction generated by hbm2java
 */
@Entity
@Table(name = "rob_payment_transaction")
@Audited
public class LlpPaymentTransaction implements java.io.Serializable {

	private String transactionId;
	private Date requestDt;
	private String paymentMode;
	private String paymentDetail;
	private double amount;
	private String transactionType;
	private String payerId;
	private String payerName;
	private String payerAddr;
	private String status;
	private Date createDt;
	private String createBy;
	private Date updateDt;
	private String updateBy;
	private String appRefNo;

	private String approvalCode;
	private double gstAmt;
	private String remark;

	private List<LlpPaymentTransactionDetail> llpPaymentTransactionDetails = new ArrayList<LlpPaymentTransactionDetail>(
			0);
	private LlpPaymentReceipt llpPaymentReceipt;
	private RobPaymentCreditNote robPaymentCreditNote;

	public LlpPaymentTransaction() {
	}

	public LlpPaymentTransaction(String transactionId, Date requestDt, String paymentMode, double amount,
			String transactionType, String payerId, String payerName, String status, Date createDt, String createBy, Date updateDt,
			String updateBy, String appRefNo) {
		this.transactionId = transactionId;
		this.requestDt = requestDt;
		this.paymentMode = paymentMode;
		this.amount = amount;
		this.transactionType = transactionType;
		this.payerId = payerId;
		this.payerName = payerName;
		this.status = status;
		this.createDt = createDt;
		this.createBy = createBy;
		this.updateDt = updateDt;
		this.updateBy = updateBy;
		this.appRefNo = appRefNo;

	}

	public LlpPaymentTransaction(String transactionId, Date requestDt, String paymentMode, String paymentDetail,
			double amount, String transactionType, String payerId, String payerName, String status, Date createDt, String createBy, Date updateDt,
			String updateBy, String appRefNo) {
		this.transactionId = transactionId;
		this.requestDt = requestDt;
		this.paymentMode = paymentMode;
		this.paymentDetail = paymentDetail;
		this.amount = amount;
		this.transactionType = transactionType;
		this.payerId = payerId;
		this.payerName = payerName;
		this.status = status;
		this.createDt = createDt;
		this.createBy = createBy;
		this.updateDt = updateDt;
		this.updateBy = updateBy;
		this.appRefNo = appRefNo;
//		this.llpPaymentTransactionDetails = llpPaymentTransactionDetails;
//		this.llpPaymentReceipts = llpPaymentReceipts;
	}

	@Id
	@GenericGenerator(name = "transaction_id", strategy = "com.ssm.llp.base.hibernate.LlpIdGenerator", parameters = {
			@Parameter(name = "genCode", value = "PAYMENT_TRANS_RUNNING_NO"),
			@Parameter(name = "fieldCode", value = "E"), @Parameter(name = "moduleCode", value = ""),
			@Parameter(name = "yearMonthDay", value = "yyyyMMdd"),
			@Parameter(name = "lastNoPattern", value = "00000") })
	@GeneratedValue(generator = "transaction_id")
	@Column(name = "transaction_id", length = 50)
	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "request_dt", nullable = false, length = 3594)
	public Date getRequestDt() {
		return this.requestDt;
	}

	public void setRequestDt(Date requestDt) {
		this.requestDt = requestDt;
	}

	@Column(name = "payment_mode", length = 50)
	public String getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	@Column(name = "payment_detail")
	public String getPaymentDetail() {
		return this.paymentDetail;
	}

	public void setPaymentDetail(String paymentDetail) {
		this.paymentDetail = paymentDetail;
	}

	@Column(name = "amount", nullable = false, precision = 16, scale = 2)
	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Column(name = "transaction_type", nullable = false, length = 2)
	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	@Column(name = "payer_id", nullable = false, length = 50)
	public String getPayerId() {
		return this.payerId;
	}

	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}

	@Column(name = "payer_name", nullable = false)
	public String getPayerName() {
		return this.payerName;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	@Column(name = "status", nullable = false, length = 2)
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

	@Column(name = "app_ref_no", length = 50)
	public String getAppRefNo() {
		return appRefNo;
	}

	public void setAppRefNo(String appRefNo) {
		this.appRefNo = appRefNo;
	}

	@Column(name = "approval_code", length = 50)
	public String getApprovalCode() {
		return approvalCode;
	}

	public void setApprovalCode(String approvalCode) {
		this.approvalCode = approvalCode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "transactionId")
	public List<LlpPaymentTransactionDetail> getLlpPaymentTransactionDetails() {
		return this.llpPaymentTransactionDetails;
	}

//
	public void setLlpPaymentTransactionDetails(List<LlpPaymentTransactionDetail> llpPaymentTransactionDetails) {
		this.llpPaymentTransactionDetails = llpPaymentTransactionDetails;
	}

	@Column(name = "gst_amt", precision = 16, scale = 2)
	public double getGstAmt() {
		return gstAmt;
	}

	public void setGstAmt(double gstAmt) {
		this.gstAmt = gstAmt;
	}

	@Column(name = "payer_addr", length = 500)
	public String getPayerAddr() {
		return payerAddr;
	}

	public void setPayerAddr(String payerAddr) {
		this.payerAddr = payerAddr;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "transaction_id", referencedColumnName = "transaction_id", insertable = false, updatable = false, nullable = true)
	public LlpPaymentReceipt getLlpPaymentReceipt() {
		return llpPaymentReceipt;
	}

	public void setLlpPaymentReceipt(LlpPaymentReceipt llpPaymentReceipt) {
		this.llpPaymentReceipt = llpPaymentReceipt;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "transaction_id", referencedColumnName = "cn_transaction_no", insertable = false, updatable = false, nullable = true)
	public RobPaymentCreditNote getRobPaymentCreditNote() {
		return robPaymentCreditNote;
	}

	public void setRobPaymentCreditNote(RobPaymentCreditNote robPaymentCreditNote) {
		this.robPaymentCreditNote = robPaymentCreditNote;
	}

	@Column(name = "remark", length = 200)
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
