package com.ssm.llp.ezbiz.model;

// Generated Jan 14, 2016 10:52:49 AM by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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

import org.apache.wicket.markup.html.form.upload.FileUpload;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

import com.ssm.llp.base.common.model.LlpFileData;

/**
 * RobFormA generated by hbm2java
 */
@Entity
@Table(name = "ext_user_pairing_info")
public class ExtUserPairingInfo implements java.io.Serializable {

	private long extUserPairingInfoId;
	private String extUserRefNo;
	private String ezbizId;
	private String extToken;
	private String ezbizToken;

	private String status;
	private Date createDt;
	private String createBy;
	private Date updateDt;
	private String updateBy;

	public ExtUserPairingInfo() {
	}

	@Id
	@Column(name = "ext_user_pairing_info_id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getExtUserPairingInfoId() {
		return extUserPairingInfoId;
	}

	public void setExtUserPairingInfoId(long extUserPairingInfoId) {
		this.extUserPairingInfoId = extUserPairingInfoId;
	}

	@Column(name = "ext_user_ref_no", length = 50)
	public String getExtUserRefNo() {
		return extUserRefNo;
	}

	public void setExtUserRefNo(String extUserRefNo) {
		this.extUserRefNo = extUserRefNo;
	}

	@Column(name = "ezbiz_id", length = 50)
	public String getEzbizId() {
		return ezbizId;
	}

	public void setEzbizId(String ezbizId) {
		this.ezbizId = ezbizId;
	}

	@Column(name = "ext_token", length = 1000)
	public String getExtToken() {
		return extToken;
	}

	public void setExtToken(String extToken) {
		this.extToken = extToken;
	}

	@Column(name = "ezbiz_token", length = 100)
	public String getEzbizToken() {
		return ezbizToken;
	}

	public void setEzbizToken(String ezbizToken) {
		this.ezbizToken = ezbizToken;
	}

	@Column(name = "status", nullable = false, length = 10)
	public String getStatus() {
		return status;
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

}
