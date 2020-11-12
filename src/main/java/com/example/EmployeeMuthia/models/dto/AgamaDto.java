package com.example.EmployeeMuthia.models.dto;

public class AgamaDto {

	private long idAgama;
	private String namaAgama;
	
	public AgamaDto() {
		// TODO Auto-generated constructor stub
	}

	public AgamaDto(long idAgama, String namaAgama) {
		super();
		this.idAgama = idAgama;
		this.namaAgama = namaAgama;
	}

	public long getIdAgama() {
		return idAgama;
	}

	public void setIdAgama(long idAgama) {
		this.idAgama = idAgama;
	}

	public String getNamaAgama() {
		return namaAgama;
	}

	public void setNamaAgama(String namaAgama) {
		this.namaAgama = namaAgama;
	}
	
	
	
}
