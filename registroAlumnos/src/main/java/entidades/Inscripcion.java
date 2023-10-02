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
        return this.materia;
    }

    public void setMateria(Materia materia) {
        this.materia=materia;
    }

    public int getidInscripcion() {
        return this.idInscripcion;
    }

    public void setidInscripcion(int idInscripcion) {
        this.idInscripcion=idInscripcion;
    }

    public int getIdAlumno() {
        return  this.alumno.getIdAlumno();
    }

    public void setIdAlumno(int IdAlumno) {
        this.alumno.setIdAlumno(IdAlumno);
    }

    public int getIdMateria() {
       return this.materia.getidMateria();
    }

    public void setIdMateria(int IdMateria) {
        this.materia.setidMateria(IdMateria);
    }

    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        this.nota=nota;
    }
}
