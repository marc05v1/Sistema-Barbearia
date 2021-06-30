package com.devs.sistemabarbearia.pessoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devs.sistemabarbearia.model.Barbeiro;

@Repository
public interface BarbeiroRepository  extends JpaRepository<Barbeiro, Long>{

	Barbeiro findByid(long ind);
		
}
