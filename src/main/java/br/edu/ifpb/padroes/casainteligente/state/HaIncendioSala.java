package br.edu.ifpb.padroes.casainteligente.state;

import br.edu.ifpb.padroes.casainteligente.model.Sala;

public class HaIncendioSala implements State {

	private Sala sala;
	
	public HaIncendioSala(Sala sala) {
		super();
		this.sala = sala;
	}

	@Override
	public String ligarEsguicho() {
		// TODO Auto-generated method stub
		return "Esguicho já se encontra ligado";
	}

	@Override
	public String desligarEsguicho() {
		// TODO Auto-generated method stub
		sala.setEstado(sala.getNaoHaIncendio());
		return "Esguicho desligado";
	}

}
