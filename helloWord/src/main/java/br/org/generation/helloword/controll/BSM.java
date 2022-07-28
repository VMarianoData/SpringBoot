package br.org.generation.helloword.controll;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;








@RestController
@RequestMapping("/bsm")
public class BSM {
	
	@GetMapping("/bsm2")
	public String bsm() {
		
		return "-Orientação ao Futuro<br>-Renponsabilidade Pessoal<br>-Mentalidade de Crescimento<br>-Persistência"
				+ "<br>-Trabalho em Equipe<br>-Atenção aos Detalhes<br>-Proatividade<br>-Comunicação";
	}
	@GetMapping("/bsmJson")
	public List<String> bsmJson(){
		
		List<String> lista = new ArrayList<>();
		
		lista.add("-Orientação ao Futuro");
		lista.add("-Renponsabilidade Pessoal");
		lista.add("-Mentalidade de Crescimento");
		lista.add("-Persistência");
		lista.add("-Trabalho em Equipe");
		lista.add("-Atenção aos Detalhes");
		lista.add("-Proatividade");
		lista.add("-Comunicação");
		
		
		return lista;
	
	}

}
