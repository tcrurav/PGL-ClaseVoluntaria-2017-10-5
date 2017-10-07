package com.example.tiburcio.intentovoluntariodetabs;

import android.app.Application;

/**
 * Created by Tiburcio on 05/10/2017.
 */

public class Principal extends Application {
    String pepe;

    public Principal(String pepe) {
        this.pepe = pepe;
    }

    public Principal() {
        this.pepe = "Nadita al principio";
    }

    public String getPepe() {
        return pepe;
    }

    public void setPepe(String pepe) {
        this.pepe = pepe;
    }
}
