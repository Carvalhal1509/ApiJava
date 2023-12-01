package com.vanessadev.projetoanuncios.service;

import com.vanessadev.projetoanuncios.domain.Anuncios;
import com.vanessadev.projetoanuncios.repository.AnunciosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnunciosService {

    @Autowired
    private AnunciosRepository repository;

    public List<Anuncios> findAll() {
        return (List<Anuncios>) repository.findAll();
    }

    public Anuncios findById(Long id) {
        return repository.findById(id).get();
    }

    public Anuncios save(Anuncios anuncios) {
        return repository.save(anuncios);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}