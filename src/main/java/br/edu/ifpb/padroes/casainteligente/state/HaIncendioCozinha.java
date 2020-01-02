package br.edu.ifpb.padroes.casainteligente.state;

import br.edu.ifpb.padroes.casainteligente.model.Banheiro;
import br.edu.ifpb.padroes.casainteligente.model.Cozinha;
import br.edu.ifpb.padroes.casainteligente.model.Quarto;
import br.edu.ifpb.padroes.casainteligente.model.Sala;

public class HaIncendioCozinha implements State {

	private Cozinha cozinha;

	public HaIncendioCozinha(Cozinha cozinha) {
		super();
		this.cozinha = cozinha;
	}

	@Override
	public String ligarEsguicho() {
		// TODO Auto-generated method stub
		return "Esguicho já se encontra ligado";
	}

	@Override
	public String desligarEsguicho() {
		// TODO Auto-generated method stub
		cozinha.setEstado(cozinha.getNaoHaIncendio());
		return "Esguicho desligado";
	}


}
