package entidades;

public class Materia {

    private int idMateria;

    private String nombre;

    private int anioMateria;

    private boolean activo;

    public Materia(int idMateria, String nombre, int anioMateria, boolean activo) {
        this.idMateria=idMateria;
        this.nombre=nombre;
        this.anioMateria=anioMateria;
        this.activo=activo;
    }

    public Materia(String nombre, int anioMateria, boolean activo) {
        this.nombre=nombre;
        this.anioMateria=anioMateria;
        this.activo=activo;
    }

    public Materia() {
    }

    public int getidMateria() {
       return this.idMateria;
    }

    public void setidMateria(int idMateria) {
        this.idMateria=idMateria;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public int getanioMateria() {
        return  this.anioMateria;
    }

    public void setanioMateria(int anioMateria) {
        this.anioMateria=anioMateria;
    }

    public boolean isActivo() {
       return this.activo;
    }

    public void setActivo(boolean activo) {
        this.activo=activo;
    }

    @Override
    public String toString() {
        return "Materia{" + "idMateria=" + idMateria + ", nombre=" + nombre + ", anioMateria=" + anioMateria + ", activo=" + activo + '}';
    }


}
