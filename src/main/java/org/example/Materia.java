package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Materia {

    private String nombre;
    private final ArrayList<Materia> correlativas = new ArrayList<Materia>();

    public Materia(String nombre){
        this.nombre = nombre;
    }

    public ArrayList<Materia> getCorrelativas(){
        return correlativas;
    }

    public void agregarCorrelativas(Materia... materias){
    Collections.addAll(correlativas, materias);
}
}
