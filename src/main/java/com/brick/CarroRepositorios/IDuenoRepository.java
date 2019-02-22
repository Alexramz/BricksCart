package com.brick.CarroRepositorios;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.brick.CarroUtileria.Dueno;


public interface IDuenoRepository extends MongoRepository<Dueno,Integer> {
 
	/*Gimnacio findByCorreoAndPassword(String correo, String password);
     Gimnacio findGimnacioById(String id);
*/
	//Dueno findByCorreoAndPassWord(String correo, String password);
      Dueno findByCorreoAndPassword(String correo,String password);

}
