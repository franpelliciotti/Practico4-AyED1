public interface Pila<T> {
    /**
     * Inserta un elemento en la última posición de la pila.
     * @param item Elemento a insertar.
     */
    public void apilar(T item);

    /**
     * Elimina el último elemento que entró a la pila.
     * @pre La longitud de la pila debe ser > 0.
     */
    public void desapilar();

    /*
    * Retorna el elemento que está en la última posición de la pila.
    * @return elemento T al final de la pila.
    */
    public T tope();

    /**
     * Retorna si la pila está vacía.
     * @return true si la pila está vacía, false si no lo está.
     */
    public boolean esVacia();

    /**
     * Elimina todos los elementos de la pila.
     * @pos la longitud de la pila debe ser == 0.
     */
    public void vaciar();

    /**
     * AGREGADO
     * Imprime cada objeto de la pila, empezando por el tope, y terminando en el primer elemento agregado.
     */
    public void imprimir();

    /**
     * AGREGADO 
     * Devuelve la cantidad de elementos actual de la pila.
     * @return la longitud actual de la lista.
     */
    public int longitud();
}
