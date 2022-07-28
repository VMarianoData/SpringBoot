package br.org.generation.helloword.controll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")

public class BSM {
	
	@GetMapping
	
	public String bsm() {
		
		return "-Orientação ao Futuro<br>-Renponsabilidade Pessoal<br>-Mentalidade de Crescimento<br>-Persistência"
				+ "<br>-Trabalho em Equipe<br>-Atenção aos Detalhes<br>-Proatividade<br>-Comunicação";
	}

}
