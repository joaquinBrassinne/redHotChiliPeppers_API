package com.redHotChilliPeppers.APIs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Canciones {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_cancion; 
    private String nombre;
    
    
    
    public Canciones() {
    }
    
    public Canciones(Long id_cancion, String nombre) {
        this.id_cancion = id_cancion;
        this.nombre = nombre;
    }

    
}
