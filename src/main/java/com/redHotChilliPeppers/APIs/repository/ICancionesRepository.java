package com.redHotChilliPeppers.APIs.repository;

import com.redHotChilliPeppers.APIs.model.Canciones;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ICancionesRepository extends JpaRepository<Canciones,Long>{

}
