

/**
 * Implementación de BubbleSort para arrays de enteros.
 * 
 * @Francine Pagliasso Pelliciotti 
 * @version 12/10/24
 */
public class BubbleSort
{
    private boolean arregloOrdenado(int[] arreglo){
        boolean ordenado = true;
        for(int i = 1; i < arreglo.length; i++){
            if(arreglo[i-1] > arreglo[i]){
                ordenado = false;
            }
        }
        return ordenado;
    }
    
    public int[] sortArreglo(int[] arreglo){
        int menor = 0;
        int mayor = 0;
        for(int i = 1; i < arreglo.length && !(arregloOrdenado(arreglo)); i++){
            for(int j = 1; j < arreglo.length; j++){
                if(arreglo[j-1] > arreglo[j]){
                    mayor = arreglo[j-1];
                    menor = arreglo[j];
                    arreglo[j] = mayor;
                    arreglo[j-1] = menor;
                }
            }
        }
        
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Número en posición " + i + ": " + arreglo[i]);
        }
        return arreglo;
    }
    
    
}
