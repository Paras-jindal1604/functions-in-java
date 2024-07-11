import java.util.*;
public class parameterfn{
    /* 
public static void sum(){
    Scanner scn = new Scanner(System.in);               // sum is calculated by calling a function
    int a = scn.nextInt();
    int b = scn.nextInt();
    int sum = a+b;
    System.out.println("the sum is: " + sum);
    
}
    public static void main(String args[]){
       sum();
    }
*/

public static void sum(int num1, int num2){         // parameters or formal parameters      
    int sum = num1 + num2;                              // numbers are recieved in function as parameters
    System.out.println("Sum is: " + sum);
}
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    sum(a,b);                           // arguments or actual parameters                   
}                                                           // values entered are passed inside function
}