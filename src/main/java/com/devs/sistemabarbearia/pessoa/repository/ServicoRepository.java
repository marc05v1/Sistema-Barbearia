package com.devs.sistemabarbearia.pessoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devs.sistemabarbearia.model.Barbeiro;
import com.devs.sistemabarbearia.model.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
	
	//Servico findByid(Long ind);
	
}
