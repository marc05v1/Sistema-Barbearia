package com.devs.sistemabarbearia.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Agenda {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date horarioAtendimento ;
	
	@OneToOne
	private Barbeiro barbeiro;
	
	@OneToMany
	List<ReservaDeServico> listaDeReservas = new ArrayList<ReservaDeServico>();
	
	public Agenda() {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getHorarioAtendimento() {
		return horarioAtendimento;
	}
	public void setHorarioAtendimento(Date horarioAtendimento) {
		this.horarioAtendimento = horarioAtendimento;
	}
	

	public Agenda(Long id, Date horarioAtendimento, Barbeiro barbeiro) {
		super();
		this.id = id;
		this.horarioAtendimento = horarioAtendimento;
		this.setBarbeiro(barbeiro);
	}

	public Barbeiro getBarbeiro() {
		return barbeiro;
	}
	public void setBarbeiro(Barbeiro barbeiro) {
		this.barbeiro = barbeiro;
	}
	
	
	
}
