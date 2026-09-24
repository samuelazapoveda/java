package com.udistrital.rpgmanager;

import com.udistrital.rpgmanager.controlador.PersonajeControlador;
import io.javalin.Javalin;

public class Mavenproject2 {

    public static void main(String[] args) {

        // Creamos el controlador que atenderá las peticiones.
        PersonajeControlador controlador = new PersonajeControlador();

        // Iniciamos Javalin en el puerto 7071.
        Javalin app = Javalin.create(config -> {
            // Permite servir los archivos de la carpeta /public.
            config.staticFiles.add("/public");
        }).start(7071);

        // Ruta GET para consultar personajes.
        app.get("/personajes", controlador::obtenerTodos);

        // Ruta POST para crear un personaje.
        app.post("/personajes", controlador::crear);
    }
}
