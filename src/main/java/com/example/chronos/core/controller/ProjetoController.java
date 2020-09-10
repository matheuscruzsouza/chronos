package com.example.chronos.core.controller;

import com.example.chronos.core.model.Projeto;
import com.example.chronos.core.repository.ProjetoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("projeto")
public class ProjetoController {

    @Autowired
    private ProjetoRepository repository;

    @GetMapping
    public Iterable<Projeto> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Projeto create(@RequestBody Projeto projeto) {
        return this.repository.save(projeto);
    }
    
}
