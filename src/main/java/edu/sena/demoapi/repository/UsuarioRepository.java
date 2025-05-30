package edu.sena.demoapi.repository;

import edu.sena.demoapi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // JpaRepository te da métodos como save(), findById(), findAll(), delete(), etc.
    // Aquí puedes agregar métodos personalizados si los necesitas
}