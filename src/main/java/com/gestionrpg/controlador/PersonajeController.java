package com.gestionrpg.controlador;

import com.gestionrpg.repositorio.PersonajeRepository;
import io.javalin.http.Context;

public class PersonajeController {

    // Método estático para responder con los personajes en JSON
    public static void obtenerTodos(Context ctx) {
        ctx.json(PersonajeRepository.obtenerTodos());
    }
}