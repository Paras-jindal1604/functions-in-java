import java.util.*;
public class bincoefficientfn {
    public static int factorial(int x){
        int f = 1;
        for(int i =1; i<=x;i++){
            f *=i;
        }
        return f;
    }
    public static int binomial_coeff(int n, int r){
        

        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int bin_coeff = n_fact/(r_fact*nmr_fact);
        return bin_coeff;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        
        System.out.println(binomial_coeff(n, r));
    }
}
