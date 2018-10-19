package marketPlaceFront.marketPlace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controlador {

	@RequestMapping(value= {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("paginaPrincipal");
		mv.addObject("titulo", "Home");
		mv.addObject("userClickHome", true);
		
		return mv;
	}
	
	@RequestMapping(value="/quienesSomos")
	public ModelAndView quienes() {
		ModelAndView mv = new ModelAndView("paginaPrincipal");
		mv.addObject("titulo", "QuienesSomos");
		mv.addObject("userClickQuienes", true);
		
		return mv;
	}
	
	@RequestMapping(value="/destinos")
	public ModelAndView destinos() {
		ModelAndView mv = new ModelAndView("paginaPrincipal");
		mv.addObject("titulo", "Destinos");
		mv.addObject("userClickDestinos", true);
		
		return mv;
	}
	
	@RequestMapping(value="/contactenos")
	public ModelAndView contactenos() {
		ModelAndView mv = new ModelAndView("paginaPrincipal");
		mv.addObject("titulo", "Contactenos");
		mv.addObject("userClickContactenos", true);
		
		return mv;
	}
	
	@RequestMapping(value="/encuesta")
	public ModelAndView encuesta() {
		ModelAndView mv = new ModelAndView("paginaPrincipal");
		mv.addObject("titulo", "Encuesta");
		mv.addObject("userClickEncuesta", true);
		
		return mv;
	}
}
