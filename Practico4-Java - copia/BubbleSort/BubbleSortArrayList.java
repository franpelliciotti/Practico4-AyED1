
import java.util.ArrayList;

/**
 * Implementación de BubbleSort para arraylists de Integer.
 * 
 * Francine Pagliasso Pelliciotti
 * @version 12/10/24
 */
public class BubbleSortArrayList
{
    private ArrayList<Integer> listaEnteros;
    
    /**
     * Constructor for objects of class BubbleSortArrayList
     */
    public BubbleSortArrayList()
    {
        listaEnteros = new ArrayList<>();
    }

    public void agregar(int n){
        listaEnteros.add(n);
    }
    
    public void eliminar(int i){
        listaEnteros.remove(i);
    }
    
    private boolean listaOrdenada(){
        boolean ordenada = true;
        for(int i = 1; i < listaEnteros.size(); i++){
            if(listaEnteros.get(i-1) > listaEnteros.get(i)){
                ordenada = false;
            }
        }
        return ordenada;
    }
    
    public ArrayList bubbleSort(){
        int menor = 0;
        int mayor = 0;
        for(int i = 0; i < listaEnteros.size() && !(listaOrdenada()); i++){
            for(int j = 1; j < listaEnteros.size(); j++){
                if(listaEnteros.get(j-1) > listaEnteros.get(j)){
                    menor = listaEnteros.get(j);
                    mayor = listaEnteros.get(j-1);
                    listaEnteros.remove(j);
                    listaEnteros.remove(j-1);
                    listaEnteros.add(j-1, menor);
                    listaEnteros.add(j, mayor);
                }
            }
        }
        
        for(int i = 0; i < listaEnteros.size(); i++){
            System.out.println("Elemento en posición " + i + ": " + listaEnteros.get(i));
        }
        return listaEnteros;
    }
}
