
public class EjemploUsoListas {
    
    /**
     * Dada una lista vacia, carga valores de ejemplo.
     * Resultado esperado: [2, 3, 8, 4, 43, 32]
     * @param lista
     */
    private static void cargarLista(Lista<Integer> lista){
        lista.insertarInicio(3);
        lista.insertarFin(4);
        lista.insertarInicio(2);
        lista.insertarPos(8, 2);
        lista.insertarFin(43);
        lista.insertarFin(32);
    }

    public static void main(String[] args) {
        ListaArray<Integer> listaConArray = new ListaArray<>(40);
        ListaEnlazada<Integer> listaEnlazada = new ListaEnlazada<>();

        //Importante: notar que el método cargarLista() espera un tipo Lista como parámetro.
        // Ambas clases al implementar la interface Lista son compatibles como parámetro.
        // No importa que implementación de la interface se usa, todas son compatibles.
        cargarLista(listaConArray);
        cargarLista(listaEnlazada);

        System.out.println("Longitud de ambas listas: ");
        System.out.println(listaConArray.longitud());
        System.out.println(listaEnlazada.longitud());
        //Resultado esperado: 6.

        System.out.println();
        
        System.out.println("Mostrando la lista implementada sobre arreglos:");
        listaConArray.imprimir();
        //Resultado esperado: [2, 3, 8, 4, 43, 32]
        System.out.println("------------------------------------------");
        
        System.out.println("Mostrando la lista implementada con Nodos:");
        listaEnlazada.imprimir();
        //Resultado esperado: [2, 3, 8, 4, 43, 32]

        System.out.println();
        
        System.out.println("Buscar el elemento 3 en la lista implementada sobre arreglos");
        System.out.println(listaConArray.buscar(3));
        //Resultado esperado: 1.
        
        System.out.println("Buscar el elemento 3 en la lista implementada con Nodos");
        System.out.println(listaEnlazada.buscar(3));
        //Resultado esperado: 1.
        
        System.out.println();
        
        System.out.println("Eliminar el elemento 43 en la lista implementada sobre arreglos");
        System.out.println(listaConArray.eliminar(43));
        listaConArray.eliminar(43);
        listaConArray.imprimir();
        //Resultado esperado: true, [2, 3, 8, 4, 32].
        
        System.out.println("------------------------------------------");
        
        System.out.println("Eliminar el elemento 43 en la lista implementada con Nodos");
        System.out.println(listaEnlazada.eliminar(43));
        listaEnlazada.eliminar(43);
        listaEnlazada.imprimir();
        //Resultado esperado: true, [2, 3, 8, 4, 32].

        System.out.println();
        System.out.println("Longitud de ambas listas: ");
        System.out.println(listaConArray.longitud());
        System.out.println(listaEnlazada.longitud());
        //Resultado esperado: 5.

        System.out.println();
        
        System.out.println("Eliminar el elemento 78 en la lista implementada sobre arreglos");
        System.out.println(listaConArray.eliminar(78));
        listaConArray.eliminar(78);
        listaConArray.imprimir();
        //Resultado esperado: false, [2, 3, 8, 4, 32].
        
        System.out.println("------------------------------------------");
        
        System.out.println("Eliminar el elemento 78 en la lista implementada con Nodos");
        System.out.println(listaEnlazada.eliminar(78));
        listaEnlazada.eliminar(78);
        listaEnlazada.imprimir();
        //Resultado esperado: false, [2, 3, 8, 4, 32].

        System.out.println();
        System.out.println("Longitud de ambas listas: ");
        System.out.println(listaConArray.longitud());
        System.out.println(listaEnlazada.longitud());
        //Resultado esperado: 5.
    }
}
