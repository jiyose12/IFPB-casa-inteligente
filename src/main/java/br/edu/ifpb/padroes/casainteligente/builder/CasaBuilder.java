package br.edu.ifpb.padroes.casainteligente.builder;

import br.edu.ifpb.padroes.casainteligente.model.Casa;

public abstract class CasaBuilder {
	
	protected Casa casa;
	
    public CasaBuilder() {
        casa = new Casa();
    }
 
    public abstract void buildJardim();
 
    public abstract void buildQuarto();
 
    public abstract void buildCozinha();
 
    public abstract void buildSala();
 
    public abstract void buildBanheiro();
    
    public void construirCasaBuilder() {
    	buildJardim();
    	buildQuarto();
        buildCozinha();
        buildSala();
        buildBanheiro();
    }
 
    public Casa getCasa() {
        return casa;
    }

}
