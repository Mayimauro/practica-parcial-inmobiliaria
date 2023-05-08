package Modelo;

public class Oficina extends GestionInmoviliaria{

    private int cantBoxes;

    public Oficina(String direccion, Persona propietario, int precioBase, int cantBoxes,int precioFinal) {
        super(direccion, propietario, precioBase,precioFinal);
        this.cantBoxes = cantBoxes;
    }


    //metodos
    @Override
    public int calcularPrecio() {
        return cantBoxes*getPrecioBase();
    }

    @Override
    public String toString() {
        return "Oficina" + super.toString() +
                "cantBoxes=" + cantBoxes + "\n";
    }
}
