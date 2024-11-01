
public class PilaListaArray<T> implements Pila<T>{
    
    private ListaArray<T> pila;
    private int cantidadElementos;

    public PilaListaArray(int maxSize){
        pila = new ListaArray<>(maxSize);
        cantidadElementos = 0;
    }

    public void apilar(T item){
        pila.insertarInicio(item);
        cantidadElementos++;
    }

    public void desapilar(){
        if(pila.esVacia()) throw new IllegalStateException("La pila está vacía. No hay nada que desapilar.");
        pila.eliminar(tope());
        cantidadElementos--;
    }

    public T tope(){
        return pila.buscarPorPosicion(0);
    }

    public boolean esVacia(){
        return pila.esVacia();
    }

    public void vaciar(){
        for(T elemento : pila){ //No es iterable
            pila.eliminar(elemento);
        }
    }
}
