
package com.redHotChilliPeppers.APIs.controller;

import com.redHotChilliPeppers.APIs.model.Canciones;
import com.redHotChilliPeppers.APIs.service.ICancionesService;
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
@RequestMapping("/redhot/albums/canciones")
public class CancionesController {
     @Autowired
    ICancionesService cancionesService;
    
    @GetMapping
    public List<Canciones> getCanciones(){
       return  cancionesService.getCanciones();
    }
    
    @GetMapping("/{id_canciones}")
    public Canciones findCancion(@PathVariable Long id_canciones){
        return cancionesService.findCanciones(id_canciones);
    }
    
    @PostMapping
    public Canciones crearCancion(@RequestBody Canciones canciones){
        return cancionesService.saveCanciones(canciones);
    }
    
    @PutMapping("/{id_canciones}")
    public Canciones editarCancion(@PathVariable Long id_canciones, @RequestBody Canciones canciones){
        return cancionesService.editCanciones(id_canciones, canciones);
    }
    
    @DeleteMapping("/{id_canciones}")
    public String borrarCancion(@PathVariable Long id_canciones){
        cancionesService.deleteCanciones(id_canciones);
         return "Cancion eliminada";
    }
            
    

}
