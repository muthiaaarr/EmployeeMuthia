package com.example.EmployeeMuthia.models;
// Generated Nov 11, 2020 9:27:58 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Karyawan generated by hbm2java
 */
@Entity
@Table(name = "karyawan", schema = "public")
public class Karyawan implements java.io.Serializable {

	private long idKaryawan;
	private Agama agama;
	private Penempatan penempatan;
	private Posisi posisi;
	private Tingkatan tingkatan;
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
	private Set<LemburBonus> lemburBonuses = new HashSet<LemburBonus>(0);
	private Set<Pendapatan> pendapatans = new HashSet<Pendapatan>(0);
	private Set<ListKemampuan> listKemampuans = new HashSet<ListKemampuan>(0);

	public Karyawan() {
	}

	public Karyawan(long idKaryawan, String nama, String noKtp, String alamat, Date tanggalLahir, Date kontrakAwal,
			Date kontrakAkhir, String jenisKelamin) {
		this.idKaryawan = idKaryawan;
		this.nama = nama;
		this.noKtp = noKtp;
		this.alamat = alamat;
		this.tanggalLahir = tanggalLahir;
		this.kontrakAwal = kontrakAwal;
		this.kontrakAkhir = kontrakAkhir;
		this.jenisKelamin = jenisKelamin;
	}

	public Karyawan(long idKaryawan, Agama agama, Penempatan penempatan, Posisi posisi, Tingkatan tingkatan,
			String nama, String noKtp, String alamat, Date tanggalLahir, Integer masaKerja, Short statusPernikahan,
			Date kontrakAwal, Date kontrakAkhir, String jenisKelamin, Integer jumlahAnak,
			Set<LemburBonus> lemburBonuses, Set<Pendapatan> pendapatans, Set<ListKemampuan> listKemampuans) {
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
		this.lemburBonuses = lemburBonuses;
		this.pendapatans = pendapatans;
		this.listKemampuans = listKemampuans;
	}

	@Id

	@Column(name = "id_karyawan", unique = true, nullable = false)
	public long getIdKaryawan() {
		return this.idKaryawan;
	}

	public void setIdKaryawan(long idKaryawan) {
		this.idKaryawan = idKaryawan;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_agama")
	public Agama getAgama() {
		return this.agama;
	}

	public void setAgama(Agama agama) {
		this.agama = agama;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_penempatan")
	public Penempatan getPenempatan() {
		return this.penempatan;
	}

	public void setPenempatan(Penempatan penempatan) {
		this.penempatan = penempatan;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_posisi")
	public Posisi getPosisi() {
		return this.posisi;
	}

	public void setPosisi(Posisi posisi) {
		this.posisi = posisi;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tingkatan")
	public Tingkatan getTingkatan() {
		return this.tingkatan;
	}

	public void setTingkatan(Tingkatan tingkatan) {
		this.tingkatan = tingkatan;
	}

	@Column(name = "nama", nullable = false, length = 256)
	public String getNama() {
		return this.nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	@Column(name = "no_ktp", nullable = false, length = 32)
	public String getNoKtp() {
		return this.noKtp;
	}

	public void setNoKtp(String noKtp) {
		this.noKtp = noKtp;
	}

	@Column(name = "alamat", nullable = false)
	public String getAlamat() {
		return this.alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "tanggal_lahir", nullable = false, length = 13)
	public Date getTanggalLahir() {
		return this.tanggalLahir;
	}

	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	@Column(name = "masa_kerja")
	public Integer getMasaKerja() {
		return this.masaKerja;
	}

	public void setMasaKerja(Integer masaKerja) {
		this.masaKerja = masaKerja;
	}

	@Column(name = "status_pernikahan")
	public Short getStatusPernikahan() {
		return this.statusPernikahan;
	}

	public void setStatusPernikahan(Short statusPernikahan) {
		this.statusPernikahan = statusPernikahan;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "kontrak_awal", nullable = false, length = 13)
	public Date getKontrakAwal() {
		return this.kontrakAwal;
	}

	public void setKontrakAwal(Date kontrakAwal) {
		this.kontrakAwal = kontrakAwal;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "kontrak_akhir", nullable = false, length = 13)
	public Date getKontrakAkhir() {
		return this.kontrakAkhir;
	}

	public void setKontrakAkhir(Date kontrakAkhir) {
		this.kontrakAkhir = kontrakAkhir;
	}

	@Column(name = "jenis_kelamin", nullable = false, length = 16)
	public String getJenisKelamin() {
		return this.jenisKelamin;
	}

	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}

	@Column(name = "jumlah_anak")
	public Integer getJumlahAnak() {
		return this.jumlahAnak;
	}

	public void setJumlahAnak(Integer jumlahAnak) {
		this.jumlahAnak = jumlahAnak;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "karyawan")
	public Set<LemburBonus> getLemburBonuses() {
		return this.lemburBonuses;
	}

	public void setLemburBonuses(Set<LemburBonus> lemburBonuses) {
		this.lemburBonuses = lemburBonuses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "karyawan")
	public Set<Pendapatan> getPendapatans() {
		return this.pendapatans;
	}

	public void setPendapatans(Set<Pendapatan> pendapatans) {
		this.pendapatans = pendapatans;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "karyawan")
	public Set<ListKemampuan> getListKemampuans() {
		return this.listKemampuans;
	}

	public void setListKemampuans(Set<ListKemampuan> listKemampuans) {
		this.listKemampuans = listKemampuans;
	}

}
