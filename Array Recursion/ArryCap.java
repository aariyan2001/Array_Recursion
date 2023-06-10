import java.util.ArrayList;
import java.util.Arrays;

public class ArryCap {
    public static void toUppar(ArrayList<String> list,int index) {
        //Termination case
        if(index==list.size()){
            System.out.println(list);
            return;
        }
        //Business rule
        String str = list.get(index);
        list.remove(index);
        list.add(index, str.toUpperCase());
        //Recursive call
        toUppar(list, index+1);
    }
    public static void main(String[] args) {
        String[] arr = {"foo","bar","world"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList( arr));
        toUppar( list,0);
    }
}
