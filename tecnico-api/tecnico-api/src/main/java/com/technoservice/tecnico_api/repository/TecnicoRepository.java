package com.technoservice.tecnico_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technoservice.tecnico_api.model.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Long> {
    
}
