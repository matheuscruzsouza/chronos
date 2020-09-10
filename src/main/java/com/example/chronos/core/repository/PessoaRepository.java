package com.example.chronos.core.repository;

import com.example.chronos.core.model.Pessoa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, String> {
    
}
