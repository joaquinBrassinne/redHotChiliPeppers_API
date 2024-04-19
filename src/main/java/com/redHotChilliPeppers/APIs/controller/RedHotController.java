
package com.redHotChilliPeppers.APIs.controller;

import com.redHotChilliPeppers.APIs.model.RedHotChiliPeppers;
import com.redHotChilliPeppers.APIs.service.IRedHotService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redhot")
public class RedHotController {
    
    @Autowired
    IRedHotService redHotService;
    
    
    @GetMapping
    public List<RedHotChiliPeppers> traerRedhot(){
        return redHotService.getRedHot();
    }
    
    @PostMapping
    public RedHotChiliPeppers crearRedHot(@RequestBody RedHotChiliPeppers redhot){
        return redHotService.saveRedHot(redhot);
    }
    
    @PutMapping
    public String editRedHot(@RequestBody RedHotChiliPeppers redHot){
        redHotService.editRedHot(redHot);
        return "Red Hot editado";
    }
}
