package day2;

public class Operators {
    public static void main(String[] args) {
        // Arithmetic operators
        int a=20, b=10;
        System.out.println("sum="+(a+b));
        System.out.println("sub="+(a-b));
        System.out.println("multiplication="+(a*b));
        System.out.println("div="+(a/b));
        System.out.println("reminder="+(a%b));
        //relational/comparison operators
        System.out.println("a>b= "+(a>b));
        System.out.println("a>=b= "+(a>=b));
        System.out.println("a<b= "+(a<b));
        System.out.println("a<=b= "+(a<=b));
        System.out.println("a==b= "+(a==b));
        System.out.println("a!=b= "+(a!=b));
        //logical operators -> &&, ||, !
        System.out.println("a&&b ="+(a>b && a>=b));
        System.out.println("a&&b ="+(a>b || a>=b));
        System.out.println("a&&b ="+(a>b != a>=b));
        //increment, decrement
        int x= 10;
        int y = x++;
        System.out.println(x);
        System.out.println(y);
        System.out.println(y++);
        System.out.println(y++);
        System.out.println(++y);
        // assignment  = += -= *= /= %=
        int z= 10;
        int n = z;
        z+=10;
        System.out.println(z);
        System.out.println(n);
        //conditional/ternary
        //var = exp ? true : false

    }
}
