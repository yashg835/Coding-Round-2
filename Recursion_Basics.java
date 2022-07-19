import java.util.*;

class Recursion_Basics{
    public static void printIncreasing(int n){
        if(n == 0) return;

        printIncreasing(n-1);
        System.out.println(n);
    }
    
    public static void printDecreasing(int n){
        if(n == 0) return;

        System.out.println(n);
        printDecreasing(n-1);
    }

    public static void printDecreasingIncreasing(int n){
        if(n == 0) return;

        System.out.println(n);
        printDecreasingIncreasing(n-1);
        if(n != 1) System.out.println(n);
    }

    public static void printIncreasingDecreasing(int n){
        System.out.print("question doesn't exist");
    }

    public static int pow(int base,int exponent){
        if(exponent == 0) return 1;

        int smallAns = pow(base,exponent - 1);
        return smallAns * base;
    }

    public static int powOptimized(int base,int exponent){
        if(exponent == 0) return 1;

        int smallAns =  powOptimized(base,exponent / 2);
        return exponent % 2 == 0 ? smallAns * smallAns : smallAns * smallAns * base;
    }



    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
       // printIncreasing(n);
        //RecursionBasics recBasics = new RecursionBasics();
        //RecursionBasics recBasics2 = new RecursionBasics();
        //printIncreasing(10);
        //printDecreasingIncreasing(10);
        System.out.print(powOptimized(3,5));

    }
}
