

/**
 * Esta clase implementa el TAD Lista utilizando memoria dinámica (Nodos enlazados)
 * 
 * NOTA: existen dos versiones de listas enlazadas (con y sin ficticio). Implementar una de las dos.
 */
public class ListaEnlazadaFicticio<T> implements Lista<T> {
    
    private class Nodo {
        T elem;
        Nodo siguiente;

        Nodo(T elem) {
            this.elem = elem;
            this.siguiente = null;
        }
    }

    private Nodo cabeza;
    private Nodo ultimo;
    private int longitud;

    public ListaEnlazadaFicticio(){
        this.cabeza = new Nodo(null);
        this.ultimo = cabeza;
        this.longitud = 0;
    }

    public void insertarFin(T item){
        Nodo nuevo = new Nodo(item);
        ultimo.siguiente = nuevo;
        ultimo = nuevo;
        longitud++;
    }

    public void insertarInicio(T elem){
        Nodo nuevo = new Nodo(elem);
        if(cabeza.siguiente == null){ //La lista está vacía
            cabeza.siguiente = nuevo;
            ultimo = nuevo;
            longitud++;
        } else {
            nuevo.siguiente = cabeza.siguiente;
            cabeza.siguiente = nuevo;
            longitud++;
        }
    }

    public void insertarPos(T elem, int pos){
        if(pos < 0 || pos > longitud()) throw new IllegalArgumentException("Posición inválida.");
        Nodo actual = cabeza.siguiente;
        Nodo nuevo = new Nodo(elem);
        int contador = 0;
        if(pos == 0){
            insertarInicio(elem);
        } else {
            while(actual != null){
                contador++;
                if(contador == pos){
                    nuevo.siguiente = actual.siguiente;
                    actual.siguiente = nuevo;
                }
                actual = actual.siguiente;
            }
            longitud++;
        }
        
    }

    public boolean eliminar(T item){
        int posicionElemento = buscar(item);
        Nodo actual = cabeza.siguiente;
        Nodo anterior = null;
        int contador = 0;
        while(actual != null){
            if(contador == posicionElemento){
                anterior.siguiente = actual.siguiente;
                longitud--;
                return true;
            }
            contador++;
            anterior = actual;
            actual = actual.siguiente;
        }
        return false;
    }

    public int buscar(T item){
        Nodo actual = cabeza.siguiente;
        int contador = 0;
        while(actual != null){
            if(actual.elem.equals(item)){
                return contador;
            }
            contador++;
            actual = actual.siguiente;
        }
        return -1;
    }

    public int longitud(){
        return longitud;
    }

    public void imprimir(){
        Nodo actual = cabeza.siguiente;
        int contador = 0;
        while(actual != null){
            System.out.println("Elemento en posición " + (contador + 1) + ": " + actual.elem);
            contador++;
            actual = actual.siguiente;
        }
    }

    public boolean esVacia(){
        return longitud() == 0;
    }

    public T buscarPorPosicion(int pos){
        if(pos < 0 || pos > longitud()) throw new IllegalArgumentException("Posición inválida.");
        Nodo actual = cabeza.siguiente;
        while(actual != null){
            if(buscar(actual.elem) == pos){
                return actual.elem;
            }
            actual = actual.siguiente;
        }
        return null;
    }
}