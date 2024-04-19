package com.redHotChilliPeppers.APIs.service;

import com.redHotChilliPeppers.APIs.model.Albums;
import com.redHotChilliPeppers.APIs.repository.IAlbumsRepository;
import com.redHotChilliPeppers.APIs.service.IAlbumsService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AlbumService implements IAlbumsService {

    @Autowired
    IAlbumsRepository albumRepo;

    @Override
    public List<Albums> getAlbumes() {
        List<Albums> listaAlbumbes = albumRepo.findAll();
        return listaAlbumbes;
    }

    @Override
    public Albums findAlbumes(Long id_albumes) {
        
        Albums album = albumRepo.findById(id_albumes)
        .orElseThrow(() -> new RuntimeException("No se encontro el album con la ID: " + id_albumes));
        return album;
        
    }

    @Override
    public Albums saveAlbumes(Albums album) {
        return albumRepo.save(album);
    }

    @Override
    public Albums editAlbumes(Long id_album, Albums albumesDetalles) {
        Albums album = this.findAlbumes(id_album);

        album.setNombreAlbum(albumesDetalles.getNombreAlbum());
        album.setAnioAlbum(albumesDetalles.getAnioAlbum());
        album.setListaCanciones(albumesDetalles.getListaCanciones());
        
        return this.saveAlbumes(album);
    }

    @Override
    public void deleteAlbumes(Long id_album) {
        albumRepo.deleteById(id_album);
    }

}
