
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
        this.indice = 0; //próximo indice libre ó cant. de elementos.
    }

    public void insertarFin(T item){
        if(item == null) throw new IllegalArgumentException("Elemento nulo."); //Fortalecimiento de precondición.
        if(indice >= maxSize) throw new IllegalStateException("Lista llena");
        elems[indice] = item;
        indice += 1;
    }

    public void insertarInicio(T elem){
        if(elem == null) throw new IllegalArgumentException("Elemento nulo."); //Fortalecimiento de precondición.
        if(esVacia()){
            elems[indice] = elem;
            indice += 1;
        } else {
            if(indice >= maxSize) throw new IllegalStateException("Lista llena");
            for(int i = maxSize - 1; i > 0 && indice < maxSize; i--) {
                elems[i] = elems[i - 1];
            }
            elems[0] = elem;
            indice += 1;
        }
    }
    
    public void insertarPos(T elem, int pos){
        if(elem == null) throw new IllegalArgumentException("Elemento nulo."); //Fortalecimiento de precondición.
        if(pos < 0 || pos > longitud()) throw new IllegalArgumentException("Posición inválida.");
        if(arregloLleno()) throw new IllegalStateException("La lista está llena");
        if(esVacia()){
            elems[pos] = elem;
            indice++;
        } else {
            for(int i = indice; i > pos; i--) {
                elems[i] = elems[i - 1];
            }
            elems[pos] = elem;
            indice += 1;
        }
    }

    public boolean eliminar(T item){
        if(longitud() == 0) throw new IllegalStateException("La lista está vacía. No hay nada que eliminar.");
        int posicion = buscar(item);
        boolean eliminado = true;
        if(posicion == (-1)){
            eliminado = false;
        } else {
            for(int i = posicion; i < indice - 1; i++) {
                elems[i] = elems[i + 1];
            }
            elems[indice - 1] = null; 
            indice--; //El error era porque se estaba restando el índice fuera del condicional else. O sea, que si no se encontraba, también se restaba.
        }     
        return eliminado;
    }

    public int buscar(T item){
        int posicionEncontrado = (-1);
        for(int i = 0; i < longitud(); i++){ //Cambiado maxSize por longitud() (Para evitar iteraciones innecesarias).
            if(elems[i].equals(item)){  //Cambio de la opción null, ya que se fortaleció la precondición en cada método para insertar nuevos elementos: No pueden ser null.
                posicionEncontrado = i;
            }
        }
        return posicionEncontrado;
    }

    public int longitud(){
        return indice;
    }

    public void imprimir(){
        if(esVacia()){
            System.out.println("La lista está vacía.");
        } else {
            for(int i = 0; i < longitud(); i++){
                System.out.println("Elemento en posición " + (i + 1) + ": " + elems[i]);
            }
        }
    }
    
    public boolean esVacia(){
        return longitud() == 0;
    }

    public T buscarPorPosicion(int pos){
        if(pos < 0 || pos > longitud()) throw new IllegalArgumentException("Posición inválida.");
        return elems[pos];
    }

    private boolean arregloLleno(){
        return longitud() == maxSize;
    }
}