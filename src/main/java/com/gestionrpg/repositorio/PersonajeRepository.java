package com.gestionrpg.repositorio;

import com.gestionrpg.modelo.Personaje;
import java.util.ArrayList;
import java.util.List;

public class PersonajeRepository {

    // Lista estática para guardar los personajes en memoria
    private static List<Personaje> listaPersonajes = new ArrayList<>();

    // Bloque estático para cargar datos iniciales de prueba
    static {
        listaPersonajes.add(new Personaje(1, "Aragorn", "Guerrero", 5, 100));
        listaPersonajes.add(new Personaje(2, "Gandalf", "Mago", 10, 80));
    }

    // Método para obtener la lista completa
    public static List<Personaje> obtenerTodos() {
        return listaPersonajes;
    }

    // Método para guardar un nuevo personaje
    public static void guardar(Personaje p) {
        listaPersonajes.add(p);
    }
}