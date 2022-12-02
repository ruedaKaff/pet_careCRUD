package app.petCare.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import app.petCare.entity.consultas;
import app.petCare.service.IconsultasService;

@Controller
@SessionAttributes("consultas")
public class Controlador_consultas {
	
	@Autowired
	private IconsultasService service;
	
	@RequestMapping(value = { "/listar", "/resultado" }, method = RequestMethod.GET)
	public String listar (Model model) {
		List<consultas>consulta=service.findAll();
		model.addAttribute("consulta", consulta);
		return "listar";
		
	}
	
	@RequestMapping(value = {"/form","/"})
	public String crear (Map<String, Object> model) {
		
		consultas consulta = new consultas();
		model.put("consulta", consulta);
		
		return "form";
		
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String guardar( consultas consulta) {
		
		service.save(consulta);
		
		return "redirect:listar";
	}
	
	@RequestMapping(value="/eliminar/{id}")
	public String delete(@PathVariable(value="id")long id) {
		
		if (id>0) {
			service.delete(id);
		}
		return "reidrect:/listar";
	}
}
