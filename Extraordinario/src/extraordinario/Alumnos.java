/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraordinario;

/**
 *
 * @author Hola
 */
public class Alumnos {
    String Nombre, Apellidos,NumPer;

    public Alumnos(String Nombre, String Apellidos, String NumPer) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.NumPer = NumPer;
    }

    public String getNumPer() {
        return NumPer;
    }

    public void setNumPer(String NumPer) {
        this.NumPer = NumPer;
    }

    public Alumnos(String Nombre, String Apellidos) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    
}
