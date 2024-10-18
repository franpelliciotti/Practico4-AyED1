import java.util.Random;
import java.util.LinkedList;

public class RandomNumber {


    public static void main(String[] args){
        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        assert args.length > 0: "n must be greater than zero.";
        int n = args.length;
        for(int i = 0; i < n; i++){
            list.add(random.nextInt(n));
            System.out.println("Number in index " + i + ": "+ list.get(i));
        }
        public static boolean belongs(int n){
            boolean isThere = false;
            for(int i = 0; i < list.size() && !(isThere); i++){
                if(list.get(i).equals(n)){
                    isThere = true;
                }
            }
            return isThere;
    }


}