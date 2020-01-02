package br.edu.ifpb.padroes.casainteligente.model;

import org.springframework.stereotype.Component;

import br.edu.ifpb.padroes.casainteligente.decorator.CenarioComponente;
import br.edu.ifpb.padroes.casainteligente.state.HaIncendioCozinha;
import br.edu.ifpb.padroes.casainteligente.state.NaoHaIncendioCozinha;
import br.edu.ifpb.padroes.casainteligente.state.State;

@Component
public class Cozinha extends CenarioComponente{

	State haIncendio;
	State naoHaIncendio;
	
	State estado;

	public Cozinha() {
		haIncendio = new HaIncendioCozinha(this);
		naoHaIncendio = new NaoHaIncendioCozinha(this);
		
		estado = naoHaIncendio;
	}
	
	public void setEstado(State estado) {
		this.estado = estado;
	}
	
	public String ligarEsguicho() {
		return estado.ligarEsguicho();
	}
	
	public String desligarEsguicho() {
		return estado.desligarEsguicho();
	}
	
	public State getHaIncendio() {
		return haIncendio;
	}
	
	public State getNaoHaIncendio() {
		return naoHaIncendio;
	}
	

	@Override
	public String ligarLuz() {
		// TODO Auto-generated method stub
		return " da cozinha";
	}

	@Override
	public String desligarLuz() {
		// TODO Auto-generated method stub
		return " da cozinha";
	}

	@Override
	public String ligarRadio() {
		// TODO Auto-generated method stub
		return " da cozinha";
	}

	@Override
	public String desligarRadio() {
		// TODO Auto-generated method stub
		return " da cozinha";
	}

	@Override
	public String ligarTelevisao() {
		// TODO Auto-generated method stub
		return " da cozinha";
	}

	@Override
	public String desligarTelevisao() {
		// TODO Auto-generated method stub
		return " da cozinha";
	}

	@Override
	public String ligarPiscina() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String desligarPiscina() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ligarArCondicionado() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String desligarArCondicionado() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ligarCafeteira() {
		// TODO Auto-generated method stub
		return " da cozinha";
	}

	@Override
	public String desligarCafeteira() {
		// TODO Auto-generated method stub
		return " da cozinha";
	}
	
	@Override
	public String fazerCafe() {
		return " na cozinha";
	}

	@Override
	public String ligarPrivada() {
		// TODO Auto-generated method stub
		return null;
	}

}
