package com.example.chronos.core.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
@Table(name = "pessoa", schema = "core")
public class Pessoa {

    @Id @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String oid;

    private String nome;
    private LocalDate datanascimento;
    private String cpf;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoa")
    private List<Projeto> projetos;
    
}
