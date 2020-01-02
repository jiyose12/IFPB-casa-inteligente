package br.edu.ifpb.padroes.casainteligente.builder;

import br.edu.ifpb.padroes.casainteligente.model.Casa;

public class CasaDiretor {

	protected CasaBuilder montar;
	
	public CasaDiretor(CasaBuilder montar) {
		this.montar = montar;
	}
	
	public void construirCasa() {
		montar.buildCozinha();
		montar.buildJardim();
		montar.buildQuarto();
		montar.buildSala();
		montar.buildBanheiro();
	}
	
    public Casa getCasa() {
        return montar.getCasa();
    }
}
