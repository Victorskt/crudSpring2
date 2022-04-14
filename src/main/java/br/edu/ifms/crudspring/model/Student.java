package br.edu.ifms.crudspring.model;

import java.util.UUID;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;

   // @NotBlank(message = "Nome não pode estar em branco");
    String name;
    String email;
    String password;



}
