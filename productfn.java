import java.util.*;
public class productfn {
    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        int prod =  multiply(a,b);
        System.out.println(prod);
        
    }
    
}
