package com.treinamentoreact.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamentoreact.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
