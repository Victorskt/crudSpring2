package br.edu.ifms.crudspring.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.crudspring.model.Turma;
import br.edu.ifms.crudspring.repository.TurmaRepository;

@Service
public class TurmaService {

    @Autowired
    TurmaRepository turmaRepository;

    public List<Turma> getTurmas(){
        return turmaRepository.findAll();
        
    }
    
    public void save(Turma turma){
        turmaRepository.save(turma);
    }

    public void delete(UUID id){
        turmaRepository.deleteById(id);

    }

    public Turma findById(UUID id){
        return turmaRepository.findById(id).get();
    }

    public Turma updateTurma(Turma turma) {
        return turmaRepository.save(turma);

    }


}


