package org.aguzman.webapp.jaxws.service;

import jakarta.jws.WebService;
import org.aguzman.webapp.jaxws.models.Curso;

import java.util.List;

@WebService // indicar que será publicado como serviço web
public interface ServicioWs {
    String saludar(String persona);
    List<Curso> listar();
    Curso crear(Curso curso);
}
