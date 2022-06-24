package edu.ilp.fcalle.service;

import edu.ilp.fcalle.entity.Asignatura;

import java.util.List;

public interface IProfesorService {
    List<Asignatura> obtenerCursoPorProfesor(Long id_profesor);
}
