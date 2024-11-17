import java.util.Random;
import java.util.LinkedList;

/**
 * Provides methods for operating with Integer LinkedLists, that contains
 * n random numbers, going from 0 to n-1.
 * @Francine Pagliasso Pelliciotti 
 * @version 1.0
 */
public class RandomNumbers
{
    private Random numberGenerator;
    private LinkedList<Integer> numberList;
    
    /**
     * Constructor for objects of class RandomNumbers
     */
    public RandomNumbers()
    {
        numberGenerator = new Random();
        numberList = new LinkedList<>();
    }
    
    /**
     * Generates random numbers from 0 to n-1 and adds each one to
     * a LinkedList position.
     */
    public void generator(int n){
        assert n > 0: "n must be greater than zero.";
        for(int i = 0; i < n; i++){
            numberList.add(numberGenerator.nextInt(n));
            System.out.println("Number in index " + i + ": "+ numberList.get(i));
        }
    }
    
    /**
     * Checks if the given n number belongs to some LinkedList's position. 
     */
    public boolean belongs(int n){
        boolean isThere = false;
        for(int i = 0; i < numberList.size() && !(isThere); i++){
            if(numberList.get(i).equals(n)){
                isThere = true;
            }
        }
        return isThere;
    }
    
    public LinkedList<Integer> list(){
        return numberList;
    }
}
