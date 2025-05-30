package edu.sena.demoapi.repository;

import edu.sena.demoapi.model.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarioRepository extends JpaRepository<usuario, Long> {
}
