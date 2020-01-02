package br.edu.ifpb.padroes.casainteligente.builder;

public class FestaEmCasaBuilder extends CasaBuilder{
	
	public FestaEmCasaBuilder() {}

	@Override
	public void buildJardim() {
		
	}

	@Override
	public void buildQuarto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildCozinha() {
		casa.setCozinha();
		
	}

	@Override
	public void buildSala() {
		casa.setSala();
		
	}

	@Override
	public void buildBanheiro() {
		casa.setBanheiro();
		
	}

}
