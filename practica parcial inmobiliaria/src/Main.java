import Modelo.*;

public class Main {
    public static void main(String[] args) {

        Inmobiliaria bosque = new Inmobiliaria();

        Persona juan = new Persona("juan","carlos",2345);
        Persona pedro = new Persona("pedro","bianchi",234532); ///registro las personas para luego
        Persona carlos = new Persona("carlos","segundo",234435);//ponerlas con su propiedad
        Persona german = new Persona("german","tercero",1231234);

        GestionInmoviliaria casaJuan = new Casa("calle 1",juan,100,1,0);
        GestionInmoviliaria depaPedro = new Departamento("calle 1",pedro,100,2,0);
        GestionInmoviliaria oficCarlos = new Oficina("calle 2",carlos,100,5,0);
        GestionInmoviliaria casaGerman = new Casa("calle 3",german,1000,3,0);

        System.out.println(bosque.agregarPropiedad(casaJuan));
        System.out.println(bosque.agregarPropiedad(depaPedro));
        System.out.println(bosque.agregarPropiedad(oficCarlos));
        System.out.println(bosque.agregarPropiedad(casaGerman));

        System.out.println("\n\n-------------------\n\n");
        System.out.println(bosque.toString());
        String direccion = "calle 1";
        bosque.eliminarPorDireccion(direccion);
        System.out.println("\n\n-------------------\n\n");
        System.out.println(bosque.toString());
        System.out.println("\n\n-------------------\n\n");
        bosque.aumentarValor();
        System.out.println(bosque.toString());




    }
}