package com.brick.CarroController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.brick.CarroDao.PropiedadDao;

import com.brick.CarroUtileria.Propiedad;

@RestController
//@CrossOrigin(origins="http://localhost:63365")
public class PropiedadController {
	
	@Autowired
	PropiedadDao propiedadDao;
	
	//Mostrar Lista Propiedades
	@GetMapping("/propes")
	public List<Propiedad> getPropiedades(){
		return propiedadDao.getPorpiedades();
	}
	
	//Agregar Una Propiedad
	@PostMapping("/prop")
	public boolean postPropiedad(@RequestBody Propiedad propiedad) {
	return propiedadDao.postPropiedad(propiedad);
	}
	
	//Agregar Propiedad a Usuario
	@PostMapping("/dueno/{iddueno}/porp/{idprop}")
	public boolean postPropiedaddeUsuario(@PathVariable("iddueno")int iddueno,@PathVariable("idprop")int idprop) {
		return propiedadDao.postPropiedadDeUsuario(iddueno,idprop);
	}
	
}


