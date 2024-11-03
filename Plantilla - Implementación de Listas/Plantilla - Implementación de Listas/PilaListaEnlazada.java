
public class PilaListaEnlazada<T> implements Pila<T> {

    private ListaArray<T> pila;

    public PilaListaEnlazada(int maxSize){
        pila = new ListaArray<>(maxSize);
    }

    public void apilar(T item){
        pila.insertarInicio(item);
    }

    public void desapilar(){
        if(pila.esVacia()) throw new IllegalStateException("La pila está vacía. No hay nada que desapilar.");
        pila.eliminar(tope());
    }

    public T tope(){
        return pila.buscarPorPosicion(0);
    }

    public boolean esVacia(){
        return pila.esVacia();
    }

    public void vaciar(){
        if(pila.esVacia()) throw new IllegalStateException("La pila ya está vacía.");
        for(int i = 0; i < pila.longitud(); i++){
            pila.eliminar(pila.buscarPorPosicion(i));
        }
    }

    public void imprimir(){
        pila.imprimir();
    }

    public int longitud(){
        return pila.longitud();
    }
}
