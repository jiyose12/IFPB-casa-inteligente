package br.edu.ifpb.padroes.casainteligente.model;

import org.springframework.stereotype.Component;

import br.edu.ifpb.padroes.casainteligente.decorator.CenarioComponente;
import br.edu.ifpb.padroes.casainteligente.state.HaIncendioSala;
import br.edu.ifpb.padroes.casainteligente.state.HaIncendioBanheiro;
import br.edu.ifpb.padroes.casainteligente.state.NaoHaIncendioSala;
import br.edu.ifpb.padroes.casainteligente.state.NaoHaIncendioBanheiro;
import br.edu.ifpb.padroes.casainteligente.state.State;

@Component
public class Banheiro extends CenarioComponente{

	State haIncendio;
	State naoHaIncendio;
	
	State estado;

	public Banheiro() {
		haIncendio = new HaIncendioBanheiro(this);
		naoHaIncendio = new NaoHaIncendioBanheiro(this);
		
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
		return " do banheiro";
	}

	@Override
	public String desligarLuz() {
		// TODO Auto-generated method stub
		return " do banheiro";
	}

	@Override
	public String ligarRadio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String desligarRadio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ligarTelevisao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String desligarTelevisao() {
		// TODO Auto-generated method stub
		return null;
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
		return null;
	}

	@Override
	public String desligarCafeteira() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ligarPrivada() {
		// TODO Auto-generated method stub
		return " do banheiro";
	}

	@Override
	public String fazerCafe() {
		// TODO Auto-generated method stub
		return null;
	}

}
