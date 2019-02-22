package com.brick.CarroController;

import com.brick.CarroDao.DuenoDao;

import com.brick.CarroUtileria.Dueno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DuenoController {
    @Autowired
    DuenoDao duenodao;

    //Mostrar Lista Duenos
    @GetMapping("/duenos")
    public List<Dueno> getClietes (){
        return duenodao.getClientes();
    }
    //Agregar Un Dueno
    @PostMapping("/dueno")
    public boolean postCliente(@RequestBody Dueno dueno) {
    	return duenodao.postCliente(dueno);
    }
    //Login
    @PostMapping("/login/{correo}/{pass}")
    public Dueno postLogin(@PathVariable("correo")String correo,@PathVariable("pass")String pass) {
    	return duenodao.postLogin(correo,pass);
    }


}
