package app.petCare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import app.petCare.service.Idatos_mascota;

@Controller
@SessionAttributes("datos_mascota")
public class mascotas_Controller {
	
	@Autowired 
	private Idatos_mascota service;
	
	@RequestMapping(value = "/listar_mascotas", method = RequestMethod.GET)
	public String listar_mascotas(Model model) {
		model.addAttribute("datos_mascota", service.findAll());
		return "listar_mascotas";
	}

}
