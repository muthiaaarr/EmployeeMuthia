package com.example.EmployeeMuthia.models.dto;

public class TingkatanDto {

	private long idTingkatan;
	private String namaTingkatan;
	
	public TingkatanDto() {
		// TODO Auto-generated constructor stub
	}

	public TingkatanDto(long idTingkatan, String namaTingkatan) {
		super();
		this.idTingkatan = idTingkatan;
		this.namaTingkatan = namaTingkatan;
	}

	public long getIdTingkatan() {
		return idTingkatan;
	}

	public void setIdTingkatan(long idTingkatan) {
		this.idTingkatan = idTingkatan;
	}

	public String getNamaTingkatan() {
		return namaTingkatan;
	}

	public void setNamaTingkatan(String namaTingkatan) {
		this.namaTingkatan = namaTingkatan;
	}
	
	
	
}
