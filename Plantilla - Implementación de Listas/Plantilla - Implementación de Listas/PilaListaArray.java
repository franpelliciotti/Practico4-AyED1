
public class PilaListaArray<T> implements Pila<T>{
    
    private ListaArray<T> pila;

    public PilaListaArray(int maxSize){
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
        if(pila.esVacia()) throw new IllegalStateException("La pila está vacía. No tiene tope.");
        return pila.buscarPorPosicion(0);
    }

    public boolean esVacia(){
        return pila.esVacia();
    }

    public void vaciar(){
        if(pila.esVacia()) throw new IllegalStateException("La pila ya está vacía.");
        int longitudInicio = pila.longitud();
        for(int i = 0; i < longitudInicio; i++){ //El problema era que había puesto i < pila.longitud como condición. Y pila.longitud(), se iba actualizando.
            desapilar();
        }
    }

    public void imprimir(){
        if(pila.esVacia()){
            System.out.println("La pila está vacía.");
        } else {
            for(int i = 0; i < pila.longitud(); i++){
                System.out.println("[" + pila.buscarPorPosicion(i) + "]");
            }
        }
    }
    
    public int longitud(){
        return pila.longitud();
    }
}
