public interface Cola<T> {
    public void encolar(T item);

    public void desencolar();

    public boolean esVacia();

    public void vaciar();

    public T frente();

    public void imprimir();
}
