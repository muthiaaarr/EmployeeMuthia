package com.example.EmployeeMuthia.models.dto;

public class KemampuanDto {

	private long idKemampuan;
	private KategoriKemampuanDto kategoriKemampuan;
	private String namaKemampuan;
	
	public KemampuanDto() {
		// TODO Auto-generated constructor stub
	}

	public KemampuanDto(long idKemampuan, KategoriKemampuanDto kategoriKemampuan, String namaKemampuan) {
		super();
		this.idKemampuan = idKemampuan;
		this.kategoriKemampuan = kategoriKemampuan;
		this.namaKemampuan = namaKemampuan;
	}

	public long getIdKemampuan() {
		return idKemampuan;
	}

	public void setIdKemampuan(long idKemampuan) {
		this.idKemampuan = idKemampuan;
	}

	public KategoriKemampuanDto getKategoriKemampuan() {
		return kategoriKemampuan;
	}

	public void setKategoriKemampuan(KategoriKemampuanDto kategoriKemampuan) {
		this.kategoriKemampuan = kategoriKemampuan;
	}

	public String getNamaKemampuan() {
		return namaKemampuan;
	}

	public void setNamaKemampuan(String namaKemampuan) {
		this.namaKemampuan = namaKemampuan;
	}
	
	
	
}
