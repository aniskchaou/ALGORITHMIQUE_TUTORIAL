package math;




public class FibonacciSeries {

    public static int printFibonacci(int n){
        if (n < 2) return(n);
      return( printFibonacci(n-2) + printFibonacci(n-1) );
        }
    

    public static void main(String[] args) {
        int n = 3;
         int N =printFibonacci(n);
      System.out.println(N);
    }
}

