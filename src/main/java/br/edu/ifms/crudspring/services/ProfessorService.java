package br.edu.ifms.crudspring.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.crudspring.model.Professor;
import br.edu.ifms.crudspring.repository.ProfessorRepository;


@Service
public class ProfessorService {

    @Autowired
    ProfessorRepository professorRepository;

    public List<Professor> getProfessores(){
        return professorRepository.findAll();
        
    }
    
    public void save(Professor professor){
        professorRepository.save(professor);
    }

    public void delete(UUID id){
        professorRepository.deleteById(id);

    }

    public Professor findById(UUID id){
        return professorRepository.findById(id).get();
    }

    public Professor updateStudent(Professor professor) {
        return professorRepository.save(professor);

    }


}


