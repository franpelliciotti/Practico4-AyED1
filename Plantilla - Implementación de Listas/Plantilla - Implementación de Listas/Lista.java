
public interface Lista <T> {

    /**
     * Inserta un elemento al final de la lista.
     * @param item Elemento a insertar
     */
    public void insertarFin(T item);

    /**
     * Inserta un elemento al comienzo de la lista.
     * @param elem Elemento a insertar
     */
    public void insertarInicio(T elem);

    /**
     * Inserta un elemento en una posición determinada.
     * Los demás elementos deben ser desplazados un lugar a la derecha.
     * @param elem Elemento a insertar
     * @param pos Posición en la que se debe insertar.
     * @pre 0 <= pos <= lista.longitud()
     */
    public void insertarPos(T elem, int pos);

    /**
     * Elimina la primera ocurrencia del elemento. 
     * @param item Elemento a eliminar
     * @return true si el elemento se eliminó, falso si el elemento no pertenece a la lista.
     * @pre lista.longitud() == N
     * @pos lista.longitud() == N-1
     */
    public boolean eliminar(T item);

    /**
     * Busca la posición en la que se encuentra un elemento.
     * @param item Elemento a buscar
     * @return Posición o -1 en caso que no se encuentre
     * @pos (posicion == -1) or (0 <= posicion < lista.longitud())  
     */
    public int buscar(T item);

    /**
     * Retorna la cantidad de elementos que actualmente almacena la lista.
     * @return Longitud de la lista
     * @pos 0 <= longitud
     */
    public int longitud();

    /**
     * Imprime por pantalla los elementos de la lista.
     */
    public void imprimir();

    /**
     * AGREGADO.
     * Retorna si la lista está vacía o no.
     * @return true si la lista es vacía, false en caso contrario.
     */
    public boolean esVacia();

    /**
     * AGREGADO.
     * Retorna el elemento que está en la posición deseada.
     * @param posicion Posicion a observar. 
     * @return elemento T en posicion a observar.
     * @pre 0 <= pos <= longitud().
     */
    public T buscarPorPosicion(int pos)
}
