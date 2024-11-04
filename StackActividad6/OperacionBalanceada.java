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
    private Stack<Character> parentesisApertura;

    /**
     * Constructor for objects of class OperacionBalanceada
     */
    public OperacionBalanceada()
    {
        parentesisApertura = new Stack<>();
        operacion = new Stack<>();
    }

    public void agregar(Character caracter){
        if(caracter == null) throw new IllegalArgumentException("El caracter no puede ser nulo");
        operacion.push(caracter);
        if((int) caracter == 40){
            parentesisApertura.push(caracter);
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
                parentesisApertura.pop();
            }
        }
        if(parentesisApertura.empty()){
            return true;
        }
        return false;
    }

    private static Stack<Character> operacionS = new Stack<>();
        private static Stack<Character> parentesisAperturaS = new Stack<>();
        public static void main(String[] args) {
            String operacionString = ")3+5(";
            
            char[] operacionChar = operacionString.toCharArray();
    
            for(int j = 0; j < operacionChar.length; j++){
                operacionS.push(operacionChar[j]);
                if((int) operacionChar[j] == 40){
                    parentesisAperturaS.push(operacionChar[j]);
                }
            }
            System.out.println();
            for(Character c : operacionS){
                System.out.print(c);
            }
            System.out.println();
            for(Character c : operacionS){ //En caso que la operación no tenga ningún paréntesis, siempre será verdadero
                if((int) c == 41){
                    if(parentesisAperturaS.isEmpty()) throw new IllegalStateException("False");
                    parentesisAperturaS.pop();
                }
            }
            if(parentesisAperturaS.empty()){
                System.out.println("True");
            } else {
                System.out.println("False");
            }
            
        }
}