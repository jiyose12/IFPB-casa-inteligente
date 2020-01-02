package br.edu.ifpb.padroes.casainteligente.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.ifpb.padroes.casainteligente.builder.CasaDiretor;
import br.edu.ifpb.padroes.casainteligente.builder.FestaEmCasaBuilder;
import br.edu.ifpb.padroes.casainteligente.builder.FestaNaPiscinaBuilder;
import br.edu.ifpb.padroes.casainteligente.model.Casa;

@Controller
public class FestaNaPiscinaController {

CasaDiretor montar;
	
	Casa casa;
	
	/*
	 * Festa na piscina
	 * 
	 * */
	@GetMapping("/festa-na-piscina")
	public ModelAndView criarFestaNaPiscina(Model model) {
		 
		 this.montar = new CasaDiretor(new FestaNaPiscinaBuilder());
		 
		 this.montar.construirCasa();
		 
		 this.casa = this.montar.getCasa();
		 
		 return new ModelAndView("cenario/festa-na-piscina");
	}

//	jardim
	@GetMapping("/festa-em-casa/ligar-piscina-jardim")
	public ModelAndView ligarPiscina(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.casa.getJardim().ligarPiscina());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-na-piscina");
	}
	@GetMapping("/festa-em-casa/desligar-piscina-jardim")
	public ModelAndView desligarPiscina(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.casa.getJardim().desligarPiscina());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-na-piscina");
	}
	@GetMapping("/festa-em-casa/ligar-luz-jardim")
	public ModelAndView ligarLuzJardim(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.casa.getJardim().ligarLuz());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
	    return new ModelAndView("redirect:/festa-na-piscina");
	}
	
	@GetMapping("/festa-em-casa/desligar-luz-jardim")
	public ModelAndView desligarLuzJardim(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.casa.getJardim().desligarLuz());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
	    return new ModelAndView("redirect:/festa-na-piscina");
	}
}
