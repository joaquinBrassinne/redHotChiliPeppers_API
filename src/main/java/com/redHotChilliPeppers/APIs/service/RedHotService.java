package com.redHotChilliPeppers.APIs.service;

import com.redHotChilliPeppers.APIs.model.RedHotChiliPeppers;
import com.redHotChilliPeppers.APIs.repository.IRedHotRepository;
import com.redHotChilliPeppers.APIs.service.IRedHotService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class RedHotService implements IRedHotService{

    @Autowired
    IRedHotRepository redHotRepo;

    @Override
    public List<RedHotChiliPeppers> getRedHot() {
        List<RedHotChiliPeppers> listaRedHot = redHotRepo.findAll();
        return listaRedHot;
    }

    @Override
    public RedHotChiliPeppers saveRedHot(RedHotChiliPeppers redHot) {
        return redHotRepo.save(redHot);
    }

    @Override
    public void editRedHot(RedHotChiliPeppers redHot) {
        this.saveRedHot(redHot);
    }

    

}
