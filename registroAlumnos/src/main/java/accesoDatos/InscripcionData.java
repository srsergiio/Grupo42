/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoDatos;

import java.sql.Connection;
import java.util.List;
import entidades.*;

public class InscripcionData {

    private Connection con;
    private MateriaData matData;
    private AlumnoData aluData;

    public InscripcionData(Connection con, MateriaData matData, AlumnoData aluData) {
        this.con = con;
        this.matData = matData;
        this.aluData = aluData;
    }

    public void guardarInscripcion(Inscripcion insc) {
        // Implementa el código para guardar una inscripción
    }

    public List<Inscripcion> obtenerInscripciones() {
        // Implementa el código para obtener inscripciones
        return null;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        // Implementa el código para obtener inscripciones por alumno
        return null;
    }

    public List<Materia> obtenerMateriasCursadas(int id) {
        // Implementa el código para obtener materias cursadas
        return null;
    }

    public List<Materia> obtenerMateriasNOCursadas(int id) {
        // Implementa el código para obtener materias no cursadas
        return null;
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        // Implementa el código para borrar una inscripción de materia de un alumno
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        // Implementa el código para actualizar la nota de un alumno en una materia
    }

    public List<Alumno> obtenerAlumnosxMateria(int idMateria) {
        // Implementa el código para obtener alumnos por materia
        return null;
    }
}
