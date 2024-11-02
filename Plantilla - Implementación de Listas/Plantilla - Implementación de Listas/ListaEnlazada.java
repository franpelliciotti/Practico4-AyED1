
/**
 * Esta clase implementa el TAD Lista utilizando memoria dinámica (Nodos enlazados)
 * 
 * NOTA: existen dos versiones de listas enlazadas (con y sin ficticio). Implementar una de las dos.
 */
public class ListaEnlazada<T> implements Lista<T> {
    
    private class Nodo {
        T elem;
        Nodo siguiente;

        Nodo(T elem) {
            this.elem = elem;
            this.siguiente = null;
        }
    }
    private Nodo cabeza;
    private Nodo ultimo; //último elemento actual.
    private int indice; //se actualiza en proporción a ultimo.

    public ListaEnlazada(){
        //this.ultimo = 0;
        this.cabeza = null; //Para listas sin ficticio
        this.ultimo = cabeza; //Para una lista vacía, el último es la cabeza, que es null.
        // this.cabeza = new Nodo(null) # Para listas con ficticio
    }

    public void insertarFin(T item){
        Nodo nuevo = new Nodo(item); //Nuevo nodo que contiene el parámetro dentro.
        if(cabeza == null){ //La lista es vacia.
            cabeza = nuevo; //La cabeza es el nuevo nodo.
            ultimo = cabeza; //Se actualiza el último elemento.
            indice++;
        } else {
            ultimo.siguiente = nuevo; //El siguiente del último es el nuevo.
            ultimo = nuevo; //Y se actualiza el último elemento.
            indice++;
        }
    }

    public void insertarInicio(T elem){
        Nodo nuevo = new Nodo(elem); //Nuevo nodo que contiene el parámetro dentro.
        if(cabeza == null) {//La lista es vacia.
            cabeza = nuevo; //La cabeza es el nuevo nodo.
            ultimo = cabeza; //Se actualiza el último elemento.
            indice++;
        } else { //La lista tiene al menos un elemento.
            nuevo.siguiente = cabeza; //El siguiente al nuevo guarda la cabeza, para no pisar la información.
            cabeza = nuevo; //La cabeza es el nuevo nodo introducido.
            //ultimo = nuevo.siguiente; No necesariamente es el último (?
            indice++;
        }
    }

    public void insertarPos(T elem, int pos){
        if(pos < 0 || pos > longitud()) throw new IllegalArgumentException("La posición debe estar entre 0 y el último elemento de la lista");
        Nodo nuevoNodo = new Nodo(elem);
        Nodo actual = cabeza;
        int iteraciones = 0;
        while(actual != null){
            iteraciones++;
            if(iteraciones == pos){
                nuevoNodo.siguiente = actual.siguiente;
                actual.siguiente = nuevoNodo;
            }
            actual = actual.siguiente;
        }
        indice++;
        //Completar
    }

    public boolean eliminar(T item){
        //Completar
        Nodo actual = cabeza;
        Nodo anterior = null;
        boolean eliminado = false;
        while(actual != null && eliminado == false){
            if(actual.elem.equals(item)){
                if (anterior == null) { //Si el anterior es null, no se puede acceder a anterior.siguiente (Ya que no existe tal objeto).
                    cabeza = actual.siguiente;
                } else {
                    anterior.siguiente = actual.siguiente;
                }
                eliminado = true;
            }
            anterior = actual;
            actual = actual.siguiente;
        }
        indice--; //Se actualiza el índice, ya que se eliminó un elemento.
        return eliminado;
    }

    public int buscar(T item){
        Nodo actual = cabeza; // Comienza desde la cabeza de la lista
        boolean encontrado = false;
        int posicionEncontrado = (-1);
        int iteraciones = 0; 
        while (actual != null && encontrado == false) { // Mientras haya nodos en la lista
            if(actual.elem.equals(item)){
                posicionEncontrado = iteraciones;
                encontrado = true;
                iteraciones++; //NO va a llegar a sumarse uno de más, ya que está debajo del quiebre de la condición.
            } else {
                iteraciones++;
            }
            actual = actual.siguiente; // Avanza al siguiente nodo
        }
        return posicionEncontrado;
    }

    public int longitud(){
        return indice;
    }

    public void imprimir() {
        Nodo actual = cabeza; // Comienza desde la cabeza de la lista
        int iteraciones = 1;
        while (actual != null) { // Mientras haya nodos en la lista
            System.out.println("Elemento en posición: " + iteraciones + ": " + actual.elem); // Imprime el elemento del nodo actual
            iteraciones++;
            actual = actual.siguiente; // Avanza al siguiente nodo
        }
    }

    public boolean esVacia(){
        return longitud() == 0;
    }

    public T buscarPorPosicion(int pos){
        if(pos < 0 || pos > longitud()) throw new IllegalArgumentException("Posición inválida.");
        Nodo actual = cabeza;
        while(actual != null){
            if(buscar(actual.elem) == pos){
                return actual.elem;
            }
            actual = actual.siguiente;
        }
        return null;
    }
}