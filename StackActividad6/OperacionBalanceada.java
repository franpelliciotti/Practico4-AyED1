import java.util.Stack;

/**
 * Write a description of class OperacionBalanceada here.
 * 
 * @author Francine Pagliasso Pelliciotti 
 * @version 31/11/24
 */
public class OperacionBalanceada
{
    private Stack<Character> operacion;

    /**
     * Constructor for objects of class OperacionBalanceada
     */
    public OperacionBalanceada()
    {
        operacion = new Stack<>();
    }
    
    public void agregar(Character caracter){
        if(caracter == null) throw new IllegalArgumentException("El caracter no puede ser nulo");
        if((int) caracter == 40){
            operacion.push(caracter);
        }
    }
    
    public void imprimir(){
        for(Character c : operacion){
            System.out.println(c);
        }
    }

    public boolean balanceada(){
        for(Character c : operacion){ //En caso que la operación no tenga ningún paréntesis, siempre será verdadero
            if((int) c == 41){
                operacion.pop();
            }
        }
        if(operacion.empty()){
            return true;
        }
        return false;
    }
}