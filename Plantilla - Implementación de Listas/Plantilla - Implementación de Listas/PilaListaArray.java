
public class PilaListaArray implements Pila<T>{
    
    private ListaArray<T> pila;

    public PilaListaArray(int maxSize){
        pila = new ListaArray(maxSize)<>;
    }

    public void apilar(T item){
        pila.insertarInicio(item);
    }

    public void desapilar(){
        if(pila.esVacia()) throw new IllegalStateException("La pila está vacía. No hay nada que desapilar.");
        pila.eliminar(tope());
    }

    public T tope(){
        
    }

    public boolean esVacia(){
        return pila.esVacia();
    }

    public void vaciar(){

    }
}
