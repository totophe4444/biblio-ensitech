package com.example.biliotheque1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.biliotheque1.entity.Livre;
import com.example.biliotheque1.repository.LivreRepository;

@Service
public class LivreService implements LivreServiceItf{
	@Autowired
	private LivreRepository livreRepository;

	@Override
	public List<Livre> getAllLivre() {
		return livreRepository.findAll();
	}
	
	
	
}
