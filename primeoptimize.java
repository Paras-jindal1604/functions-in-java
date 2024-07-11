public class primeoptimize {


    /*  NORMAL CODE 
    public static boolean isPrime(int n){
        boolean isPrime = true;

        // corner case for n = 2

        if (n == 2){
            return true;
        }


        for(int i=2; i<=n-1; i++){
            if(n%i == 0){                           // n is completely divisible by i
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    */  
    // OPTIMIZED VERSION - check from only i = 1 to i = root n
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i =2; i<= Math.sqrt(n); i++){
            if(n %i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(11));
    }
    
}
