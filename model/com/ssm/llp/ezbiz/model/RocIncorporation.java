package com.ssm.llp.ezbiz.model;

// Generated Dec 24, 2012 12:07:32 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Rocincorporation generated by hbm2java
 */
@Entity
@Table(name = "rocincorporation")
public class RocIncorporation implements java.io.Serializable {

	private String vchcompanyno;
	private String vchangkauji;
	private String vchcompanyname;
	private String vchbranchcode;
	private String vchcurrency;
	private String chrcompanystatus;
	private String chrcompanytype;
	private String chrlocalforeign;
	private Double mnyauthorisedcapital;
	private Date dtauthoriseddate;
	private Double mnyordnominalvalue;
	private Long intordnumberofshares;
	private Double mnyordanominalvalue;
	private Long intordanumberofshares;
	private Double mnyordbnominalvalue;
	private Long intordbnumberofshares;
	private Double mnyprefnominalvalue;
	private Long intprefnumberofshares;
	private Double mnyprefanominalvalue;
	private Long intprefanumberofshares;
	private Double mnyprefbnominalvalue;
	private Long intprefbnumberofshares;
	private Double mnyothernominalvalue;
	private Long intothernumberofshares;
	private String vchbusinessdescription;
	private String vchcompanycountry;
	private Date dtincorporationdate;
	private Date dtregistrationdate;
	private Date dtdissolveddate;
	private String chrstatusofcompany;
	private String chrwuptype;
	private String vcholdcompanyname;
	private Date dtdateofchange;
	private String vchcreateby;
	private Date dtcreatedate;
	private String vchupdateby;
	private Date dtupdatedate;
	private String flag;
	private String vchipaddress;
	private Double mnytotalpaidcptlfee;

	public RocIncorporation() {
	}

	public RocIncorporation(String vchcompanyno) {
		this.vchcompanyno = vchcompanyno;
	}

	@Id
	@Column(name = "vchcompanyno", unique = true, length = 7)
	public String getVchcompanyno() {
		return this.vchcompanyno;
	}

	public void setVchcompanyno(String vchcompanyno) {
		this.vchcompanyno = vchcompanyno;
	}

	@Column(name = "vchangkauji", length = 1)
	public String getVchangkauji() {
		return this.vchangkauji;
	}

	public void setVchangkauji(String vchangkauji) {
		this.vchangkauji = vchangkauji;
	}

	@Column(name = "vchcompanyname", length = 100)
	public String getVchcompanyname() {
		return this.vchcompanyname;
	}

	public void setVchcompanyname(String vchcompanyname) {
		this.vchcompanyname = vchcompanyname;
	}

	@Column(name = "vchbranchcode", length = 2)
	public String getVchbranchcode() {
		return this.vchbranchcode;
	}

	public void setVchbranchcode(String vchbranchcode) {
		this.vchbranchcode = vchbranchcode;
	}

	@Column(name = "vchcurrency", length = 10)
	public String getVchcurrency() {
		return this.vchcurrency;
	}

	public void setVchcurrency(String vchcurrency) {
		this.vchcurrency = vchcurrency;
	}

	@Column(name = "chrcompanystatus", length = 1)
	public String getChrcompanystatus() {
		return this.chrcompanystatus;
	}

	public void setChrcompanystatus(String chrcompanystatus) {
		this.chrcompanystatus = chrcompanystatus;
	}

	@Column(name = "chrcompanytype", length = 1)
	public String getChrcompanytype() {
		return this.chrcompanytype;
	}

	public void setChrcompanytype(String chrcompanytype) {
		this.chrcompanytype = chrcompanytype;
	}

	@Column(name = "chrlocalforeign", length = 1)
	public String getChrlocalforeign() {
		return this.chrlocalforeign;
	}

	public void setChrlocalforeign(String chrlocalforeign) {
		this.chrlocalforeign = chrlocalforeign;
	}

	@Column(name = "mnyauthorisedcapital", precision = 21, scale = 4)
	public Double getMnyauthorisedcapital() {
		return this.mnyauthorisedcapital;
	}

	public void setMnyauthorisedcapital(Double mnyauthorisedcapital) {
		this.mnyauthorisedcapital = mnyauthorisedcapital;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dtauthoriseddate", length = 2052)
	public Date getDtauthoriseddate() {
		return this.dtauthoriseddate;
	}

	public void setDtauthoriseddate(Date dtauthoriseddate) {
		this.dtauthoriseddate = dtauthoriseddate;
	}

	@Column(name = "mnyordnominalvalue", precision = 21, scale = 4)
	public Double getMnyordnominalvalue() {
		return this.mnyordnominalvalue;
	}

	public void setMnyordnominalvalue(Double mnyordnominalvalue) {
		this.mnyordnominalvalue = mnyordnominalvalue;
	}

	@Column(name = "intordnumberofshares")
	public Long getIntordnumberofshares() {
		return this.intordnumberofshares;
	}

	public void setIntordnumberofshares(Long intordnumberofshares) {
		this.intordnumberofshares = intordnumberofshares;
	}

	@Column(name = "mnyordanominalvalue", precision = 21, scale = 4)
	public Double getMnyordanominalvalue() {
		return this.mnyordanominalvalue;
	}

	public void setMnyordanominalvalue(Double mnyordanominalvalue) {
		this.mnyordanominalvalue = mnyordanominalvalue;
	}

	@Column(name = "intordanumberofshares")
	public Long getIntordanumberofshares() {
		return this.intordanumberofshares;
	}

	public void setIntordanumberofshares(Long intordanumberofshares) {
		this.intordanumberofshares = intordanumberofshares;
	}

	@Column(name = "mnyordbnominalvalue", precision = 21, scale = 4)
	public Double getMnyordbnominalvalue() {
		return this.mnyordbnominalvalue;
	}

	public void setMnyordbnominalvalue(Double mnyordbnominalvalue) {
		this.mnyordbnominalvalue = mnyordbnominalvalue;
	}

	@Column(name = "intordbnumberofshares")
	public Long getIntordbnumberofshares() {
		return this.intordbnumberofshares;
	}

	public void setIntordbnumberofshares(Long intordbnumberofshares) {
		this.intordbnumberofshares = intordbnumberofshares;
	}

	@Column(name = "mnyprefnominalvalue", precision = 21, scale = 4)
	public Double getMnyprefnominalvalue() {
		return this.mnyprefnominalvalue;
	}

	public void setMnyprefnominalvalue(Double mnyprefnominalvalue) {
		this.mnyprefnominalvalue = mnyprefnominalvalue;
	}

	@Column(name = "intprefnumberofshares")
	public Long getIntprefnumberofshares() {
		return this.intprefnumberofshares;
	}

	public void setIntprefnumberofshares(Long intprefnumberofshares) {
		this.intprefnumberofshares = intprefnumberofshares;
	}

	@Column(name = "mnyprefanominalvalue", precision = 21, scale = 4)
	public Double getMnyprefanominalvalue() {
		return this.mnyprefanominalvalue;
	}

	public void setMnyprefanominalvalue(Double mnyprefanominalvalue) {
		this.mnyprefanominalvalue = mnyprefanominalvalue;
	}

	@Column(name = "intprefanumberofshares")
	public Long getIntprefanumberofshares() {
		return this.intprefanumberofshares;
	}

	public void setIntprefanumberofshares(Long intprefanumberofshares) {
		this.intprefanumberofshares = intprefanumberofshares;
	}

	@Column(name = "mnyprefbnominalvalue", precision = 21, scale = 4)
	public Double getMnyprefbnominalvalue() {
		return this.mnyprefbnominalvalue;
	}

	public void setMnyprefbnominalvalue(Double mnyprefbnominalvalue) {
		this.mnyprefbnominalvalue = mnyprefbnominalvalue;
	}

	@Column(name = "intprefbnumberofshares")
	public Long getIntprefbnumberofshares() {
		return this.intprefbnumberofshares;
	}

	public void setIntprefbnumberofshares(Long intprefbnumberofshares) {
		this.intprefbnumberofshares = intprefbnumberofshares;
	}

	@Column(name = "mnyothernominalvalue", precision = 21, scale = 4)
	public Double getMnyothernominalvalue() {
		return this.mnyothernominalvalue;
	}

	public void setMnyothernominalvalue(Double mnyothernominalvalue) {
		this.mnyothernominalvalue = mnyothernominalvalue;
	}

	@Column(name = "intothernumberofshares")
	public Long getIntothernumberofshares() {
		return this.intothernumberofshares;
	}

	public void setIntothernumberofshares(Long intothernumberofshares) {
		this.intothernumberofshares = intothernumberofshares;
	}

	@Column(name = "vchbusinessdescription", length = 600)
	public String getVchbusinessdescription() {
		return this.vchbusinessdescription;
	}

	public void setVchbusinessdescription(String vchbusinessdescription) {
		this.vchbusinessdescription = vchbusinessdescription;
	}

	@Column(name = "vchcompanycountry", length = 3)
	public String getVchcompanycountry() {
		return this.vchcompanycountry;
	}

	public void setVchcompanycountry(String vchcompanycountry) {
		this.vchcompanycountry = vchcompanycountry;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dtincorporationdate", length = 2052)
	public Date getDtincorporationdate() {
		return this.dtincorporationdate;
	}

	public void setDtincorporationdate(Date dtincorporationdate) {
		this.dtincorporationdate = dtincorporationdate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dtregistrationdate", length = 2052)
	public Date getDtregistrationdate() {
		return this.dtregistrationdate;
	}

	public void setDtregistrationdate(Date dtregistrationdate) {
		this.dtregistrationdate = dtregistrationdate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dtdissolveddate", length = 2052)
	public Date getDtdissolveddate() {
		return this.dtdissolveddate;
	}

	public void setDtdissolveddate(Date dtdissolveddate) {
		this.dtdissolveddate = dtdissolveddate;
	}

	@Column(name = "chrstatusofcompany", length = 1)
	public String getChrstatusofcompany() {
		return this.chrstatusofcompany;
	}

	public void setChrstatusofcompany(String chrstatusofcompany) {
		this.chrstatusofcompany = chrstatusofcompany;
	}

	@Column(name = "chrwuptype", length = 1)
	public String getChrwuptype() {
		return this.chrwuptype;
	}

	public void setChrwuptype(String chrwuptype) {
		this.chrwuptype = chrwuptype;
	}

	@Column(name = "vcholdcompanyname", length = 100)
	public String getVcholdcompanyname() {
		return this.vcholdcompanyname;
	}

	public void setVcholdcompanyname(String vcholdcompanyname) {
		this.vcholdcompanyname = vcholdcompanyname;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dtdateofchange", length = 2052)
	public Date getDtdateofchange() {
		return this.dtdateofchange;
	}

	public void setDtdateofchange(Date dtdateofchange) {
		this.dtdateofchange = dtdateofchange;
	}

	@Column(name = "vchcreateby", length = 10)
	public String getVchcreateby() {
		return this.vchcreateby;
	}

	public void setVchcreateby(String vchcreateby) {
		this.vchcreateby = vchcreateby;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dtcreatedate", length = 3594)
	public Date getDtcreatedate() {
		return this.dtcreatedate;
	}

	public void setDtcreatedate(Date dtcreatedate) {
		this.dtcreatedate = dtcreatedate;
	}

	@Column(name = "vchupdateby", length = 10)
	public String getVchupdateby() {
		return this.vchupdateby;
	}

	public void setVchupdateby(String vchupdateby) {
		this.vchupdateby = vchupdateby;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dtupdatedate", length = 3594)
	public Date getDtupdatedate() {
		return this.dtupdatedate;
	}

	public void setDtupdatedate(Date dtupdatedate) {
		this.dtupdatedate = dtupdatedate;
	}

	@Column(name = "flag", length = 1)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Column(name = "vchipaddress", length = 20)
	public String getVchipaddress() {
		return this.vchipaddress;
	}

	public void setVchipaddress(String vchipaddress) {
		this.vchipaddress = vchipaddress;
	}

	@Column(name = "mnytotalpaidcptlfee", precision = 16)
	public Double getMnytotalpaidcptlfee() {
		return this.mnytotalpaidcptlfee;
	}

	public void setMnytotalpaidcptlfee(Double mnytotalpaidcptlfee) {
		this.mnytotalpaidcptlfee = mnytotalpaidcptlfee;
	}

}
