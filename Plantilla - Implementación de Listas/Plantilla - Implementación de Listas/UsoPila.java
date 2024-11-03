
public class UsoPila {
    static PilaListaArray<Integer> pilaArray = new PilaListaArray<>(10);
    static PilaListaEnlazada<Integer> pilaEnlazada = new PilaListaEnlazada<>(10);

    private static void cargarPilas(){
        //Carga de la pila con array:
        pilaArray.apilar(5);
        pilaArray.apilar(7);
        pilaArray.desapilar();
        pilaArray.apilar(4);
        pilaArray.apilar(3);
        pilaArray.apilar(0);
        pilaArray.desapilar();
        pilaArray.apilar(2);
        pilaArray.apilar(1);
        pilaArray.desapilar();


        //Carga de la pila con lista enlazada:
        pilaEnlazada.apilar(5);
        pilaEnlazada.apilar(7);
        pilaEnlazada.desapilar();
        pilaEnlazada.apilar(4);
        pilaEnlazada.apilar(3);
        pilaEnlazada.apilar(0);
        pilaEnlazada.desapilar();
        pilaEnlazada.apilar(2);
        pilaEnlazada.apilar(1);
        pilaEnlazada.desapilar();

    }

    private static void vaciarPila(){
        pilaArray.vaciar();
        pilaEnlazada.vaciar();
    }


    public static void main(String[] args) {
        System.out.println("Pilas:");
        cargarPilas();
        System.out.println("Pila con Lista Array: ");
        pilaArray.imprimir();
        System.out.println("Pila con Lista Enlazada: ");
        pilaEnlazada.imprimir();

        System.out.println("Longitud Pila Array: " + pilaArray.longitud());
        System.out.println("Longitud Pila Enlazada: " + pilaEnlazada.longitud());
        System.out.println();

        System.out.println("Tope Pila Array: " + pilaArray.tope());
        System.out.println("Tope Pila Enlazada: " + pilaEnlazada.tope());
        System.out.println();

        System.out.println("Vaciar pilas:");
        vaciarPila();
        pilaArray.imprimir();
        System.out.println();
        pilaEnlazada.imprimir();
        System.out.println("Longitud Pila Array: " + pilaArray.longitud());
        System.out.println("Longitud Pila Enlazada: " + pilaEnlazada.longitud());
    }
}
