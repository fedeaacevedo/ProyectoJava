package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){


    }


    @RequestMapping(value = "usuario12")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Federico");
        usuario.setApellido("Acevedo");
        usuario.setEmail("fede@correo.com");
        usuario.setTelefono("2214288025");

        return usuario;
    }


    @RequestMapping(value = "usuario1")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Federico");
        usuario.setApellido("Acevedo");
        usuario.setEmail("fede@correo.com");
        usuario.setTelefono("2214288025");

        return usuario;
    }


    @RequestMapping(value = "usuario21")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Federico");
        usuario.setApellido("Acevedo");
        usuario.setEmail("fede@correo.com");
        usuario.setTelefono("2214288025");

        return usuario;
    }

}
