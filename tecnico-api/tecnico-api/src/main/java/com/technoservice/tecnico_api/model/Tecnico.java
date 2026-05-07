package com.technoservice.tecnico_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "Tecnico")
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Tecnico {

    @Column(nullable = false)
    private Long idTecnico;

    @Column(nullable = false)
    private String nombreTecnico;

    @Column(nullable = false)
    private String especialidadTecnico;

    @Column(nullable = false)
    private Integer idTicket;

    
    
    
}
