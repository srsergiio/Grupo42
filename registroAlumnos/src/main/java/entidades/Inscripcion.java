package entidades;

public class Inscripcion {

    private int idInscripcion;

    private Alumno alumno;

    private Materia materia;

    private double nota;

    public Inscripcion(int idInscripcion, Alumno alumno, Materia materia, double nota) {
    }

    public Inscripcion(Alumno alumno, Materia materia, double nota) {
    }

    public Inscripcion(double nota) {
    }

    public Inscripcion() {
    }

    public Alumno getAlumno() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setAlumno(Alumno alumno) {
    }

    public Materia getMateria() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setMateria(Materia materia) {
    }

    public int getidInscripcion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setidInscripcion(int idInscripcion) {
    }

    public int getIdAlumno() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setIdAlumno(int IdAlumno) {
    }

    public int getIdMateria() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setIdMateria(int IdMateria) {
    }

    public double getNota() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setNota(double nota) {
    }
}
