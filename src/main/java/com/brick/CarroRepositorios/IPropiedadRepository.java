package com.brick.CarroRepositorios;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.brick.CarroUtileria.Propiedad;

public interface IPropiedadRepository extends MongoRepository<Propiedad, Integer> {

}
