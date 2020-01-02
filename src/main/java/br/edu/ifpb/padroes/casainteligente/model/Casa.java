package br.edu.ifpb.padroes.casainteligente.model;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.jar.Manifest;

import org.apache.tomcat.Jar;

import br.edu.ifpb.padroes.casainteligente.decorator.ArCondicionadoDecorator;
import br.edu.ifpb.padroes.casainteligente.decorator.CafeteiraDecorator;
import br.edu.ifpb.padroes.casainteligente.decorator.CenarioComponente;
import br.edu.ifpb.padroes.casainteligente.decorator.LuzDecorator;
import br.edu.ifpb.padroes.casainteligente.decorator.PiscinaDecorator;
import br.edu.ifpb.padroes.casainteligente.decorator.PrivadaDecorator;
import br.edu.ifpb.padroes.casainteligente.decorator.RadioDecorator;
import br.edu.ifpb.padroes.casainteligente.decorator.TelevisaoDecorator;

public class Casa {

	private CenarioComponente cozinha;
	private CenarioComponente jardim;
	private CenarioComponente quarto;
	private CenarioComponente sala;
	private CenarioComponente banheiro;
	
	public Casa() {}

	public CenarioComponente getCozinha() {
		return cozinha;
	}

	public void setCozinha() {
		this.cozinha = new LuzDecorator(new CafeteiraDecorator(new TelevisaoDecorator(new RadioDecorator(new Cozinha()))));
	}

	public CenarioComponente getJardim() {
		return jardim;
	}

	public void setJardim() {
		
		this.jardim = new LuzDecorator(new PiscinaDecorator (new TelevisaoDecorator(new RadioDecorator(new Jardim()))));
		
	}

	public CenarioComponente getQuarto() {
		return quarto;
	}

	public void setQuarto() {
		this.quarto = new LuzDecorator(new ArCondicionadoDecorator(new TelevisaoDecorator(new RadioDecorator(new Quarto()))));
	}

	public CenarioComponente getSala() {
		return sala;
	}

	public void setSala() {
		this.sala = new LuzDecorator(new TelevisaoDecorator(new RadioDecorator(new Sala())));
	}

	public CenarioComponente getBanheiro() {
		return banheiro;
	}

	public void setBanheiro() {
		Banheiro b = new Banheiro();
		PrivadaDecorator p = new PrivadaDecorator(b);
		this.banheiro = new LuzDecorator(p);
	}
	
}
