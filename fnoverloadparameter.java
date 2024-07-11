public class fnoverloadparameter {

    // f1 - calculate sum of 2 numbers
    public static int sum(int a, int b){
        return a+b;
    }

    // f2 - calculate sum of 3 numbers
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,4 ));
        System.out.println(sum(7, 4, 2));
    }
    
}
