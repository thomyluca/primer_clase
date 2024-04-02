package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Alumno {
    private String nombre;
    private String apellido;
    private String legajo;
    private ArrayList<Materia> materiasAprobadas = new ArrayList<Materia>();

    public Alumno(String nombre, String apellido, String legajo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }
    public void AprobarMaterias(Materia... materias){
        Collections.addAll(materiasAprobadas, materias);
    }

    public boolean cumpleCorrelativas(Materia materia){
        return materiasAprobadas.containsAll(materia.getCorrelativas());
    }


}

