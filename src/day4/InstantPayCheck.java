package day4;

import java.util.Scanner;

public class InstantPayCheck {
    static final double requiredSalary = 20000;
    static final double requiredCreditScore=700;
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        //What we have
        //What we need to get
        double salary= getEmployeeSalary();
        double creditScore= getEmployeeCrditScore();
        boolean qualified = isQualified(salary,creditScore);
        scanner.close();
        notifyUser(qualified);


    }
    static double getEmployeeSalary(){
        Scanner scanner= new Scanner(System.in);
        System.out.println(("Enter your salary "));
        double salary =scanner.nextDouble();
       return salary;

    }
    static double getEmployeeCrditScore() {
        System.out.println("Enter your credit score ");
        double creditScore = scanner.nextDouble();
        return creditScore;
    }

    static boolean isQualified(double salary,double creditScore){
        if(salary>requiredSalary&&creditScore>requiredCreditScore){
            return true;
        }else {
            return false;
        }
    }
    static boolean notifyUser(boolean qualified){
        if(qualified){
            System.out.println("Congrats! you are qualified for loan");
            return true;
        }else{
            System.out.println("sorry");
            return false;
        }
    }
}
