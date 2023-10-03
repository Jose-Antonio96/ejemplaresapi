package com.ejemplares.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.ejemplares.model.Ejemplar;
import com.ejemplares.service.EjemplaresService;
import org.springframework.http.MediaType;

@RestController
public class EjemplaresController {
    @Autowired
    EjemplaresService service;

    @PostMapping(value="ejemplar/{isbn}/{titulo}/{autor}/{precio}")
    public List<Ejemplar> altaEjemplar(
    		@PathVariable ("isbn")int isbn,
    		@PathVariable ("titulo") String titulo,
            @PathVariable ("autor") String autor,
            @PathVariable ("precio") int precio){
        Ejemplar ejemplar = new Ejemplar(isbn, titulo, autor, precio);
        return service.nuevoEjemplar(ejemplar);
            }

    @GetMapping(value="ejemplares", MediaType=MediaType.APPLICATION_JSON)
    public list<Ejemplar> getEjemplares(){
        return service.ejemplares();
    }
    
}
