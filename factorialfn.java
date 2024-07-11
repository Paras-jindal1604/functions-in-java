import java.util.*;
public class factorialfn {
    public static int factorial(int n){
        int f = 1;
        for(int i =1; i<=n; i++){
            f *=i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        /* ek method to ye h ki new variable mei function ko call krke use print kraayein

        int fact = factorial(n);
        System.out.println(fact);

        */

        // ek method ye bhi h ki directly hi print statement k andar function ko call kiya jaaye

        System.out.println(factorial(n));
    }
    
}
