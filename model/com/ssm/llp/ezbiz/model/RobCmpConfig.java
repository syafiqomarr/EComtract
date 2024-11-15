package com.ssm.llp.ezbiz.model;

// Generated Sep 27, 2016 8:44:09 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RobCmpConfig generated by hbm2java
 */
@Entity
@Table(name = "rob_cmp_config")
public class RobCmpConfig implements java.io.Serializable {

	private long robCmpConfigId;
	private String formType;
	private int dayDurationFrom;
	private int dayDurationTo;
	private String sectionCode;
	private double cmpAmount;
	private String createBy;
	private Date createDt;
	private String updateBy;
	private Date updateDt;

	public RobCmpConfig() {
	}

	public RobCmpConfig(long robCmpConfigId, String formType, int dayDurationFrom, int dayDurationTo, String sectionCode, String createBy,
			Date createDt, String updateBy, Date updateDt) {
		this.robCmpConfigId = robCmpConfigId;
		this.formType = formType;
		this.dayDurationFrom = dayDurationFrom;
		this.dayDurationTo = dayDurationTo;
		this.sectionCode = sectionCode;
		this.createBy = createBy;
		this.createDt = createDt;
		this.updateBy = updateBy;
		this.updateDt = updateDt;
	}

	public RobCmpConfig(long robCmpConfigId, String formType, int dayDurationFrom, int dayDurationTo, String sectionCode, double cmpAmount,
			String createBy, Date createDt, String updateBy, Date updateDt) {
		this.robCmpConfigId = robCmpConfigId;
		this.formType = formType;
		this.dayDurationFrom = dayDurationFrom;
		this.dayDurationTo = dayDurationTo;
		this.sectionCode = sectionCode;
		this.cmpAmount = cmpAmount;
		this.createBy = createBy;
		this.createDt = createDt;
		this.updateBy = updateBy;
		this.updateDt = updateDt;
	}

	@Id
	@Column(name = "rob_cmp_config_id", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long getRobCmpConfigId() {
		return this.robCmpConfigId;
	}

	public void setRobCmpConfigId(long robCmpConfigId) {
		this.robCmpConfigId = robCmpConfigId;
	}

	@Column(name = "form_type", nullable = false, length = 10)
	public String getFormType() {
		return this.formType;
	}

	public void setFormType(String formType) {
		this.formType = formType;
	}

	@Column(name = "day_duration_from", nullable = false)
	public int getDayDurationFrom() {
		return this.dayDurationFrom;
	}

	public void setDayDurationFrom(int dayDurationFrom) {
		this.dayDurationFrom = dayDurationFrom;
	}

	@Column(name = "day_duration_to", nullable = false)
	public int getDayDurationTo() {
		return this.dayDurationTo;
	}

	public void setDayDurationTo(int dayDurationTo) {
		this.dayDurationTo = dayDurationTo;
	}

	@Column(name = "section_code", nullable = false, length = 30)
	public String getSectionCode() {
		return this.sectionCode;
	}

	public void setSectionCode(String sectionCode) {
		this.sectionCode = sectionCode;
	}

	@Column(name = "cmp_amount", precision = 16)
	public double getCmpAmount() {
		return this.cmpAmount;
	}

	public void setCmpAmount(double cmpAmount) {
		this.cmpAmount = cmpAmount;
	}

	@Column(name = "create_by", nullable = false, length = 50)
	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_dt", nullable = false, length = 3594)
	public Date getCreateDt() {
		return this.createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	@Column(name = "update_by", nullable = false, length = 50)
	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_dt", nullable = false, length = 3594)
	public Date getUpdateDt() {
		return this.updateDt;
	}

	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}

}
