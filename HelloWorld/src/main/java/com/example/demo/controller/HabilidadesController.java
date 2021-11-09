package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Texto")

public class HabilidadesController {
	
	@GetMapping
	public String Texto() {
		return "Persistência, Atenção aos detalhes e Mentalidade de crescimento";
	}

}


