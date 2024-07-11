import java.util.Scanner;

public class palindrome {
     public static boolean isPalindrome(int n){

        int rev = 0;
        while(n != 0){
            int lastdig = n%10;
            rev = rev*10 + lastdig;
            n /= 10;
        }

        if(n!= rev){
            return false;
        }
        
        return true;
        }
        
       
       public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(isPalindrome(n));
       }
    
}


