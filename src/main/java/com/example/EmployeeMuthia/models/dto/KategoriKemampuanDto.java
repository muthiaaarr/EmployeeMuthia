package com.example.EmployeeMuthia.models.dto;

public class KategoriKemampuanDto {

	private long idKategori;
	private String namaKategori;
	
	public KategoriKemampuanDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KategoriKemampuanDto(long idKategori, String namaKategori) {
		super();
		this.idKategori = idKategori;
		this.namaKategori = namaKategori;
	}

	public long getIdKategori() {
		return idKategori;
	}

	public void setIdKategori(long idKategori) {
		this.idKategori = idKategori;
	}

	public String getNamaKategori() {
		return namaKategori;
	}

	public void setNamaKategori(String namaKategori) {
		this.namaKategori = namaKategori;
	}
	
	
	
}
