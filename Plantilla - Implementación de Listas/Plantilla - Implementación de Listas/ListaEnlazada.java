
/**
 * Esta clase implementa el TAD Lista utilizando memoria dinámica (Nodos enlazados)
 * 
 * NOTA: existen dos versiones de listas enlazadas (con y sin ficticio). Implementar una de las dos.
 * Implementada SIN FICTICIO.
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
        //Completar
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
        /**
         *  if(cabeza.elem == null){ //En caso que no haya elementos
            cabeza.elem = elem; //Guardamos el parámetro en el nodo cabeza.
            } else {
                cabeza.siguiente = cabeza; //El que le sigue a la cabeza, guardará el anterior para no pisarlo.
                cabeza.elem = elem; //Actualizamos la cabeza con el elemento del parámetro.
            } -Esto no funciona por NullPointerException.
        */
    }

    public void insertarPos(T elem, int pos){
        if(pos < 0 || pos > longitud()) throw new IllegalArgumentException("La posición debe estar entre 0 y el último elemento de la lista");
        Nodo nuevoNodo = new Nodo(elem);
        indice++;
        
        //Completar
    }

    public boolean eliminar(T item){
        //Completar
        Nodo actual = cabeza;
        boolean eliminado = false;
        while(actual != null && eliminado == false){
            if(actual.elem.equals(item)){
                //Aqui va la implementación de la eliminación
                eliminado = true;
            }
            actual = actual.siguiente;
        }
        indice--; //Se actualiza el índice, ya que se eliminó un elemento.
        return eliminado;
    }

    public int buscar(T item){
        Nodo actual = cabeza; // Comienza desde la cabeza de la lista
        boolean encontrado = false;
        int posicionEncontrado = (-1);
        int iteraciones = 1; //iteraciones solo se modifica si se cumple la condición del while. Y si se cumple, es porque hay al menos un elemento. Por eso, inicia en uno.
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
            actual = actual.siguiente; // Avanza al siguiente nodo
        }
    }

}