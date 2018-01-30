package com.example.listviewpersonalizado;

/**
 * Created by DIDACT on 30/01/2018.
 */

public class Equipo {



    //ATRIBUTOS




    String nombre;
    String estadio;
    String logo;


    //CONSTRUCTOR

    public Equipo(String nombre, String estadio, String logo) {
        this.nombre = nombre;
        this.estadio = estadio;
        this.logo = logo;
    }


    //METODOS GET Y SET


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
