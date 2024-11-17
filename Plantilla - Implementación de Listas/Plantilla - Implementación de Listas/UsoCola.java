
public class UsoCola {
    static ColaArray<Integer> colaArray = new ColaArray<>(10);
    static ColaEnlazada<Integer> colaEnlazada = new ColaEnlazada<>();

    private static void cargarColas(){
        //Carga de la pila con array:
        colaArray.encolar(5);
        colaArray.encolar(7);
        colaArray.desencolar();
        colaArray.encolar(4);
        colaArray.encolar(3);
        colaArray.encolar(0);
        colaArray.desencolar();
        colaArray.encolar(2);
        colaArray.encolar(1);
        colaArray.desencolar();


        //Carga de la pila con lista enlazada:
        colaEnlazada.encolar(5);
        colaEnlazada.encolar(7);
        colaEnlazada.desencolar();
        colaEnlazada.encolar(4);
        colaEnlazada.encolar(3);
        colaEnlazada.encolar(0);
        colaEnlazada.desencolar();
        colaEnlazada.encolar(2);
        colaEnlazada.encolar(1);
        colaEnlazada.desencolar();

    }

    private static void vaciarPila(){
        colaArray.vaciar();
        colaEnlazada.vaciar();
    }


    public static void main(String[] args) {
        System.out.println("Colas:");
        cargarColas();
        System.out.println("Cola con Lista Array: ");
        colaArray.imprimir();
        System.out.println();
        System.out.println("Cola con Lista Enlazada: ");
        colaEnlazada.imprimir();

        System.out.println("Longitud Cola Array: " + colaArray.longitud());
        System.out.println("Longitud Cola Enlazada: " + colaEnlazada.longitud());
        System.out.println();

        System.out.println("Tope Cola Array: " + colaArray.frente());
        System.out.println("Tope Cola Enlazada: " + colaEnlazada.frente());
        System.out.println();

        System.out.println("Vaciar colas.");
        vaciarPila();
        colaArray.imprimir();
        colaEnlazada.imprimir();
        System.out.println();
        System.out.println("Longitud Cola Array: " + colaArray.longitud());
        System.out.println("Longitud Cola Enlazada: " + colaEnlazada.longitud());
    }
}

