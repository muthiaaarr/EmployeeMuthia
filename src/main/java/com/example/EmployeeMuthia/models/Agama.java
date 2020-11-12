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
 * Agama generated by hbm2java
 */
@Entity
@Table(name = "agama", schema = "public")
public class Agama implements java.io.Serializable {

	private long idAgama;
	private String namaAgama;
	private Set<Karyawan> karyawans = new HashSet<Karyawan>(0);

	public Agama() {
	}

	public Agama(long idAgama, String namaAgama) {
		this.idAgama = idAgama;
		this.namaAgama = namaAgama;
	}

	public Agama(long idAgama, String namaAgama, Set<Karyawan> karyawans) {
		this.idAgama = idAgama;
		this.namaAgama = namaAgama;
		this.karyawans = karyawans;
	}

	@Id

	@Column(name = "id_agama", unique = true, nullable = false)
	public long getIdAgama() {
		return this.idAgama;
	}

	public void setIdAgama(long idAgama) {
		this.idAgama = idAgama;
	}

	@Column(name = "nama_agama", nullable = false, length = 128)
	public String getNamaAgama() {
		return this.namaAgama;
	}

	public void setNamaAgama(String namaAgama) {
		this.namaAgama = namaAgama;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "agama")
	public Set<Karyawan> getKaryawans() {
		return this.karyawans;
	}

	public void setKaryawans(Set<Karyawan> karyawans) {
		this.karyawans = karyawans;
	}

}
