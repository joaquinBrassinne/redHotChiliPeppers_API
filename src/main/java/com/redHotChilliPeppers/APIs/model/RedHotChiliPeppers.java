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
public class RedHotChiliPeppers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_redHot;
    @OneToMany
    private List<Albums> listaAlbumes;
    
    public RedHotChiliPeppers() {
    }
    
    public RedHotChiliPeppers(Long id_redHot, List<Albums> listaAlbumes) {
        this.id_redHot = id_redHot;
        this.listaAlbumes = listaAlbumes;
    }
 
    
    
}
