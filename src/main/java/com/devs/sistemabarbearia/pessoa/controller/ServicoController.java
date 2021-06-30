package com.devs.sistemabarbearia.pessoa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.devs.sistemabarbearia.model.Servico;
import com.devs.sistemabarbearia.pessoa.repository.ServicoRepository;

@RestController
@RequestMapping(value="/servicos")
@CrossOrigin(origins ="*" )
public class ServicoController {

	@Autowired
	ServicoRepository servicoRepository;
	
	@GetMapping("/servico")
	public List<Servico> listaServicos(){
		return servicoRepository.findAll();
	}
	
	@PostMapping("/servico")
	 public Servico salvarServico(@RequestBody Servico servico) { //RequestBody, dá acesso aos atributos que estão no arquivo JSON
		return servicoRepository.save(servico);
	}
	
	@DeleteMapping("/servico")
	 public void deletaServico(@RequestBody Servico servico) {
		servicoRepository.delete(servico);	
	}
	
	@PutMapping("/servico")
	public Servico update(@RequestBody Servico servico) {
		return servicoRepository.save(servico);
	}
	
	@GetMapping("/servico/{id}")
	public Optional<Servico> buscaServicoId(@PathVariable(value = "id") Long id) {
	//	return servicoRepository.findByid(id);
		return servicoRepository.findById(id);
	}
	
	
	
}
