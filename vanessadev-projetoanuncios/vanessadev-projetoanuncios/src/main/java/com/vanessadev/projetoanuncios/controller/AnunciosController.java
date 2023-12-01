package com.vanessadev.projetoanuncios.controller;

import com.vanessadev.projetoanuncios.domain.Anuncios;
import com.vanessadev.projetoanuncios.service.AnunciosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/anuncios")
public class AnunciosController {

    @Autowired
    private AnunciosService service;

    @GetMapping
    public ResponseEntity<List<Anuncios>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Anuncios> getById(@PathVariable Long id) {
    	Anuncios produto = service.findById(id);

        if(produto == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(produto);
    }

    @PostMapping
    public ResponseEntity<Anuncios> save(@RequestBody Anuncios anuncios) {
        return new ResponseEntity<>(service.save(anuncios), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Anuncios> update(@RequestBody Anuncios anuncios) {
        return ResponseEntity.ok(service.save(anuncios));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}