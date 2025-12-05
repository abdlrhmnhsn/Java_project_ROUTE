package sheet1;

import java.util.Scanner;

public class switchCase_DayOfWeek {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        getDayName();
        scanner.close();

    }
    static void getDayName(){
        System.out.println("Enter the day number from 1 to 7: ");
        int dayNum= scanner.nextInt();
        switch (dayNum){
            case 1:
                System.out.println("It's Saturday");break;
            case 2:
                System.out.println("It's Sunday");break;
            case 3:
                System.out.println("It's Monday");break;
            case 4:
                System.out.println("It's Tuesday");break;
            case 5:
                System.out.println("It's Wednesday");break;
            case 6:
                System.out.println("It's Thursday");break;
            case 7:
                System.out.println("It's Friday");break;
            default:System.out.println("Day number entered isn't correct, please enter number from 1-7");
        }
        {
    }
}

}
