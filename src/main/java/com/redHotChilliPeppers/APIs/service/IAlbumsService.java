package com.redHotChilliPeppers.APIs.service;

import com.redHotChilliPeppers.APIs.model.Albums;
import java.util.List;


public interface IAlbumsService {

    public List<Albums> getAlbumes();
    public Albums findAlbumes(Long id_albumes);
    public Albums saveAlbumes(Albums album);
    public Albums editAlbumes(Long id_album, Albums albumesDetalles);
    public void deleteAlbumes(Long id_album);
}
