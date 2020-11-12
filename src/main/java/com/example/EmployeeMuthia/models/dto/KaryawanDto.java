package com.example.EmployeeMuthia.models.dto;

import java.util.Date;

public class KaryawanDto {

	private long idKaryawan;
	private AgamaDto agama;
	private PenempatanDto penempatan;
	private PosisiDto posisi;
	private TingkatanDto tingkatan;
	private String nama;
	private String noKtp;
	private String alamat;
	private Date tanggalLahir;
	private Integer masaKerja;
	private Short statusPernikahan;
	private Date kontrakAwal;
	private Date kontrakAkhir;
	private String jenisKelamin;
	private Integer jumlahAnak;
	
	public KaryawanDto() {
		// TODO Auto-generated constructor stub
	}

	public KaryawanDto(long idKaryawan, AgamaDto agama, PenempatanDto penempatan, PosisiDto posisi,
			TingkatanDto tingkatan, String nama, String noKtp, String alamat, Date tanggalLahir, Integer masaKerja,
			Short statusPernikahan, Date kontrakAwal, Date kontrakAkhir, String jenisKelamin, Integer jumlahAnak) {
		super();
		this.idKaryawan = idKaryawan;
		this.agama = agama;
		this.penempatan = penempatan;
		this.posisi = posisi;
		this.tingkatan = tingkatan;
		this.nama = nama;
		this.noKtp = noKtp;
		this.alamat = alamat;
		this.tanggalLahir = tanggalLahir;
		this.masaKerja = masaKerja;
		this.statusPernikahan = statusPernikahan;
		this.kontrakAwal = kontrakAwal;
		this.kontrakAkhir = kontrakAkhir;
		this.jenisKelamin = jenisKelamin;
		this.jumlahAnak = jumlahAnak;
	}

	public long getIdKaryawan() {
		return idKaryawan;
	}

	public void setIdKaryawan(long idKaryawan) {
		this.idKaryawan = idKaryawan;
	}

	public AgamaDto getAgama() {
		return agama;
	}

	public void setAgama(AgamaDto agama) {
		this.agama = agama;
	}

	public PenempatanDto getPenempatan() {
		return penempatan;
	}

	public void setPenempatan(PenempatanDto penempatan) {
		this.penempatan = penempatan;
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

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNoKtp() {
		return noKtp;
	}

	public void setNoKtp(String noKtp) {
		this.noKtp = noKtp;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public Date getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	public Integer getMasaKerja() {
		return masaKerja;
	}

	public void setMasaKerja(Integer masaKerja) {
		this.masaKerja = masaKerja;
	}

	public Short getStatusPernikahan() {
		return statusPernikahan;
	}

	public void setStatusPernikahan(Short statusPernikahan) {
		this.statusPernikahan = statusPernikahan;
	}

	public Date getKontrakAwal() {
		return kontrakAwal;
	}

	public void setKontrakAwal(Date kontrakAwal) {
		this.kontrakAwal = kontrakAwal;
	}

	public Date getKontrakAkhir() {
		return kontrakAkhir;
	}

	public void setKontrakAkhir(Date kontrakAkhir) {
		this.kontrakAkhir = kontrakAkhir;
	}

	public String getJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}

	public Integer getJumlahAnak() {
		return jumlahAnak;
	}

	public void setJumlahAnak(Integer jumlahAnak) {
		this.jumlahAnak = jumlahAnak;
	}
	
	
	
}
