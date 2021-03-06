package com.example.EmployeeMuthia.models;
// Generated Nov 11, 2020 9:27:58 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Parameter generated by hbm2java
 */
@Entity
@Table(name = "parameter", schema = "public")
public class Parameter implements java.io.Serializable {

	private long idParam;
	private Date tbParameter;
	private BigDecimal TKeluarga;
	private BigDecimal TTransport;
	private BigDecimal PBpjs;
	private BigDecimal lembur;
	private BigDecimal bonusPg;
	private BigDecimal bonusTs;
	private BigDecimal bonusTw;
	private Integer batasanBonusPg;
	private Integer batasanBonusTs;
	private Integer batasanBonusTw;
	private BigDecimal maxBonus;

	public Parameter() {
	}

	public Parameter(long idParam, Date tbParameter, BigDecimal PBpjs, BigDecimal lembur, BigDecimal bonusPg,
			BigDecimal bonusTs, BigDecimal bonusTw) {
		this.idParam = idParam;
		this.tbParameter = tbParameter;
		this.PBpjs = PBpjs;
		this.lembur = lembur;
		this.bonusPg = bonusPg;
		this.bonusTs = bonusTs;
		this.bonusTw = bonusTw;
	}

	public Parameter(long idParam, Date tbParameter, BigDecimal TKeluarga, BigDecimal TTransport, BigDecimal PBpjs,
			BigDecimal lembur, BigDecimal bonusPg, BigDecimal bonusTs, BigDecimal bonusTw, Integer batasanBonusPg,
			Integer batasanBonusTs, Integer batasanBonusTw, BigDecimal maxBonus) {
		this.idParam = idParam;
		this.tbParameter = tbParameter;
		this.TKeluarga = TKeluarga;
		this.TTransport = TTransport;
		this.PBpjs = PBpjs;
		this.lembur = lembur;
		this.bonusPg = bonusPg;
		this.bonusTs = bonusTs;
		this.bonusTw = bonusTw;
		this.batasanBonusPg = batasanBonusPg;
		this.batasanBonusTs = batasanBonusTs;
		this.batasanBonusTw = batasanBonusTw;
		this.maxBonus = maxBonus;
	}

	@Id

	@Column(name = "id_param", unique = true, nullable = false)
	public long getIdParam() {
		return this.idParam;
	}

	public void setIdParam(long idParam) {
		this.idParam = idParam;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "tb_parameter", nullable = false, length = 13)
	public Date getTbParameter() {
		return this.tbParameter;
	}

	public void setTbParameter(Date tbParameter) {
		this.tbParameter = tbParameter;
	}

	@Column(name = "t_keluarga", precision = 16, scale = 4)
	public BigDecimal getTKeluarga() {
		return this.TKeluarga;
	}

	public void setTKeluarga(BigDecimal TKeluarga) {
		this.TKeluarga = TKeluarga;
	}

	@Column(name = "t_transport", precision = 16, scale = 4)
	public BigDecimal getTTransport() {
		return this.TTransport;
	}

	public void setTTransport(BigDecimal TTransport) {
		this.TTransport = TTransport;
	}

	@Column(name = "p_bpjs", nullable = false, precision = 16, scale = 4)
	public BigDecimal getPBpjs() {
		return this.PBpjs;
	}

	public void setPBpjs(BigDecimal PBpjs) {
		this.PBpjs = PBpjs;
	}

	@Column(name = "lembur", nullable = false, precision = 16, scale = 4)
	public BigDecimal getLembur() {
		return this.lembur;
	}

	public void setLembur(BigDecimal lembur) {
		this.lembur = lembur;
	}

	@Column(name = "bonus_pg", nullable = false, precision = 16, scale = 4)
	public BigDecimal getBonusPg() {
		return this.bonusPg;
	}

	public void setBonusPg(BigDecimal bonusPg) {
		this.bonusPg = bonusPg;
	}

	@Column(name = "bonus_ts", nullable = false, precision = 16, scale = 4)
	public BigDecimal getBonusTs() {
		return this.bonusTs;
	}

	public void setBonusTs(BigDecimal bonusTs) {
		this.bonusTs = bonusTs;
	}

	@Column(name = "bonus_tw", nullable = false, precision = 16, scale = 4)
	public BigDecimal getBonusTw() {
		return this.bonusTw;
	}

	public void setBonusTw(BigDecimal bonusTw) {
		this.bonusTw = bonusTw;
	}

	@Column(name = "batasan_bonus_pg")
	public Integer getBatasanBonusPg() {
		return this.batasanBonusPg;
	}

	public void setBatasanBonusPg(Integer batasanBonusPg) {
		this.batasanBonusPg = batasanBonusPg;
	}

	@Column(name = "batasan_bonus_ts")
	public Integer getBatasanBonusTs() {
		return this.batasanBonusTs;
	}

	public void setBatasanBonusTs(Integer batasanBonusTs) {
		this.batasanBonusTs = batasanBonusTs;
	}

	@Column(name = "batasan_bonus_tw")
	public Integer getBatasanBonusTw() {
		return this.batasanBonusTw;
	}

	public void setBatasanBonusTw(Integer batasanBonusTw) {
		this.batasanBonusTw = batasanBonusTw;
	}

	@Column(name = "max_bonus", precision = 16, scale = 4)
	public BigDecimal getMaxBonus() {
		return this.maxBonus;
	}

	public void setMaxBonus(BigDecimal maxBonus) {
		this.maxBonus = maxBonus;
	}

}
