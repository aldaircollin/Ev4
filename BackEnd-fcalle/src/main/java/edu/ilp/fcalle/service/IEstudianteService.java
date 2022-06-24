package edu.ilp.fcalle.service;

import edu.ilp.fcalle.entity.Estudiante;

import java.util.List;

public interface IEstudianteService {
    Estudiante obtenerEstudiantePorCodigo(String codigo);

    Estudiante guardarEstudiante(Estudiante estudiante);

    void eliminarUnEstudiante(Long idestudiante);

    List<Estudiante> listarEstudiante();
}
