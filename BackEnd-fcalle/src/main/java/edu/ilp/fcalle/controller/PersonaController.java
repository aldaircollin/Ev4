package edu.ilp.fcalle.controller;

import edu.ilp.fcalle.entity.Persona;
import edu.ilp.fcalle.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("persona")
public class PersonaController {
    @Autowired
    private IPersonaService personaService;

    @GetMapping("/listarPersonas")
    public List<Persona> listarPersona(){
        return this.personaService.listarPersona();
    }
}
