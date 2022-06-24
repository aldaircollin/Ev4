package edu.ilp.fcalle.dao;

import edu.ilp.fcalle.entity.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAsignaturaDao extends JpaRepository<Asignatura,Long> {
}
