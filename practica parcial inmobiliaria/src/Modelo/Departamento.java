package Modelo;

public class Departamento extends GestionInmoviliaria{

    private int cantAmbientes;

    public Departamento(String direccion, Persona propietario, int precioBase, int cantAmbientes,int precioFinal) {
        super(direccion, propietario, precioBase,precioFinal);
        this.cantAmbientes = cantAmbientes;
    }

    //metodos
    @Override
    public int calcularPrecio() {
        return cantAmbientes*getPrecioBase();
    }

    @Override
    public String toString() {
        return "Departamento" + super.toString() +
                "cantAmbientes=" + cantAmbientes + "\n";
    }
}
