import java.util.ArrayList;

public class HeighestEle {
    public static void isHighest(int[] array,ArrayList<Integer> list,int index) {
        //Termination case
        if(index==array.length){
            System.out.println(list);
            return;
        }
        //Business Logic
        if(array[index]>list.get(0)){
            list.remove(0);
            list.add(0, array[index]);
        }
        //Recursive call
        isHighest(array, list, index+1);
    }
    public static void main(String[] args) {
        int[] array = {1,5,6,2,3,4};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(array[0]);
        isHighest(array, list,0);
    }
}
