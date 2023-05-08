package Modelo;

import Interfaz.IPrecio;

public abstract class GestionInmoviliaria implements IPrecio {

    private String direccion;
    private Persona propietario;
    private int precioBase;
    private int precioFinal;


    public GestionInmoviliaria(String direccion, Persona propietario, int precioBase,int precioFinal) {
        this.direccion = direccion;
        this.propietario = propietario;
        this.precioBase = precioBase;
        this.precioFinal = precioFinal;
    }

    public GestionInmoviliaria() {
        this.direccion = "";
        propietario = new Persona();
        this.precioBase = 0;
        this.precioFinal = 0;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public int getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(int precioFinal) {
        this.precioFinal = precioFinal;
    }
    //metodos


    @Override
    public String toString() {
        return "\ndireccion= " + direccion +
                "\npropietario=" + propietario +
                "\nprecioBase=" + precioBase+
                "\nprecioFinal="+ precioFinal+ "\n";
    }
}


