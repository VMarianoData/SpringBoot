package br.org.generation.helloword.controll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") // Diz endreço onde está acessado localhost;0000/hello
public class helloWord {

	@GetMapping //coloque a infrmação abaixo no endereço
	public  String hello() {
		return "Hello World! Hello Spring!";
	}
}

//importa as biblio tecas crlt + shift + o 