package com.udistrital.rpgmanager.controlador;

import com.udistrital.rpgmanager.modelo.Personaje;
import com.udistrital.rpgmanager.repositorio.PersonajeRepositorio;
import com.udistrital.rpgmanager.servicio.PersonajeServicio;
import io.javalin.http.Context;

public class PersonajeControlador {

    // Repositorio encargado de guardar los personajes.
    private PersonajeRepositorio repositorio = new PersonajeRepositorio();

    // Servicio encargado de validar las reglas de negocio.
    private PersonajeServicio servicio = new PersonajeServicio();

    // Atiende las peticiones GET /personajes.
    public void obtenerTodos(Context ctx) {
        ctx.redirect("/index.html");
    }

    // Atiende las peticiones POST /personajes.
    public void crear(Context ctx) {

        try {
            // Recibimos los datos enviados por el formulario.
            String nombre = ctx.formParam("nombre");
            String clase = ctx.formParam("clase");

            // Convertimos el nivel recibido de texto a entero.
            int nivel = Integer.parseInt(ctx.formParam("nivel"));

            // El servicio valida las reglas de negocio.
            servicio.validarPersonaje(nombre, clase, nivel);

            // Si todo es válido, creamos el personaje.
            Personaje nuevoPersonaje =
                    new Personaje(nombre, clase, nivel);

            // Guardamos el personaje en el repositorio.
            repositorio.guardar(nuevoPersonaje);

            // Volvemos a la página principal.
            ctx.status(200);
            ctx.redirect("/index.html");

        } catch (IllegalArgumentException e) {
            // Error 400 cuando los datos no cumplen las validaciones.
            ctx.status(400);
            ctx.result(e.getMessage());

        } catch (Exception e) {
            // Error 500 para errores inesperados.
            ctx.status(500);
            ctx.result("Ocurrió un error al procesar el personaje.");
        }
    }
}
