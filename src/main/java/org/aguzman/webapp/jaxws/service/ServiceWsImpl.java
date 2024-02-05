package org.aguzman.webapp.jaxws.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.aguzman.webapp.jaxws.models.Curso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebService(endpointInterface = "org.aguzman.webapp.jaxws.service.ServicioWs")
public class ServiceWsImpl implements ServicioWs {
    // é stateless
    // esta classe não altera estado
    // toda vez que o serviços for consumido, irá aumentar o contador
    private int contador;
    @Override
    @WebMethod
    public String saludar(String persona) {
        System.out.println("immprimir dentro do seriço web: " + this);
        contador++;

        System.out.println("valor do contador atual en metodo saludar " + contador);

        return "Hola que tal " + persona;
    }

    @Override
    @WebMethod
    public List<Curso> listar() {
        List<Curso> list = new ArrayList<Curso>();
        list.add(new Curso("Java EE"));
        list.add(new Curso("Spring Boot"));
        list.add(new Curso("Microsservices"));
        list.add(new Curso("Rest API"));
        list.add(new Curso("Web Services"));

        return list;
    }

    @Override
    @WebMethod // indicação que é serviço web
    public Curso crear(Curso curso) {
        System.out.println("Curso guardado com exito" + curso);
        Curso nuevoCurso = new Curso();
        nuevoCurso.setNome(curso.getNome());

        return nuevoCurso;
    }
}
