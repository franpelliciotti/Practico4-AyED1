 
public class PilaArrayUso {
    static PilaListaArray<Integer> pila = new PilaListaArray<>(10);

    private static void cargarPila(){
        pila.apilar(5);

    }

    private static void vaciarPila(){
        pila.vaciar();
    }


    public static void main(String[] args) {
        System.out.println("Cargar pila:");
        cargarPila();
        pila.imprimir();
        System.out.println("Tope: " + pila.tope());

        System.out.println();
        System.out.println("Vaciar pila:");
        vaciarPila();
        pila.imprimir();

        System.out.println();
    }
}

