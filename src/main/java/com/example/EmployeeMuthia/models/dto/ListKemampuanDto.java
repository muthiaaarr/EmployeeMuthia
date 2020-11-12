package com.example.EmployeeMuthia.models.dto;

public class ListKemampuanDto {

	private long idListKemampuan;
	private KaryawanDto karyawan;
	private KemampuanDto kemampuan;
	private Integer nilaiKemampuan;
	
	public ListKemampuanDto() {
		// TODO Auto-generated constructor stub
	}

	public ListKemampuanDto(long idListKemampuan, KaryawanDto karyawan, KemampuanDto kemampuan,
			Integer nilaiKemampuan) {
		super();
		this.idListKemampuan = idListKemampuan;
		this.karyawan = karyawan;
		this.kemampuan = kemampuan;
		this.nilaiKemampuan = nilaiKemampuan;
	}

	public long getIdListKemampuan() {
		return idListKemampuan;
	}

	public void setIdListKemampuan(long idListKemampuan) {
		this.idListKemampuan = idListKemampuan;
	}

	public KaryawanDto getKaryawan() {
		return karyawan;
	}

	public void setKaryawan(KaryawanDto karyawan) {
		this.karyawan = karyawan;
	}

	public KemampuanDto getKemampuan() {
		return kemampuan;
	}

	public void setKemampuan(KemampuanDto kemampuan) {
		this.kemampuan = kemampuan;
	}

	public Integer getNilaiKemampuan() {
		return nilaiKemampuan;
	}

	public void setNilaiKemampuan(Integer nilaiKemampuan) {
		this.nilaiKemampuan = nilaiKemampuan;
	}
	
	
	
}
