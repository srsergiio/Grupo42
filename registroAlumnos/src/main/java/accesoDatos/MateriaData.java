/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoDatos;

import java.sql.Connection;
import java.util.List;
import entidades.Materia;

public class MateriaData {

    private Connection con;

    public MateriaData(Connection con) {
        this.con = con;
    }

    public void guardarMateria(Materia materia) {
        // Implementa el código para guardar una materia
    }

    public Materia buscarMateria(int id) {
        // Implementa el código para buscar una materia por id
        return null;
    }

    public void modificarMateria(Materia materia) {
        // Implementa el código para modificar una materia
    }

    public void eliminarMateria(int id) {
        // Implementa el código para eliminar una materia
    }

    public List<Materia> listarMaterias() {
        // Implementa el código para listar materias
        return null;
    }
}
