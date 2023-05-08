package Modelo;

import Interfaz.IPrecio;

public class Casa extends GestionInmoviliaria {
    private int cantPisos;


    public Casa(String direccion, Persona propietario, int precioBase, int cantPisos,int precioFinal) {
        super(direccion, propietario, precioBase,precioFinal);
        this.cantPisos = cantPisos;
    }

    //metodos
    @Override
    public int calcularPrecio() {
        return this.cantPisos*getPrecioBase();
    }

    @Override
    public String toString() {
        return "Casa" +super.toString() +
                "cantPisos=" + cantPisos + "\n";
    }
}
