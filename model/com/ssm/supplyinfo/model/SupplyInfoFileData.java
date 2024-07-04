package com.ssm.supplyinfo.model;

// Generated Aug 10, 2015 9:25:57 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

/**
 * LlpFileData generated by hbm2java
 */
@Entity
@Table(name = "supply_info_file_data")
public class SupplyInfoFileData implements java.io.Serializable {

	private long fileDataId;
	private String fileDataType;
	private byte[] fileData;
	private Date createDt;
	private String createBy;

	public SupplyInfoFileData() {
	}

	public SupplyInfoFileData(long fileDataId, Date createDt, String createBy) {
		this.fileDataId = fileDataId;
		this.createDt = createDt;
		this.createBy = createBy;
	}

	public SupplyInfoFileData(long fileDataId, String fileDataType, byte[] fileData,
			Date createDt, String createBy) {
		this.fileDataId = fileDataId;
		this.fileDataType = fileDataType;
		this.fileData = fileData;
		this.createDt = createDt;
		this.createBy = createBy;
	}

	@Id
	@Column(name = "file_data_id", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long getFileDataId() {
		return this.fileDataId;
	}

	public void setFileDataId(long fileDataId) {
		this.fileDataId = fileDataId;
	}

	@Column(name = "file_data_type", length = 25)
	public String getFileDataType() {
		return this.fileDataType;
	}

	public void setFileDataType(String fileDataType) {
		this.fileDataType = fileDataType;
	}

	@Column(name = "file_data")
	public byte[] getFileData() {
		return this.fileData;
	}

	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
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

}
