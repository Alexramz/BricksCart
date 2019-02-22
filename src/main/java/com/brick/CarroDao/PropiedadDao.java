package com.brick.CarroDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brick.CarroRepositorios.IPropiedadRepository;

import com.brick.CarroUtileria.Propiedad;

@Service
public class PropiedadDao {
	

	@Autowired
	IPropiedadRepository iPropiedadRepository;

	//Mostrar Lista de Propiedades
	public List<Propiedad> getPorpiedades() {
		return iPropiedadRepository.findAll();
	}
	//Agregar Propiedad
	public boolean postPropiedad(Propiedad propiedad) {
		return iPropiedadRepository.save(propiedad)!=null;
	}
	public boolean postPropiedadDeUsuario(int iddueno, int idprop) {
		
		return false;
	}
	
	
}
