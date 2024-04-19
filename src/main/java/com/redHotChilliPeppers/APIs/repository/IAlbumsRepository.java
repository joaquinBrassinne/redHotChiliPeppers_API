package com.redHotChilliPeppers.APIs.repository;

import com.redHotChilliPeppers.APIs.model.Albums;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IAlbumsRepository extends JpaRepository<Albums,Long>{

}
