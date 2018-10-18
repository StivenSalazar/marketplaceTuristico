package marketPlaceFront.marketPlace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controlador {

	@RequestMapping(value= {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("paginaPrincipal");
		mv.addObject("saludo", "Spring Web MVC Aplicacion Dummie");
		
		return mv;
	}
}


