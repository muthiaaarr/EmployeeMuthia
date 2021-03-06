package com.example.EmployeeMuthia.models.dto;

import java.math.BigDecimal;
import java.util.Date;

public class PendapatanDto {

	private long idPendapatan;
	private KaryawanDto karyawan;
	private Date tanggalGaji;
	private BigDecimal gajiPokok;
	private BigDecimal tunjanganKeluarga;
	private BigDecimal tunjanganPegawai;
	private BigDecimal tunjanganTransport;
	private BigDecimal gajiKotor;
	private BigDecimal pphPerbulan;
	private BigDecimal bpjs;
	private BigDecimal gajiBersih;
	private Integer lamaLembur;
	private BigDecimal uangLembur;
	private Integer variableBonus;
	private BigDecimal uangBonus;
	private BigDecimal takeHomePay;
	
	public PendapatanDto() {
		// TODO Auto-generated constructor stub
	}

	public PendapatanDto(long idPendapatan, KaryawanDto karyawan, Date tanggalGaji, BigDecimal gajiPokok,
			BigDecimal tunjanganKeluarga, BigDecimal tunjanganPegawai, BigDecimal tunjanganTransport,
			BigDecimal gajiKotor, BigDecimal pphPerbulan, BigDecimal bpjs, BigDecimal gajiBersih, Integer lamaLembur,
			BigDecimal uangLembur, Integer variableBonus, BigDecimal uangBonus, BigDecimal takeHomePay) {
		super();
		this.idPendapatan = idPendapatan;
		this.karyawan = karyawan;
		this.tanggalGaji = tanggalGaji;
		this.gajiPokok = gajiPokok;
		this.tunjanganKeluarga = tunjanganKeluarga;
		this.tunjanganPegawai = tunjanganPegawai;
		this.tunjanganTransport = tunjanganTransport;
		this.gajiKotor = gajiKotor;
		this.pphPerbulan = pphPerbulan;
		this.bpjs = bpjs;
		this.gajiBersih = gajiBersih;
		this.lamaLembur = lamaLembur;
		this.uangLembur = uangLembur;
		this.variableBonus = variableBonus;
		this.uangBonus = uangBonus;
		this.takeHomePay = takeHomePay;
	}

	public long getIdPendapatan() {
		return idPendapatan;
	}

	public void setIdPendapatan(long idPendapatan) {
		this.idPendapatan = idPendapatan;
	}

	public KaryawanDto getKaryawan() {
		return karyawan;
	}

	public void setKaryawan(KaryawanDto karyawan) {
		this.karyawan = karyawan;
	}

	public Date getTanggalGaji() {
		return tanggalGaji;
	}

	public void setTanggalGaji(Date tanggalGaji) {
		this.tanggalGaji = tanggalGaji;
	}

	public BigDecimal getGajiPokok() {
		return gajiPokok;
	}

	public void setGajiPokok(BigDecimal gajiPokok) {
		this.gajiPokok = gajiPokok;
	}

	public BigDecimal getTunjanganKeluarga() {
		return tunjanganKeluarga;
	}

	public void setTunjanganKeluarga(BigDecimal tunjanganKeluarga) {
		this.tunjanganKeluarga = tunjanganKeluarga;
	}

	public BigDecimal getTunjanganPegawai() {
		return tunjanganPegawai;
	}

	public void setTunjanganPegawai(BigDecimal tunjanganPegawai) {
		this.tunjanganPegawai = tunjanganPegawai;
	}

	public BigDecimal getTunjanganTransport() {
		return tunjanganTransport;
	}

	public void setTunjanganTransport(BigDecimal tunjanganTransport) {
		this.tunjanganTransport = tunjanganTransport;
	}

	public BigDecimal getGajiKotor() {
		return gajiKotor;
	}

	public void setGajiKotor(BigDecimal gajiKotor) {
		this.gajiKotor = gajiKotor;
	}

	public BigDecimal getPphPerbulan() {
		return pphPerbulan;
	}

	public void setPphPerbulan(BigDecimal pphPerbulan) {
		this.pphPerbulan = pphPerbulan;
	}

	public BigDecimal getBpjs() {
		return bpjs;
	}

	public void setBpjs(BigDecimal bpjs) {
		this.bpjs = bpjs;
	}

	public BigDecimal getGajiBersih() {
		return gajiBersih;
	}

	public void setGajiBersih(BigDecimal gajiBersih) {
		this.gajiBersih = gajiBersih;
	}

	public Integer getLamaLembur() {
		return lamaLembur;
	}

	public void setLamaLembur(Integer lamaLembur) {
		this.lamaLembur = lamaLembur;
	}

	public BigDecimal getUangLembur() {
		return uangLembur;
	}

	public void setUangLembur(BigDecimal uangLembur) {
		this.uangLembur = uangLembur;
	}

	public Integer getVariableBonus() {
		return variableBonus;
	}

	public void setVariableBonus(Integer variableBonus) {
		this.variableBonus = variableBonus;
	}

	public BigDecimal getUangBonus() {
		return uangBonus;
	}

	public void setUangBonus(BigDecimal uangBonus) {
		this.uangBonus = uangBonus;
	}

	public BigDecimal getTakeHomePay() {
		return takeHomePay;
	}

	public void setTakeHomePay(BigDecimal takeHomePay) {
		this.takeHomePay = takeHomePay;
	}
	
	
	
}
