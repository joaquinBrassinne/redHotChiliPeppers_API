
package com.redHotChilliPeppers.APIs.controller;

import com.redHotChilliPeppers.APIs.model.Albums;
import com.redHotChilliPeppers.APIs.service.IAlbumsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redhot/albums")
public class AlbumController {
    @Autowired
    IAlbumsService albumService;
    
    @GetMapping
    public List<Albums> getAlbums(){
       return  albumService.getAlbumes();
    }
    
    @GetMapping("/{id_albums}")
    public Albums findAlbum(@PathVariable Long id_albums){
        return albumService.findAlbumes(id_albums);
    }
    
    @PostMapping
    public Albums crearAlbum(@RequestBody Albums album){
        return albumService.saveAlbumes(album);
    }
    
    @PutMapping("/{id_album}")
    public Albums editarAlbum(@PathVariable Long id_album, @RequestBody Albums album){
        return albumService.editAlbumes(id_album, album);
    }
    
    @DeleteMapping("/{id_album}")
    public String borrarAlbum(@PathVariable Long id_album){
        albumService.deleteAlbumes(id_album);
         return "Album eliminado";
    }
            
    
}
