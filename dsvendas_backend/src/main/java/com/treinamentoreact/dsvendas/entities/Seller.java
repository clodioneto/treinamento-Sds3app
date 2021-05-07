package com.treinamentoreact.dsvendas.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sellers")
public class Seller {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "seller")
	private List<Sale> sales = new ArrayList<>();
	
	private Seller() {
		
	}
	
	public Seller(Long id, String name, List<Sale> sales) {
		super();
		this.id = id;
		this.name = name;
		this.sales = sales;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public List<Sale> getSales() {
		return sales;
	}

		
}
