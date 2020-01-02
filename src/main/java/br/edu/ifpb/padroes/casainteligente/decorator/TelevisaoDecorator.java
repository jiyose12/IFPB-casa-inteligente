package br.edu.ifpb.padroes.casainteligente.decorator;

import br.edu.ifpb.padroes.casainteligente.decorator.CenarioComponente;
import br.edu.ifpb.padroes.casainteligente.decorator.CenarioDecorator;

public class TelevisaoDecorator  extends CenarioDecorator{

	public TelevisaoDecorator(CenarioComponente cenario) {
		super(cenario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ligarLuz() {
		// TODO Auto-generated method stub
		return cenario.ligarLuz();
	}

	@Override
	public String desligarLuz() {
		// TODO Auto-generated method stub
		return cenario.desligarLuz();
	}

	@Override
	public String ligarRadio() {
		// TODO Auto-generated method stub
		return cenario.ligarRadio();
	}

	@Override
	public String desligarRadio() {
		// TODO Auto-generated method stub
		return cenario.desligarRadio();
	}
	@Override
	public String ligarTelevisao() {
		// TODO Auto-generated method stub
		return "Televisão ligada" + cenario.ligarTelevisao();
	}

	@Override
	public String desligarTelevisao() {
		// TODO Auto-generated method stub
		return "Televisão desligada" + cenario.desligarTelevisao();
	}

	@Override
	public String ligarPiscina() {
		// TODO Auto-generated method stub
		return cenario.ligarPiscina();
	}

	@Override
	public String desligarPiscina() {
		// TODO Auto-generated method stub
		return cenario.desligarPiscina();
	}

	@Override
	public String ligarArCondicionado() {
		// TODO Auto-generated method stub
		return cenario.ligarArCondicionado();
	}

	@Override
	public String desligarArCondicionado() {
		// TODO Auto-generated method stub
		return cenario.desligarArCondicionado();
	}

	@Override
	public String ligarCafeteira() {
		// TODO Auto-generated method stub
		return cenario.ligarCafeteira();
	}

	@Override
	public String desligarCafeteira() {
		// TODO Auto-generated method stub
		return cenario.desligarCafeteira();
	}
	
	@Override
	public String ligarPrivada() {
		// TODO Auto-generated method stub
		return cenario.ligarPrivada();
	}

	@Override
	public String fazerCafe() {
		// TODO Auto-generated method stub
		return cenario.fazerCafe();
	}

}
