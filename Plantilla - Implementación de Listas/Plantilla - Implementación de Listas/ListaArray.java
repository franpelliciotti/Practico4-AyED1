
/**
 * Esta clase implementa el TAD Lista utilizando un arreglo como estructura base.
 */
public class ListaArray<T> implements Lista<T>
{
    private T[] elems;
    private int maxSize;
    private int indice;

    @SuppressWarnings("unchecked")
    public ListaArray(int maxSize){
        this.elems = (T[]) new Object[maxSize];
        this.maxSize = maxSize;
        this.indice = 0; //Cantidad de elementos - donde está el último elemento.
    }

    public void insertarFin(T item){
        if(indice > maxSize) throw new IllegalStateException("Lista llena");
        elems[indice] = item;
    }

    public void insertarInicio(T elem){
        if(esVacio(elems)){
            elems[indice] = elem;
            indice += 1;
        } else {
            if(indice > maxSize) throw new IllegalStateException("Lista llena");
            T aux = elems[0];
            for(int i = 0; i < indice; i++) {
                aux = elems[i+1];
                elems[i + 1] = elems[i];
            }
            elems[0] = elem;
            indice += 1;
        }
    }

    public void insertarPos(T elem, int pos){
        if(pos > maxSize) throw new IllegalArgumentException("La posición no existe.");
        if(pos == maxSize && elems[pos] != null) throw new IllegalStateException("La última posición está llena.");
        if(esVacio(elems)){
            indice = pos;
            elems[pos] = elem;
        } else {
            elems[pos] = elem;
        }
    }

    public boolean eliminar(T item){
        int posicion = buscar(item);
        boolean eliminado = true;
        if(posicion == (-1)){
            eliminado = false;
        } else {
            moverAtras(posicion + 1);
        }     
        return eliminado;
    }

    public int buscar(T item){
        int posicionEncontrado = (-1);
        for(int i = 0; i < maxSize; i++){
            if(elems[i] == null){ //Para evitar problemas con comparación null
                posicionEncontrado = (-1);           
            } else if(elems[i].equals(item)){ 
                posicionEncontrado = (i + 1);
            }
        }
        return posicionEncontrado;
    }

    public int longitud(){
        return indice;
    }

    public void imprimir(){
        if(esVacio(elems)){
            System.out.println("La lista está vacía.");
        } else {
            for(int i = 0; i < maxSize; i++){
                System.out.println("Elemento en posición " + (i + 1) + ": " + elems[i]);
            }
        }
    }
    
    private boolean esVacio(T[] arreglo){
        boolean esVacio = true;
        for(int i = 0; i < maxSize; i++){
            if(arreglo[i] != null){
                esVacio = false;
            }
        }
        return esVacio;
    }
    
    private void moverAdelante(){
        if(indice > maxSize) throw new IllegalStateException("Lista llena");
        for(int i = maxSize - 1; i > 0 && indice <= maxSize; i--) {
            elems[i] = elems[i - 1];
        }
    }
    
    private void moverAtras(int tope){
        for(int i = maxSize - 2; i >= tope; i--) {
            elems[i + 1] = elems[i];
        }
    }
}
