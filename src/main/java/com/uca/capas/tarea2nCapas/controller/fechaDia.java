package com.uca.capas.tarea2nCapas.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*http://localhost:8080/diaSegunFecha?dia=19&mes=4&anio=2020*/

@Controller
public class fechaDia {
	
	public String returnDate(String dia, String mes, String anio) throws ParseException  {
		String concat = dia+"/"+mes+"/"+anio;
		Calendar date = Calendar.getInstance();
		date.setTime(new SimpleDateFormat("dd/MM/yyyy").parse(concat));
		String diaDeSemana = date.getDisplayName(date.DAY_OF_WEEK, date.LONG, Locale.US);
		return diaDeSemana;
	}
	
	@RequestMapping("/diaSegunFecha")
	public @ResponseBody String returnFecha(HttpServletRequest request) throws ParseException {
		String dia = request.getParameter("dia").toString();
		String mes = request.getParameter("mes").toString();
		String anio = request.getParameter("anio").toString();
		return "El dia de esa fecha fue: "+returnDate(dia,mes,anio);
	}
		
}

