package br.edu.ifms.crudspring.Controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifms.crudspring.model.Professor;
import br.edu.ifms.crudspring.services.ProfessorService;


@Controller
@RequestMapping("/professor")

public class ProfessorController {
   
    @Autowired
    ProfessorService professorService;

    @PostMapping("/save")
    public String save(@ModelAttribute("professor") Professor professor){
        professorService.save(professor);
        return "redirect:/professor/";
    }

    @GetMapping("/")
    public String locAll(Model model){
        List<Professor> professores = professorService.getProfessores();
        model.addAttribute("professores", professores);
        return "index-professor";
    }

    @GetMapping("/professor-cadastrar")
    public String newProfessor(Model model) {
        model.addAttribute("professor", new Professor());
        return "professor-cadastrar";
    }

    @GetMapping("/remove/{id}")
    public String removeProfessor(@PathVariable("id") UUID id){
    professorService.delete(id);
        return "redirect:/professor/";
    }

    @GetMapping("/edit/{id}")
    public String editProfessor(@PathVariable("id") UUID id, Model model){

    Professor professor = professorService.findById(id);
        model.addAttribute("professor", professor);

        return "edit-professor";
    }

    @PostMapping("/update/{id}")
    public String updateProfessor(@PathVariable("id") UUID id, @ModelAttribute Professor professor, Model model){

    professorService.updateStudent(professor);
        return "redirect:/professor/";
    }

}