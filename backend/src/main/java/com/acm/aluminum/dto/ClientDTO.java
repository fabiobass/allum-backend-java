package com.acm.aluminum.dto;

import java.io.Serializable;
import java.time.Instant;

import com.acm.aluminum.entities.Client;

public class ClientDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String cpf;
	private Double income;
	private Instant birth;
	private Integer childern;

	public ClientDTO() {
	}

	public ClientDTO(Long id, String name, String cpf, Double income, Instant birth, Integer childern) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birth = birth;
		this.childern = childern;
	}

	public ClientDTO(Client entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.cpf = entity.getCpf();
		this.income = entity.getIncome();
		this.birth = entity.getBirth();
		this.childern = entity.getChildern();
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

}
