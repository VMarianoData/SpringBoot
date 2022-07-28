package br.org.generation.helloword.controll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")

public class BSM {
	
	@GetMapping
	
	public String bsm() {
		
		return "-Orientação ao Futuro\n-Renponsabilidade Pessoal\n-Mentalidade de Crescimento\n-Persistência"
				+ "\n-Trabalho em Equipe\n-Atenção aos Detalhes\n-Proatividade\n-Comunicação";
	}

}
