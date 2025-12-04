package day2;

import java.util.Scanner;

public class EmployeeGrossPay {
    public static void main(String[] args) {
        //What we have
        int rate =15,maxHoursPerWeek=40;
        //what we need
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the working hours:");
        int hours = scanner.nextInt();
        while(hours>maxHoursPerWeek){
            System.out.println("Please Enter Number between 1 and 40");
            hours= scanner.nextInt();
        }
        int grossPay= rate*hours;
        System.out.println("gross pay is "+grossPay);
        scanner.close();

    }
}
