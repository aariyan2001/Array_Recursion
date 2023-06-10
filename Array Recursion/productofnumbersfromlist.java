import java.util.ArrayList;

public class productofnumbersfromlist {
    public static void product(ArrayList<Integer> list,int result,int index) {
        //Termination case
        if(index==list.size()){
            System.out.println(result);
            return;
        }
        //Business logic
        result = result*list.get(index);
        //Recursive call
        product(list, result, index+1);
    }
    public static void main(String[] args) {
       int[] array = {1,2,3,4,5}; 
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i : array) {
            list.add(i);
        }

        product(list,1,0);
        
    }
}
