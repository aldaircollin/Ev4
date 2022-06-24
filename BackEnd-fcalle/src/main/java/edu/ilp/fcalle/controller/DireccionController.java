package edu.ilp.fcalle.controller;

import edu.ilp.fcalle.entity.Direccion;
import edu.ilp.fcalle.service.IDireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("direccion")
public class DireccionController {

    @Autowired
    private IDireccionService IDireccionService;

    @GetMapping( "/buscarDireccionPorCodigo" )
    public Direccion buscarDireccionPorCodigo(@RequestParam String codigo) {
        return this.IDireccionService.obtenerDireccionPorCodigo (codigo);
    }
}
