package br.edu.ifpb.padroes.casainteligente.state;

import br.edu.ifpb.padroes.casainteligente.model.Sala;

public class NaoHaIncendioSala implements State {

	private Sala sala;

	public NaoHaIncendioSala(Sala sala) {
		super();
		this.sala = sala;
	}
	
	@Override
	public String ligarEsguicho() {
		// TODO Auto-generated method stub
		sala.setEstado(sala.getHaIncendio());
		return "Esguicho Ligado!!";
	}

	@Override
	public String desligarEsguicho() {
		// TODO Auto-generated method stub
		return "Esguicho se encontra desligado, pois não há incêndio";
	}

}
