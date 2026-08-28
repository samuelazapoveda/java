package com.gestionrpg;

import com.gestionrpg.controlador.PersonajeController;
import io.javalin.Javalin;

public class Rpgjava {

    public static void main(String[] args) {
        // Inicializa Javalin en el puerto 7070
        Javalin app = Javalin.create().start(7071);

        // Define la ruta GET /personajes
        app.get("/personajes", PersonajeController::obtenerTodos);
    }
}