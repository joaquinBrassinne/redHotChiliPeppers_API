package com.redHotChilliPeppers.APIs.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Albums {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_Albumes;
    private String nombreAlbum;
    private String anioAlbum;
    private String imagenPortada;
    @OneToMany
    private List<Canciones> listaCanciones;
    
    
    public Albums() {
    }

    public Albums(Long id_Albumes, String nombreAlbum, String anioAlbum, String imagenPortada,
            List<Canciones> listaCanciones) {
        this.id_Albumes = id_Albumes;
        this.nombreAlbum = nombreAlbum;
        this.anioAlbum = anioAlbum;
        this.imagenPortada = imagenPortada;
        this.listaCanciones = listaCanciones;
    }

    
    

}
