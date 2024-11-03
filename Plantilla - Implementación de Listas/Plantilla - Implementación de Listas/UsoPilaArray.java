
public class UsoPilaArray {
    static PilaListaArray<Integer> pila = new PilaListaArray<>(10);

    private static void cargarPila(){
        pila.apilar(5);
        pila.apilar(7);
        pila.desapilar();
        pila.apilar(4);
        pila.apilar(3);
        pila.apilar(0);
        pila.desapilar();
        pila.apilar(2);
        pila.apilar(1);
    }

    private static void vaciarPila(){
        pila.vaciar();
    }


    public static void main(String[] args) {
        System.out.println("Cargar pila:");
        cargarPila();
        pila.imprimir();
        System.out.println(pila.longitud());
        System.out.println("Tope: " + pila.tope());

        System.out.println();
        System.out.println("Vaciar pila:");
        vaciarPila();
        pila.imprimir();
        System.out.println(pila.longitud());
    }
}
