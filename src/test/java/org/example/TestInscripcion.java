package org.example;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;


class TestInscripcion {

    @org.junit.jupiter.api.Test
    void aprobada() {
        Materia materia1 = new Materia("Algoritmos");
        Materia materia2 = new Materia("Paradigmas");
        Materia materia3 = new Materia("Sistemas");
        Materia materia4 = new Materia("Disenio");

        materia2.agregarCorrelativas(materia1);
        materia4.agregarCorrelativas(materia2, materia3);

        Alumno alumno = new Alumno("Pepe", "Gomez", "12345");
        Alumno alumno2 = new Alumno("Juan", "Ricardo", "54321");

        alumno.AprobarMaterias(materia1);
        alumno2.AprobarMaterias(materia1, materia2, materia3);

        Inscripcion inscripcion1 = new Inscripcion(alumno, materia2);
        Inscripcion inscripcion2 = new Inscripcion(alumno2, materia4);
        Inscripcion inscripcion3 = new Inscripcion(alumno, materia4);


        assertTrue(inscripcion1.aprobada());
        assertTrue(inscripcion2.aprobada());
        assertFalse(inscripcion3.aprobada());
    }
}



