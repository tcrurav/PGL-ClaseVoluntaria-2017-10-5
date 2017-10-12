package com.example.tiburcio.intentovoluntariodetabs;

import android.app.Application;

import java.util.ArrayList;

/**
 * Created by Tiburcio on 05/10/2017.
 */

public class Principal extends Application {
    String pepe;
    ArrayList<Alumno> alumnos;

    public Principal() {
        this.pepe = "Nadita al principio";
        this.alumnos = new ArrayList<>();
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public String getPepe() {
        return pepe;
    }

    public void setPepe(String pepe) {
        this.pepe = pepe;
    }
}
