package com.acm.aluminum.entities;

import java.time.Instant;
import java.util.Objects;

public class Client {

	private Long id;
	private String name;
	private String cpf;
	private Double income;

	private Instant birth;
	private Integer childern;

	public Client() {
	}

	public Client(Long id, String name, String cpf, Double income,
			Instant birth, Integer childern) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birth = birth;
		this.childern = childern;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public Instant getBirth() {
		return birth;
	}

	public void setBirth(Instant birth) {
		this.birth = birth;
	}

	public Integer getChildern() {
		return childern;
	}

	public void setChildern(Integer childern) {
		this.childern = childern;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(id, other.id);
	}
}
