public class ColaEnlazada<T> implements Cola<T> {
    private ListaEnlazada<T> cola;

    public ColaEnlazada(){
        cola = new ListaEnlazada<>();
    }

    public void encolar(T item){
        if(item == null) throw new IllegalArgumentException("Elemento nulo.");
        cola.insertarFin(item);
    }

    public void desencolar(){
        if(cola.esVacia()) throw new IllegalStateException("La cola está vacía.");
        cola.eliminar(frente());
    }

    public boolean esVacia(){
        return cola.esVacia();
    }

    public void vaciar(){
        if(esVacia()) throw new IllegalStateException("La cola ya está vacía");
        int longitudActual = cola.longitud();
        for(int i = 0; i < longitudActual; i++){
            desencolar();
        }
    }

    public T frente(){
        return cola.buscarPorPosicion(0);
    }

    public void imprimir(){
        System.out.print("[");
        for(int i = 0; i < cola.longitud(); i++){
            System.out.print(cola.buscarPorPosicion(i) + ", ");
        }
        System.out.print("]");
    }

    public int longitud(){
        return cola.longitud();
    }
}
