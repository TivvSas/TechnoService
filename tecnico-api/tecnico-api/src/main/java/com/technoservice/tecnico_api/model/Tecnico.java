package com.technoservice.tecnico_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Indica que esta clase representa una tabla en la BD
@Table(name = "Tecnico") // Indica el nombre exacto de la tabla
@Data // Genera getters, setters, toString, equals y hashCode
@NoArgsConstructor // Genera constructor vacío
@AllArgsConstructor // Genera constructor con todos los atributos
public class Tecnico {

    @Id // Indica que este atributo es la clave primaria

    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que el ID se generará automáticamente
    
    @Column(name = "id_tecnico", nullable = false)
    private Long idTecnico;

    @Column(name = "nombre_tecnico", nullable = false, unique = true)
    private String nombreTecnico;

    @Column(name = "especialidad_tecnico", nullable = false)
    private String especialidadTecnico;

    @Column(name = "id_ticket", nullable = false)
    private Integer idTicket;

    
}
