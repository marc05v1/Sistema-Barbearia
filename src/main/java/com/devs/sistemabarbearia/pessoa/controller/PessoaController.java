package com.devs.sistemabarbearia.pessoa.controller;

import java.util.List;

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
import com.devs.sistemabarbearia.model.Pessoa;
import com.devs.sistemabarbearia.pessoa.repository.PessoaRepository;

@RestController
@RequestMapping(value="/barbearia")
@CrossOrigin(origins ="*" )
public class PessoaController {

	@Autowired
	PessoaRepository pessoaRepositroy;
	

	@GetMapping("/pessoas")
	public List<Pessoa> listaPessoas(){
		return pessoaRepositroy.findAll();
	}
	
	@GetMapping("/pessoa/{id}")
	public Pessoa buscarPessoaId(@PathVariable(value = "id") Long id) {
		return pessoaRepositroy.findByid(id);
	}
	
	@PostMapping("/pessoa")
	 public Pessoa salvaProduto(@RequestBody Pessoa pessoa) {
		return pessoaRepositroy.save(pessoa);
	}
	
	@DeleteMapping("/pessoa")
	 public void deletaPessoa(@RequestBody Pessoa pessoa) {
		pessoaRepositroy.delete(pessoa);	
	}
	
	@PutMapping("/pessoa")
	public Pessoa update(@RequestBody Pessoa pessoa) {
		return pessoaRepositroy.save(pessoa);
	}
	
	
	
}






























