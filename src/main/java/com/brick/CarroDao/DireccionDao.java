package com.brick.CarroDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brick.CarroRepositorios.IDireccionRepository;
import com.brick.CarroUtileria.Direccion;

@Service
public class DireccionDao {
	@Autowired
	IDireccionRepository iDireccionRepository;

	//Agregar una direccion
	public boolean postDireccion(Direccion direccion) {
		
		return iDireccionRepository.save(direccion)!=null;
	}
	//Mostrar Lista de Direcciones
	public List<Direccion> getDirecciones() {
		// TODO Auto-generated method stub
		return iDireccionRepository.findAll();
	}
}
