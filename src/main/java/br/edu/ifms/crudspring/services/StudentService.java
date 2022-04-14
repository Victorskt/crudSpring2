package br.edu.ifms.crudspring.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.crudspring.model.Student;
import br.edu.ifms.crudspring.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents(){
        return studentRepository.findAll();
        
    }
    
    public void save(Student student){
        studentRepository.save(student);
    }

    public void delete(UUID id){
        studentRepository.deleteById(id);

    }

    public Student findById(UUID id){
        return studentRepository.findById(id).get();
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);

    }


}


