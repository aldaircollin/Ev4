package edu.ilp.fcalle.service;

import edu.ilp.fcalle.entity.Asignatura;

import java.util.List;

public interface IAsignaturaService {
    Asignatura guardarAsignatura(Asignatura asignatura);

    List<Asignatura> listarAsignatura();
}
