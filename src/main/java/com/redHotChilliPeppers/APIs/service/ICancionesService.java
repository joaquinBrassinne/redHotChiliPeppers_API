package com.redHotChilliPeppers.APIs.service;

import com.redHotChilliPeppers.APIs.model.Canciones;
import java.util.List;



public interface ICancionesService {
    public List<Canciones> getCanciones();
    public Canciones findCanciones(Long id_canciones);
    public Canciones saveCanciones(Canciones canciones);
    public Canciones editCanciones(Long id_canciones, Canciones cancionesDetalles);
    public void deleteCanciones(Long id_canciones);
}
