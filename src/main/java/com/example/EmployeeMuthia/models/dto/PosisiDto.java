package com.example.EmployeeMuthia.models.dto;

public class PosisiDto {

	private long idPosisi;
	private String namaPosisi;
	
	public PosisiDto() {
		// TODO Auto-generated constructor stub
	}

	public PosisiDto(long idPosisi, String namaPosisi) {
		super();
		this.idPosisi = idPosisi;
		this.namaPosisi = namaPosisi;
	}

	public long getIdPosisi() {
		return idPosisi;
	}

	public void setIdPosisi(long idPosisi) {
		this.idPosisi = idPosisi;
	}

	public String getNamaPosisi() {
		return namaPosisi;
	}

	public void setNamaPosisi(String namaPosisi) {
		this.namaPosisi = namaPosisi;
	}
	
	
	
}
