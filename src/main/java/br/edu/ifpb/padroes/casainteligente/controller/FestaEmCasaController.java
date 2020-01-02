package br.edu.ifpb.padroes.casainteligente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.ifpb.padroes.casainteligente.builder.CasaDiretor;
import br.edu.ifpb.padroes.casainteligente.builder.FestaEmCasaBuilder;
import br.edu.ifpb.padroes.casainteligente.model.Banheiro;
import br.edu.ifpb.padroes.casainteligente.model.Casa;
import br.edu.ifpb.padroes.casainteligente.model.Cozinha;
import br.edu.ifpb.padroes.casainteligente.model.Sala;

@Controller
public class FestaEmCasaController {
	
	CasaDiretor montar;
	
	Casa casa;
	
	@Autowired
	Sala sala;
	@Autowired
	Banheiro banheiro;
	@Autowired
	Cozinha cozinha;
	
//	Casa casa = montar.getCasa();
	
	@GetMapping("/")
	public String casa() {
		 
		 return "casa";
	}
	
	/*
	 * Festa em casa
	 * 
	 * */
	@GetMapping("/festa-em-casa")
	public ModelAndView criarFestaEmCasa(Model model) {
		 
		 this.montar = new CasaDiretor(new FestaEmCasaBuilder());
		 
		 this.montar.construirCasa();
		 
		 this.casa = this.montar.getCasa();
		 
		 return new ModelAndView("cenario/festa-em-casa");
	}
	//banheiro 
	@GetMapping("/festa-em-casa/ha-incendio-banheiro")
	public ModelAndView ligarEsguichoBanheiro(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.banheiro.ligarEsguicho());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-em-casa");
	}
	@GetMapping("/festa-em-casa/nao-ha-incendio-banheiro")
	public ModelAndView desligarEsguichoBanheiro(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.banheiro.desligarEsguicho());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-em-casa");
	}
	@GetMapping("/festa-em-casa/ligar-luz-banheiro")
	public ModelAndView ligarLuzBanheiro(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.casa.getBanheiro().ligarLuz());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-em-casa");
	}
	
	@GetMapping("/festa-em-casa/desligar-luz-banheiro")
	public ModelAndView desligarLuzBanheiro(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.casa.getBanheiro().desligarLuz());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-em-casa");
	}
	
	@GetMapping("/festa-em-casa/ligar-privada-banheiro")
	public ModelAndView ligarPrivada(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.casa.getBanheiro().ligarPrivada());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-em-casa");
	}
	
	
//	sala
	@GetMapping("/festa-em-casa/ha-incendio-sala")
	public ModelAndView ligarEsguichoSala(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.sala.ligarEsguicho());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-em-casa");
	}
	@GetMapping("/festa-em-casa/nao-ha-incendio-sala")
	public ModelAndView desligarEsguichoSala(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.sala.desligarEsguicho());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-em-casa");
	}
	
	@GetMapping("/festa-em-casa/ligar-luz-sala")
	public ModelAndView ligarLuzSala(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.casa.getSala().ligarLuz());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-em-casa");
	}
	
	@GetMapping("/festa-em-casa/desligar-luz-sala")
	public ModelAndView desligarLuzSala(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.casa.getSala().desligarLuz());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-em-casa");
	}
	@GetMapping("/festa-em-casa/ligar-radio-sala")
	public ModelAndView ligarRadioSala(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.casa.getSala().ligarRadio());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-em-casa");
	}
	@GetMapping("/festa-em-casa/desligar-radio-sala")
	public ModelAndView desligarRadioSala(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.casa.getSala().desligarRadio());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-em-casa");
	}
	@GetMapping("/festa-em-casa/ligar-televisao-sala")
	public ModelAndView ligarTelevisaoSala(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.casa.getSala().ligarTelevisao());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-em-casa");
	}
	@GetMapping("/festa-em-casa/desligar-televisao-sala")
	public ModelAndView desligarTelevisaoSala(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.casa.getSala().desligarTelevisao());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-em-casa");
	}
	
	
	// cozinha
	@GetMapping("/festa-em-casa/ha-incendio-cozinha")
	public ModelAndView ligarEsguichoCozinha(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.cozinha.ligarEsguicho());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-em-casa");
	}
	@GetMapping("/festa-em-casa/nao-ha-incendio-cozinha")
	public ModelAndView desligarEsguichoCozinha(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.cozinha.desligarEsguicho());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-em-casa");
	}
	@GetMapping("/festa-em-casa/ligar-luz-cozinha")
	public ModelAndView ligarLuzCozinha(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.casa.getCozinha().ligarLuz());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-em-casa");
	}
	
	@GetMapping("/festa-em-casa/desligar-luz-cozinha")
	public ModelAndView desligarLuzCozinha(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.casa.getCozinha().desligarLuz());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-em-casa");
	}
	@GetMapping("/festa-em-casa/ligar-radio-cozinha")
	public ModelAndView ligarRadioCozinha(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.casa.getCozinha().ligarRadio());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-em-casa");
	}
	@GetMapping("/festa-em-casa/desligar-radio-cozinha")
	public ModelAndView desligarRadioCozinha(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.casa.getCozinha().desligarRadio());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-em-casa");
	}
	@GetMapping("/festa-em-casa/ligar-televisao-cozinha")
	public ModelAndView ligarTelevisaoCozinha(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.casa.getCozinha().ligarTelevisao());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-em-casa");
	}
	@GetMapping("/festa-em-casa/desligar-televisao-cozinha")
	public ModelAndView desligarTelevisaoCozinha(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.casa.getCozinha().desligarTelevisao());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-em-casa");
	}
	@GetMapping("/festa-em-casa/ligar-cafeteira-cozinha")
	public ModelAndView ligarCafeteiraCozinha(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.casa.getCozinha().ligarCafeteira());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-em-casa");
	}
	@GetMapping("/festa-em-casa/desligar-cafeteira-cozinha")
	public ModelAndView desligarCafeteiraCozinha(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.casa.getCozinha().desligarCafeteira());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-em-casa");
	}
	@GetMapping("/festa-em-casa/fazer-cafe-cozinha")
	public ModelAndView fazerCafeCozinha(RedirectAttributes redirectAttributes) {
		 
		redirectAttributes.addFlashAttribute("message", this.casa.getCozinha().fazerCafe());
	    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
		 
		 return new ModelAndView("redirect:/festa-em-casa");
	}
	
	

}
