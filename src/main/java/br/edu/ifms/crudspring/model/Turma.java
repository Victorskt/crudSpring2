package br.edu.ifms.crudspring.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Turma {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    UUID id;
    String nome;
    @OneToMany(mappedBy = "turma")
    List<Professor>professores;
  

}
