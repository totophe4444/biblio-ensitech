package com.example.biliotheque1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.biliotheque1.entity.Livre;

public interface LivreRepository extends JpaRepository<Livre, Long> {}
