import java.util.Stack;

/**
 * Write a description of class OperacionBalanceada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        operacion.push(caracter);
    }
    
    public void imprimir(){
        for(Character c : operacion){
            System.out.println(c);
        }
    }
    
    public boolean balanceada(){
        for(Character c : operacion){ //En caso que la operación no tenga ningún paréntesis, siempre será verdadero
            if((int) c != 40 && (int) c != 41){
                return true;
            }
        }
        return true;
    }
}
