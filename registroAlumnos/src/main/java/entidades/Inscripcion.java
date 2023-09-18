package entidades;

public class Inscripcion {

    private int idInscripcion;

    private Alumno alumno;

    private Materia materia;

    private double nota;

    public Inscripcion(int idInscripcion, Alumno alumno, Materia materia, double nota) {
        this.idInscripcion=idInscripcion;
        this.alumno=alumno;
        this.materia=materia;
        this.nota=nota;
    }

    public Inscripcion(Alumno alumno, Materia materia, double nota) {
        this.alumno=alumno;
        this.materia=materia;
        this.nota=nota;
    }

    public Inscripcion(double nota) {
        this.nota=nota;
    }

    public Inscripcion() {
       
    }

    public Alumno getAlumno() {
        return this.alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno=alumno;
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
