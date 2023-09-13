package entidades;

import java.time.LocalDate;

public class Alumno {

    private int idAlumno;

    private String apellido;

    private String nombre;

    private LocalDate fechaNac;
    

    private boolean Activo;

    public Alumno(int idAlumno, String apellido, String nombre, LocalDate fechaNac, boolean Activo) {
    }

    public Alumno(String apellido, String nombre, LocalDate fechaNac, boolean Activo) {
    }

    public Alumno() {
    }

    public int getIdAlumno() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setIdAlumno(int IdAlumno) {
    }

    public String getApellido() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setApellido(String Apellido) {
    }

    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setNombre(String nombre) {
    }

    public LocalDate getfechaNac() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setFechaNac(LocalDate fechaNac) {
    }

    public boolean isActivo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setActivo(boolean Activo) {
    }

    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
