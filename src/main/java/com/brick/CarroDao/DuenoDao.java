package com.brick.CarroDao;

import com.brick.CarroRepositorios.IDuenoRepository;

import com.brick.CarroUtileria.Dueno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class DuenoDao {

    @Autowired
    IDuenoRepository iDuenoRepository;


    //Mostrar Lista de Duenos
    public List<Dueno> getClientes() {
        return iDuenoRepository.findAll();
    }


    //Agregar Uno Dueno
	public boolean postCliente(Dueno dueno) {
		
		return iDuenoRepository.save(dueno)!=null;
	}


	public Dueno postLogin(String correo, String pass) {
		Dueno d1= iDuenoRepository.findByCorreoAndPassword(correo, pass);
		return d1;
	}

	/*
	//login boolean
	public boolean postLogin(String correo, String pass) {
		Dueno d1= iDuenoRepository.findByCorreoAndPassword(correo, pass);
		
		return d1!=null;
	}
*/


	
}
