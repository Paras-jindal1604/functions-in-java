public class callbyvalue {
    public static void swap(int a , int b){
        // swap values
        int temp = a;                                  // "a = temp" mei error ayega kyuki temp m koi value nhi hai
        a = b;
        b = temp;

        


    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        swap(a, b);

        System.out.println(" a is:" + a);                   
        System.out.println(" b is :" + b);
    }
    
}




            /*  original value of a and b is printed as print statement  is under main function and java is 
              call by value so it will print original value of a and b under main function.
              if print statement is under function then it will pass copy of values of a and  b and 
              will return the swapped values of a and b.
               */