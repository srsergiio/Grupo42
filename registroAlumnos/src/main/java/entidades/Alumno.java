package entidades;

import java.time.LocalDate;

public class Alumno {

    private int idAlumno;

    private String apellido;

    private String nombre;

    private LocalDate fechaNac;
    

    private boolean Activo;

    public Alumno(int idAlumno, String apellido, String nombre, LocalDate fechaNac, boolean Activo) {
        this.idAlumno=idAlumno;
        this.apellido=apellido;
        this.nombre=nombre;
        this.fechaNac=fechaNac;
        this.Activo=Activo;
    }

    public Alumno(String apellido, String nombre, LocalDate fechaNac, boolean Activo) {
        this.apellido=apellido;
        this.nombre=nombre;
        this.fechaNac=fechaNac;
        this.Activo=Activo;
    }

    public Alumno() {
        
    }

    public int getIdAlumno() {
        return this.idAlumno;
    }

    public void setIdAlumno(int IdAlumno) {
        this.idAlumno=IdAlumno;
    }

    public String getApellido() {
         return this.apellido;
    }

    public void setApellido(String Apellido) {
        this.apellido=Apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public LocalDate getfechaNac() {
        return this.fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac=fechaNac;
    }

    public boolean isActivo() {
        return this.Activo;
    }

    public void setActivo(boolean Activo) {
          this.Activo=Activo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", apellido=" + apellido + ", nombre=" + nombre + ", fechaNac=" + fechaNac + ", Activo=" + Activo + '}';
    }

   
}
