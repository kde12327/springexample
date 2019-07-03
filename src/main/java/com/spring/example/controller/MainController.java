package com.spring.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.example.dto.FruitDTO;
import com.spring.example.service.FruitService;

@Controller
public class MainController {
	
	@Autowired
	FruitService fruitService;
	
	@RequestMapping("/fruit")
	public String main(Model model) {
		
		List<FruitDTO> fruits = fruitService.fruitSearch();
		
		model.addAttribute("fruits", fruits );
		
		
		
		return "fruit";
	}
}
