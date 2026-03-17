package hackatonScrumless.controller;

import hackatonScrumless.Ciudadano;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	public HomeController() {
		System.out.println(">>> HomeController CARGADO");
	}

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@PostMapping("/loginCiudadano")
	public Ciudadano login(@RequestParam String nik,
						   @RequestParam String contrasena,
						   Model model) {

		// Aquí ya tienes los datos del HTML
		System.out.println("Usuario: " + nik);
		System.out.println("Contraseña: " + contrasena);


		// Los pasas a la vista si quieres
		model.addAttribute("nik", nik);
		model.addAttribute("contrasena", contrasena);

		// De momento volvemos al mismo index
		return new Ciudadano(nik, );
	}
}

