
public class ColaCircular<T>{
    private T[] cola;
    private int primero; //Indica en que posición está el primer elemento.
    private int ultimo; //Indica en que posición está el último elemento.
    private int longitud; //Indica la cantidad de elementos que hay en la cola.
    private int longMax;

    @SuppressWarnings("unchecked")
    public ColaCircular(int size){
        cola = (T[]) new Object[size];
        primero = -1;
        ultimo = -1;
        longitud = 0;
        longMax = size;
    }

    public void encolar(T elem){
        if(estaLlena()) throw new IllegalStateException("La cola está llena.");
        if(esVacia()){
            cola[longitud()] = elem;
            primero++;
            ultimo++;
            longitud++;
        } else {
            cola[((ultimo() % longMax) + 1) % longMax] = elem;
            ultimo = ((ultimo() % longMax) + 1) % longMax;
            longitud++;
        }
    }

    public void desencolar(){
        if(esVacia()) throw new IllegalStateException("La cola está vacía.");
        cola[primero] = null;
        longitud--;
        if(esVacia()){
            primero = -1;
            ultimo = -1;
        } else {
            primero = (primero() % longMax) + 1;
        }
    }

    public int longitud(){
        return longitud;
    }

    public boolean esVacia(){
        return longitud() == 0;
    }

    public boolean estaLlena(){
        return longitud() == longMax;
    }

    public int primero(){
        return primero;
    }

    public int ultimo(){
        return ultimo;
    }

    public void imprimir(){
        for(int i = 0; i < longMax; i++){
            System.out.print(cola[i] + " ");
            System.out.println();
        }
        System.out.print("  - Primero: " + primero());
        System.out.print("  - Último: " + ultimo());
        System.out.println();
    }
}
