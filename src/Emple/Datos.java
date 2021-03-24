package Emple;

public class Datos {

    public String Nombre;
    public String cedula;
    public String telefono;

    public Datos(String Nombre, String cedula, String telefono) {
        this.Nombre = Nombre;
        this.cedula = cedula;
        this.telefono = telefono;

    }

    public String getNombre() {
        return Nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
