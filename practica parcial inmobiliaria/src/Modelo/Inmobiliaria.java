package Modelo;

import java.lang.ref.SoftReference;
import java.util.ArrayList;

public class Inmobiliaria {

    ArrayList<GestionInmoviliaria> propiedadesEnVenta;

    public Inmobiliaria() {
        propiedadesEnVenta = new ArrayList<GestionInmoviliaria>();
    }

    //metodos
    public boolean agregarPropiedad(GestionInmoviliaria propiedad)
    {
       propiedad.setPrecioFinal(propiedad.calcularPrecio());
        propiedadesEnVenta.add(propiedad);
        return true;
    }

    public boolean eliminarPorDireccion(String direc)
    {
        int i=0;
        boolean rta = false;
        while(i<propiedadesEnVenta.size())
        {
            if(propiedadesEnVenta.get(i).getDireccion().equals(direc))
            {
                propiedadesEnVenta.remove(i);
                rta = true;
            }
            i++;
        }
        return rta;
    }
    public boolean aumentarValor() //aumenta el valor de las propiedades un 10%
    {
        float aumento;
        for(int i =0;i<propiedadesEnVenta.size();i++)
        {
            aumento = (float) (propiedadesEnVenta.get(i).getPrecioFinal() * 1.10);
            propiedadesEnVenta.get(i).setPrecioFinal((int) aumento);
        }
        return true;
    }

    @Override
    public String toString() {
        return "propiedadesEnVenta \n" + propiedadesEnVenta;
    }
}
