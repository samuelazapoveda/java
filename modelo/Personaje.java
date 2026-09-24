package com.udistrital.rpgmanager.modelo;

public class Personaje {

    // Atributos del personaje.
    private int id;
    private String nombre;
    private String clase;
    private int nivel;
    private int vida;

    // Constructor con todos los atributos.
    public Personaje(String nombre, int id, int nivel, int vida, String clase) {
        this.nombre = nombre;
        this.id = id;
        this.nivel = nivel;
        this.vida = vida;
        this.clase = clase;
    }

    // Constructor utilizado cuando el formulario envía
    // solamente nombre, clase y nivel.
    public Personaje(String nombre, String clase, int nivel) {
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = nivel;
        this.id = 0;
        this.vida = 0;
    }

    // Getter del nombre.
    public String getNombre() {
        return nombre;
    }

    // Getter del ID.
    public int getId() {
        return id;
    }

    // Getter del nivel.
    public int getnivel() {
        return nivel;
    }

    // Getter de la vida.
    public int getvida() {
        return vida;
    }

    // Getter de la clase.
    public String getclase() {
        return clase;
    }

    // Setter del nombre.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Setter del ID.
    public void setId(int id) {
        this.id = id;
    }

    // Setter del nivel.
    public void setnivel(int nivel) {
        this.nivel = nivel;
    }

    // Setter de la vida.
    public void setvida(int vida) {
        this.vida = vida;
    }

    // Setter de la clase.
    public void setclase(String clase) {
        this.clase = clase;
    }
}
