public class UsoListaEnlazadaFicticio {
    private static ListaEnlazadaFicticio<Integer> lista = new ListaEnlazadaFicticio<>();

    public static void cargarLista(){ //Resultado esperado: [1, 2, 3, 8, 4, 43, 32]
        lista.insertarInicio(3);
        lista.insertarFin(4);
        lista.insertarInicio(2);
        lista.insertarPos(8, 2);
        lista.insertarFin(43);
        lista.insertarFin(32);
        lista.insertarPos(1, 0);
    }

    public static void main(String[] args){
        cargarLista();
        System.out.println("Longitud: " + lista.longitud());
        lista.imprimir();
        System.out.println();
        System.out.println("Buscar el elemento 3:");
        System.out.println(lista.buscar(3)); //Resultado esperado: 1.
        System.out.println();
        System.out.println("Eliminar el elemento 43: ");
        System.out.println(lista.eliminar(43)); //Resultado esperado: true, [1, 2, 3, 8, 4, 32].
        lista.eliminar(43); 
        System.out.println("Longitud: " + lista.longitud());
        System.out.println();
        lista.imprimir();
        System.out.println();
        System.out.println("Eliminar el elemento 78: "); //Resultado esperado: false, [1, 2, 3, 8, 4, 32].
        System.out.println(lista.eliminar(78));
        lista.eliminar(78);
        System.out.println("Longitud: " + lista.longitud());
        System.out.println();
        lista.imprimir();
    }
}
