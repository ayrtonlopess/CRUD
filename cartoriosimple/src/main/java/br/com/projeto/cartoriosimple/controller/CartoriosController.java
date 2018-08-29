package br.com.projeto.cartoriosimple.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.projeto.cartoriosimple.model.Cartorios;
import br.com.projeto.cartoriosimple.service.CartoriosService;

@Controller
public class CartoriosController {

	@Autowired
	private CartoriosService cartoriosService;

	@GetMapping(value = { "/", "/index" })
	public String home() {
		return "index";
	}

	@GetMapping(value = { "/novo" })
	public String novo(Model model) {
		model.addAttribute("cartorios", new Cartorios());
		return "form";
	}

	public String form(Cartorios cartorios, Model model) {
		model.addAttribute("cartorios", cartorios);
		return "form";
	}

	@PostMapping(value = "/gravar")
	public String gravar(@Valid Cartorios cartorios, BindingResult bindingResult, Model model,
			RedirectAttributes redirectAttributes) {
		if (bindingResult.hasErrors()) {
			return form(cartorios, model);
		}
		cartoriosService.criar(cartorios);
		return "redirect:/listar";
	}

	@GetMapping(value = "/listar")
	public String lista(Model model) {
		model.addAttribute("listaCartorios", cartoriosService.listar());
		return "lista";
	}
	
	@GetMapping(value = "/editar/{id}")
	public String editar(Model model, @PathVariable Long id) {
		model.addAttribute("cartorios", cartoriosService.buscar(id));
		return "form";
	}
	
	@GetMapping(value = "/excluir/{id}")
	public String excluir(@PathVariable Long id) {
		cartoriosService.excluir(id);
		return "redirect:/listar";
	}
	
}
