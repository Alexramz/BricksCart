package com.brick.CarroController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.brick.CarroDao.DireccionDao;
import com.brick.CarroUtileria.Direccion;


@RestController
public class DireccionController {
	
	@Autowired
	DireccionDao direccionDao;
	
	//Agregar Direccion
	@PostMapping("/direccion")
	public boolean postDireccion(@RequestBody Direccion direccion) {
		return direccionDao.postDireccion(direccion);
	}
	//Mostrar Lista Direcciones
	@GetMapping("/direcciones")
	public List<Direccion> getDirecciones(){
		return direccionDao.getDirecciones();
	}
}
