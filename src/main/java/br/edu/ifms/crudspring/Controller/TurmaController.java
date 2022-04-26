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

import br.edu.ifms.crudspring.model.Turma;
import br.edu.ifms.crudspring.services.TurmaService;


@Controller
@RequestMapping("/Turma")

public class TurmaController {
   
    @Autowired
    TurmaService turmaService;

    @PostMapping("/save")
    public String save(@ModelAttribute("turma") Turma turma){
        turmaService.save(turma);
        return "redirect:/turma/";
    }

    @GetMapping("/")
    public String locAll(Model model){
        List<Turma> turmas = turmaService.getTurmas();
        model.addAttribute("turmas", turmas);
        return "index-turma";
    }

    @GetMapping("/turma-cadastrar")
    public String newTurma(Model model) {
        model.addAttribute("turma", new Turma());
        return "turma-cadastrar";
    }

    @GetMapping("/remove/{id}")
    public String removeTurma(@PathVariable("id") UUID id){
    turmaService.delete(id);
        return "redirect:/turma/";
    }

    @GetMapping("/edit/{id}")
    public String editTurma(@PathVariable("id") UUID id, Model model){

    Turma turma = turmaService.findById(id);
        model.addAttribute("turma", turma);

        return "edit-turma";
    }

    @PostMapping("/update/{id}")
    public String updateTurma(@PathVariable("id") UUID id, @ModelAttribute Turma turma, Model model){

    turmaService.updateTurma(turma);
        return "redirect:/turma/";
    }

}