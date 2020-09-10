package com.example.chronos.core.controller;

import com.example.chronos.core.model.Pessoa;
import com.example.chronos.core.repository.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @GetMapping
    public Iterable<Pessoa> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Pessoa create(@RequestBody Pessoa pessoa) {
        return this.repository.save(pessoa);
    }
    
}
