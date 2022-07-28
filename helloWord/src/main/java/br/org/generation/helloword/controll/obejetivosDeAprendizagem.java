package br.org.generation.helloword.controll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/obj")

public class obejetivosDeAprendizagem {
	
	@GetMapping
	
	public String obj() {
		
		return "MySQL, SpringBoot";
	}

}
