package day2;

public class SwappingTwoNumbers {
    public static void main(String[] args) {
        int a = 10,b=20;
//        int temp = a;
//        a=b;
//        b=temp;
//        System.out.println(a);
//        System.out.println(b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);

    }
}
