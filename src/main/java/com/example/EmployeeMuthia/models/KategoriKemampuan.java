package com.example.EmployeeMuthia.models;
// Generated Nov 11, 2020 9:27:58 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * KategoriKemampuan generated by hbm2java
 */
@Entity
@Table(name = "kategori_kemampuan", schema = "public")
public class KategoriKemampuan implements java.io.Serializable {

	private long idKategori;
	private String namaKategori;
	private Set<Kemampuan> kemampuans = new HashSet<Kemampuan>(0);

	public KategoriKemampuan() {
	}

	public KategoriKemampuan(long idKategori, String namaKategori) {
		this.idKategori = idKategori;
		this.namaKategori = namaKategori;
	}

	public KategoriKemampuan(long idKategori, String namaKategori, Set<Kemampuan> kemampuans) {
		this.idKategori = idKategori;
		this.namaKategori = namaKategori;
		this.kemampuans = kemampuans;
	}

	@Id

	@Column(name = "id_kategori", unique = true, nullable = false)
	public long getIdKategori() {
		return this.idKategori;
	}

	public void setIdKategori(long idKategori) {
		this.idKategori = idKategori;
	}

	@Column(name = "nama_kategori", nullable = false, length = 128)
	public String getNamaKategori() {
		return this.namaKategori;
	}

	public void setNamaKategori(String namaKategori) {
		this.namaKategori = namaKategori;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "kategoriKemampuan")
	public Set<Kemampuan> getKemampuans() {
		return this.kemampuans;
	}

	public void setKemampuans(Set<Kemampuan> kemampuans) {
		this.kemampuans = kemampuans;
	}

}
