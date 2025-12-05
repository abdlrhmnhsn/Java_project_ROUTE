package sheet1;

import java.util.Scanner;

public class personal_Info {
    static Scanner scanner= new Scanner(System.in);
    static int age,salary;
    static String name;
    public static void main(String[] args) {
        name= getName(name);
        age= getAge();
        salary= getSalary();
        scanner.close();
        System.out.println("Name:"+name+" |Age:"+age+" |Salary:"+salary);

    }
    static String getName(String name){
        // the variable accept integer number. I tried, but I could not handle it
        while (true) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();

            // allow only letters and spaces
            if (name.matches("[a-zA-Z ]+")) {
                break;
            }

            System.out.println("Invalid name! Please enter letters only.");
        }
        return name;
    }
    static int getAge(){
        System.out.println("Enter your age:");
        int age=scanner.nextInt();
        return age;
    }
    static int getSalary(){
        System.out.println("Enter your salary:");
        int salary=scanner.nextInt();
        return salary;
    }


}
