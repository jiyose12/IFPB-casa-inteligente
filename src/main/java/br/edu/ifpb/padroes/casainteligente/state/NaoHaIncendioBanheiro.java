package br.edu.ifpb.padroes.casainteligente.state;

import br.edu.ifpb.padroes.casainteligente.model.Banheiro;
import br.edu.ifpb.padroes.casainteligente.model.Cozinha;
import br.edu.ifpb.padroes.casainteligente.model.Quarto;
import br.edu.ifpb.padroes.casainteligente.model.Sala;

public class NaoHaIncendioBanheiro implements State {

	private Banheiro banheiro;

	public NaoHaIncendioBanheiro(Banheiro banheiro) {
		super();
		this.banheiro = banheiro;
	}

	@Override
	public String ligarEsguicho() {
		// TODO Auto-generated method stub
		banheiro.setEstado(banheiro.getHaIncendio());
		return "Esguicho Ligado!!";
	}

	@Override
	public String desligarEsguicho() {
		// TODO Auto-generated method stub
		return "Esguicho se encontra desligado, pois não há incêndio";
	}

}
