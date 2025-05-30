package edu.sena.demoapi.service;

import edu.sena.demoapi.model.usuario;
import edu.sena.demoapi.repository.usuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class usuarioService {
    @autowired
    private usuarioRepository usuarioRepository;

    public usuario guardarUsuario(usuario usuario) {
        return usuarioRepository.save(user);
    }

    public usuario obtenerUsuario(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }
}

