package com.tr.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class EmpData {

	@Id
	@GeneratedValue
	private Integer id;
	@Column(length=20)
	private String name;
	@Column(length=20)
	private String Addrs;
	private String surname;
	@Override
	public String toString() {
		return "EmpData [id=" + id + ", name=" + name + ", Addrs=" + Addrs + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddrs() {
		return Addrs;
	}
	public void setAddrs(String addrs) {
		Addrs = addrs;
	}
}
