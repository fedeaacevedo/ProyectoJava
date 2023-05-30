package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(2L);
        usuario.setNombre("Federico");
        usuario.setApellido("Acevedo");
        usuario.setEmail("fede@correo.com");
        usuario.setTelefono("2214288025");

        Usuario usuario2 = new Usuario();
        usuario2.setId(34L);
        usuario2.setNombre("Francesca");
        usuario2.setApellido("Acevedo");
        usuario2.setEmail("fran@correo.com");
        usuario2.setTelefono("22142546456");

        Usuario usuario3 = new Usuario();
        usuario3.setId(1L);
        usuario3.setNombre("Felipe");
        usuario3.setApellido("Acevedo");
        usuario3.setEmail("feli@correo.com");
        usuario3.setTelefono("221234234");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
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
