package com.example.EmployeeMuthia.models.dto;

import java.math.BigDecimal;

public class TunjanganPegawaiDto {

	private long idTunjanganPegawai;
	private PosisiDto posisi;
	private TingkatanDto tingkatan;
	private BigDecimal besaranTujnaganPegawai;
	
	public TunjanganPegawaiDto() {
		// TODO Auto-generated constructor stub
	}

	public TunjanganPegawaiDto(long idTunjanganPegawai, PosisiDto posisi, TingkatanDto tingkatan,
			BigDecimal besaranTujnaganPegawai) {
		super();
		this.idTunjanganPegawai = idTunjanganPegawai;
		this.posisi = posisi;
		this.tingkatan = tingkatan;
		this.besaranTujnaganPegawai = besaranTujnaganPegawai;
	}

	public long getIdTunjanganPegawai() {
		return idTunjanganPegawai;
	}

	public void setIdTunjanganPegawai(long idTunjanganPegawai) {
		this.idTunjanganPegawai = idTunjanganPegawai;
	}

	public PosisiDto getPosisi() {
		return posisi;
	}

	public void setPosisi(PosisiDto posisi) {
		this.posisi = posisi;
	}

	public TingkatanDto getTingkatan() {
		return tingkatan;
	}

	public void setTingkatan(TingkatanDto tingkatan) {
		this.tingkatan = tingkatan;
	}

	public BigDecimal getBesaranTujnaganPegawai() {
		return besaranTujnaganPegawai;
	}

	public void setBesaranTujnaganPegawai(BigDecimal besaranTujnaganPegawai) {
		this.besaranTujnaganPegawai = besaranTujnaganPegawai;
	}
	
	
	
}
