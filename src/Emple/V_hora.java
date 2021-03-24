package Emple;

public class V_hora extends H_trabajadas {

    public int Valor_Hora;

    
    public V_hora(String Nombre, String cedula, String telefono, int horas, int valor_hora) {
        super(Nombre, cedula, telefono, horas);
        this.Valor_Hora = valor_hora;
    }

    public int getValor_Hora() {
        return Valor_Hora;
    }
     
    //Este metodo es para calcular el valor total
    public int Datos() {
        int sueldo = 0;
        if (horas <= 40) {
            sueldo = getHoras() * getValor_Hora();
        }

        if (horas > 40 && horas <= 48) {
            sueldo = (40 * getValor_Hora()) + (((20 * getValor_Hora()) / 100) + getValor_Hora()) * 8;
        }

        if (horas > 48) {
            sueldo = (40 * getValor_Hora()) + (((20 * getValor_Hora()) / 100) + getValor_Hora()) * 8 + (((40 * getValor_Hora()) / 100) + getValor_Hora()) * (getHoras() - 48);
        }
        return sueldo;
    }

    public void setValor_Hora(int Valor_Hora) {
        this.Valor_Hora = Valor_Hora;
    }
}
