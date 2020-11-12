package com.example.EmployeeMuthia.models.dto;

import java.util.Date;

public class LemburBonusDto {

	private long idLemburBonus;
	private KaryawanDto karyawan;
	private Date tanggalLemburBonus;
	private int lamaLembur;
	private int variableBonus;
	
	public LemburBonusDto() {
		// TODO Auto-generated constructor stub
	}

	public LemburBonusDto(long idLemburBonus, KaryawanDto karyawan, Date tanggalLemburBonus, int lamaLembur,
			int variableBonus) {
		super();
		this.idLemburBonus = idLemburBonus;
		this.karyawan = karyawan;
		this.tanggalLemburBonus = tanggalLemburBonus;
		this.lamaLembur = lamaLembur;
		this.variableBonus = variableBonus;
	}

	public long getIdLemburBonus() {
		return idLemburBonus;
	}

	public void setIdLemburBonus(long idLemburBonus) {
		this.idLemburBonus = idLemburBonus;
	}

	public KaryawanDto getKaryawan() {
		return karyawan;
	}

	public void setKaryawan(KaryawanDto karyawan) {
		this.karyawan = karyawan;
	}

	public Date getTanggalLemburBonus() {
		return tanggalLemburBonus;
	}

	public void setTanggalLemburBonus(Date tanggalLemburBonus) {
		this.tanggalLemburBonus = tanggalLemburBonus;
	}

	public int getLamaLembur() {
		return lamaLembur;
	}

	public void setLamaLembur(int lamaLembur) {
		this.lamaLembur = lamaLembur;
	}

	public int getVariableBonus() {
		return variableBonus;
	}

	public void setVariableBonus(int variableBonus) {
		this.variableBonus = variableBonus;
	}
	
	
	
}
