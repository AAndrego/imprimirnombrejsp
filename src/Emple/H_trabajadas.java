package Emple;

public class H_trabajadas extends Datos {

    public int horas;

    public H_trabajadas(String Nombre, String cedula, String telefono, int horas) {
        super(Nombre, cedula, telefono);
        this.horas = horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }
}
