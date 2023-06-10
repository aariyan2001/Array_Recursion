import java.util.ArrayList;

public class EmployeeSalary {
    public static void taxadd(int[]salary, ArrayList<Integer> finalsalary,double tax,int index) {
        //Termination case
        if(index==salary.length){
            System.out.println(finalsalary);
            return;
        }
        //Business Logic
        finalsalary.add((int)(salary[index] + (salary[index]*0.1)));
        //Recursive call
        taxadd(salary, finalsalary, tax, index+1);
    }
    public static void main(String[] args) {
        int[] salary = {10000,20000,30000,40000,50000};
        ArrayList<Integer> list = new ArrayList<>();
        taxadd(salary, list,0.1,0);
    }
}
