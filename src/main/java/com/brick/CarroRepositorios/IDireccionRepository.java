package com.brick.CarroRepositorios;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.brick.CarroUtileria.Direccion;

public interface IDireccionRepository extends MongoRepository<Direccion, Integer> {

}
