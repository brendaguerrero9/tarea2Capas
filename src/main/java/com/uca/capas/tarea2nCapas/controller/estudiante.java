package com.uca.capas.tarea2nCapas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class estudiante {
	@RequestMapping("/imprimirEstudiante")
	public @ResponseBody String imprimirEstudiante() {
		String txt = "Brenda Marcela Guerrero Diaz|00024317| Ingeneria en Sistemas Informaticos| Cuarto Año";
		return txt;
	}
}
