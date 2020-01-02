package br.edu.ifpb.padroes.casainteligente.state;

import br.edu.ifpb.padroes.casainteligente.model.Banheiro;
import br.edu.ifpb.padroes.casainteligente.model.Cozinha;
import br.edu.ifpb.padroes.casainteligente.model.Quarto;
import br.edu.ifpb.padroes.casainteligente.model.Sala;

public class NaoHaIncendioCozinha implements State {

	private Cozinha cozinha;

	public NaoHaIncendioCozinha(Cozinha cozinha) {
		super();
		this.cozinha = cozinha;
	}

	@Override
	public String ligarEsguicho() {
		// TODO Auto-generated method stub
		cozinha.setEstado(cozinha.getHaIncendio());
		return "Esguicho Ligado!!";
	}

	@Override
	public String desligarEsguicho() {
		// TODO Auto-generated method stub
		return "Esguicho se encontra desligado, pois não há incêndio";
	}

}
