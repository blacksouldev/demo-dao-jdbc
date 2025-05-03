package model.entities;

import java.time.LocalDate;

public class Seller {
	
	private Integer id;
	private String name;
	private String email;
	private LocalDate date;
	private Double BaseSalary;
	
	public Seller(Integer id, String name, String email, LocalDate date, Double baseSalary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.date = date;
		BaseSalary = baseSalary;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getBaseSalary() {
		return BaseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		BaseSalary = baseSalary;
	}
	
	
	
	
}
