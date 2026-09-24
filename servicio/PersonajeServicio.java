package com.udistrital.rpgmanager.servicio;

public class PersonajeServicio {

    // Valida las reglas de negocio del personaje.
    public void validarPersonaje(String nombre, String clase, int nivel) {

        // El nombre no puede ser nulo ni estar vacío.
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El nombre no puede estar vacío"
            );
        }

        // La clase debe ser Guerrero, Mago o Arquero.
        if (clase == null ||
            (!clase.equals("Guerrero")
            && !clase.equals("Mago")
            && !clase.equals("Arquero"))) {

            throw new IllegalArgumentException(
                    "Clase no válida. Debe ser Guerrero, Mago o Arquero"
            );
        }

        // El nivel permitido está entre 1 y 100.
        if (nivel < 1 || nivel > 100) {
            throw new IllegalArgumentException(
                    "El nivel debe estar entre 1 y 100"
            );
        }
    }
}
