package com.example.biliotheque1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.biliotheque1.entity.Livre;
import com.example.biliotheque1.repository.LivreRepository;
import com.example.biliotheque1.service.LivreService;
import com.example.biliotheque1.service.LivreServiceItf;

@Controller
public class LivreController {
	@Autowired
	private LivreServiceItf livreService;
	
	@RequestMapping("/accueil")
    public String accueil() {
		System.out.println("==== /accueil ====");
        return "accueil";
    }
	@RequestMapping("/administrer")
    public String administrer(Model model) {
		System.out.println("==== /administrer ====");
    	model.addAttribute("livreList", livreService.getAllLivre());
        return "administrer";
    }
}
