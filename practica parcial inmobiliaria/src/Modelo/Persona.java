package Modelo;

public class Persona {

    private String nombre;
    private String apellido;
    private int DNI;

    public Persona(String nombre, String apellido, int DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.DNI = 0;
    }
    ///metodos


    @Override
    public String toString() {
        return  nombre  + " "+
                apellido +
                " DNI= " + DNI;
    }
}
