package com.example.tiburcio.intentovoluntariodetabs;

/**
 * Created by Tiburcio on 12/10/2017.
 */

public class Alumno {
    String nombre;
    int edad;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
