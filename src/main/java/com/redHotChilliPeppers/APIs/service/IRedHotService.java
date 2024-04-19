package com.redHotChilliPeppers.APIs.service;

import com.redHotChilliPeppers.APIs.model.RedHotChiliPeppers;
import java.util.List;



public interface IRedHotService {
    public List<RedHotChiliPeppers> getRedHot();
    public RedHotChiliPeppers saveRedHot(RedHotChiliPeppers redHot);
    public void editRedHot(RedHotChiliPeppers redHot);
    
}
