package br.edu.ifpb.padroes.casainteligente.state;

import br.edu.ifpb.padroes.casainteligente.model.Banheiro;
import br.edu.ifpb.padroes.casainteligente.model.Cozinha;
import br.edu.ifpb.padroes.casainteligente.model.Quarto;
import br.edu.ifpb.padroes.casainteligente.model.Sala;

public class HaIncendioBanheiro implements State {

	private Banheiro banheiro;

	public HaIncendioBanheiro(Banheiro banheiro) {
		super();
		this.banheiro = banheiro;
	}

	@Override
	public String ligarEsguicho() {
		// TODO Auto-generated method stub
		return "Esguicho já se encontra ligado";
	}

	@Override
	public String desligarEsguicho() {
		// TODO Auto-generated method stub
		banheiro.setEstado(banheiro.getNaoHaIncendio());
		return "Esguicho desligado";
	}


}
