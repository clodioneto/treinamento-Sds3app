package com.treinamentoreact.dsvendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.treinamentoreact.dsvendas.dto.SaleDTO;
import com.treinamentoreact.dsvendas.entities.Sale;
import com.treinamentoreact.dsvendas.repositories.SaleRepository;
import com.treinamentoreact.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pegeable){
		//colocou o resultado da primeira pesquisa de vendedores em memória para 
		//evitar a reconsulta gerada automaticamente durante os "joins".
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pegeable);
		return result.map(x -> new SaleDTO(x));
	}

}
