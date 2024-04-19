package com.redHotChilliPeppers.APIs.service;

import com.redHotChilliPeppers.APIs.model.Canciones;
import com.redHotChilliPeppers.APIs.repository.ICancionesRepository;
import com.redHotChilliPeppers.APIs.service.ICancionesService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class CancionesService implements ICancionesService{

    @Autowired
    ICancionesRepository cancionesRepo;

    @Override
    public List<Canciones> getCanciones() {
        List<Canciones> listaCanciones = cancionesRepo.findAll();
        return listaCanciones;
    }

    @Override
    public Canciones findCanciones(Long id_canciones) {
        Canciones canciones = cancionesRepo.findById(id_canciones)
        .orElseThrow(()-> new RuntimeException("No se encontro la cancion con el ID: " + id_canciones));
        return canciones;
    }

    @Override
    public Canciones saveCanciones(Canciones canciones) {
        return cancionesRepo.save(canciones);
    }

    @Override
    public Canciones editCanciones(Long id_canciones, Canciones cancionesDetalles) {
        Canciones cancion = this.findCanciones(id_canciones);
        
        
        cancion.setNombre(cancionesDetalles.getNombre());

        return this.saveCanciones(cancion);
    }

    @Override
    public void deleteCanciones(Long id_canciones) {
        cancionesRepo.deleteById(id_canciones);
    }

}
