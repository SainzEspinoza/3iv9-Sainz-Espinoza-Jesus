
package examen3erparcial;


public class Usuario {
    String Nombre,Edad,Victorias;

    public Usuario(String Nombre, String Edad, String Victorias) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Victorias = Victorias;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getVictorias() {
        return Victorias;
    }

    public void setVictorias(String Victorias) {
        this.Victorias = Victorias;
    }
    
}
