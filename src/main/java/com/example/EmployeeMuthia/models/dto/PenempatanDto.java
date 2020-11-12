package com.example.EmployeeMuthia.models.dto;

import java.math.BigDecimal;

public class PenempatanDto {

	private long idPenempatan;
	private String kotaPenempatan;
	private BigDecimal umkPenempatan;
	
	public PenempatanDto() {
		// TODO Auto-generated constructor stub
	}

	public PenempatanDto(long idPenempatan, String kotaPenempatan, BigDecimal umkPenempatan) {
		super();
		this.idPenempatan = idPenempatan;
		this.kotaPenempatan = kotaPenempatan;
		this.umkPenempatan = umkPenempatan;
	}

	public long getIdPenempatan() {
		return idPenempatan;
	}

	public void setIdPenempatan(long idPenempatan) {
		this.idPenempatan = idPenempatan;
	}

	public String getKotaPenempatan() {
		return kotaPenempatan;
	}

	public void setKotaPenempatan(String kotaPenempatan) {
		this.kotaPenempatan = kotaPenempatan;
	}

	public BigDecimal getUmkPenempatan() {
		return umkPenempatan;
	}

	public void setUmkPenempatan(BigDecimal umkPenempatan) {
		this.umkPenempatan = umkPenempatan;
	}
	
	
	
}
