package org.example;

import java.util.ArrayList;
import java.util.Collections;
public class Inscripcion {
    private Alumno alumno;
    private ArrayList<Materia> materias= new ArrayList<Materia>();



public Inscripcion(Alumno alumno, Materia ... materias){
    this.alumno = alumno;
    Collections.addAll(this.materias, materias);
}

    public boolean aprobada(){
        return materias.stream().allMatch(materia -> alumno.cumpleCorrelativas(materia));
    }
}
