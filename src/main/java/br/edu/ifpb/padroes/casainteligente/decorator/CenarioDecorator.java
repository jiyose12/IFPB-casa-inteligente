package br.edu.ifpb.padroes.casainteligente.decorator;

public abstract class CenarioDecorator extends CenarioComponente{
	
	protected CenarioComponente cenario;
	
	public CenarioDecorator(CenarioComponente cenario) {
		super();
		this.cenario = cenario;
	}

}
