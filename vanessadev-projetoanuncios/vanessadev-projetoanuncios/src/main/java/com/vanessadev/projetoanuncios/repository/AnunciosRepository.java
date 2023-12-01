package com.vanessadev.projetoanuncios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vanessadev.projetoanuncios.domain.Anuncios;

@Repository
public interface AnunciosRepository extends CrudRepository<Anuncios, Long> {

}
