package com.example.EmployeeMuthia.models.dto;

import java.math.BigDecimal;

public class PresentaseGajiDto {

	private long idPresentaseGaji;
	private PosisiDto posisi;
	private Long idTingkatan;
	private BigDecimal besaranGaji;
	private Integer masaKerja;
	
	public PresentaseGajiDto() {
		// TODO Auto-generated constructor stub
	}

	public PresentaseGajiDto(long idPresentaseGaji, PosisiDto posisi, Long idTingkatan, BigDecimal besaranGaji,
			Integer masaKerja) {
		super();
		this.idPresentaseGaji = idPresentaseGaji;
		this.posisi = posisi;
		this.idTingkatan = idTingkatan;
		this.besaranGaji = besaranGaji;
		this.masaKerja = masaKerja;
	}

	public long getIdPresentaseGaji() {
		return idPresentaseGaji;
	}

	public void setIdPresentaseGaji(long idPresentaseGaji) {
		this.idPresentaseGaji = idPresentaseGaji;
	}

	public PosisiDto getPosisi() {
		return posisi;
	}

	public void setPosisi(PosisiDto posisi) {
		this.posisi = posisi;
	}

	public Long getIdTingkatan() {
		return idTingkatan;
	}

	public void setIdTingkatan(Long idTingkatan) {
		this.idTingkatan = idTingkatan;
	}

	public BigDecimal getBesaranGaji() {
		return besaranGaji;
	}

	public void setBesaranGaji(BigDecimal besaranGaji) {
		this.besaranGaji = besaranGaji;
	}

	public Integer getMasaKerja() {
		return masaKerja;
	}

	public void setMasaKerja(Integer masaKerja) {
		this.masaKerja = masaKerja;
	}
	
	
	
}
