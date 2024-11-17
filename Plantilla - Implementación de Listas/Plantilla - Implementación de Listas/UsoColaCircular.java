
public class UsoColaCircular {

    static ColaCircular<Character> cola = new ColaCircular<>(6);

    private static void cargarCola(){
        cola.encolar('a');
        cola.imprimir();
        System.out.println();
        cola.encolar('b');
        cola.imprimir();
        System.out.println();
        cola.encolar('c');
        cola.imprimir();
        System.out.println();
        cola.encolar('d');
        cola.imprimir();
        System.out.println();
        cola.encolar('e');
        cola.imprimir();
        System.out.println();        
        cola.encolar('f');
        cola.imprimir();
        System.out.println();
        
    } 

    public static void main(String[] args){
        cargarCola();
        cola.desencolar();
        cola.imprimir();
        cola.desencolar();
        cola.imprimir();
        cola.desencolar();
        cola.imprimir();
        cola.desencolar();
        cola.imprimir();
        cola.desencolar();
        cola.imprimir();
        cola.desencolar();
        cola.imprimir();
        cola.encolar('a');
        cola.imprimir();
        cola.encolar('b');
        cola.imprimir();
        cola.encolar('c');
        cola.imprimir();
        cola.desencolar();
        cola.imprimir();
        cola.desencolar();
        cola.imprimir();
        cola.encolar('d');    
        cola.imprimir();
        cola.desencolar();
        cola.imprimir();
        cola.encolar('z');
        cola.imprimir();
        cola.encolar('a');
        cola.imprimir();
        cola.encolar('b');
        cola.imprimir();
        cola.encolar('a');
        cola.imprimir();
        cola.encolar('b');
        cola.imprimir();
        
    }
}
