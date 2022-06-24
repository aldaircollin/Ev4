package edu.ilp.fcalle.dao;

import edu.ilp.fcalle.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaDao extends JpaRepository<Persona,Long> {
}
