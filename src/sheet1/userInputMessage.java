package sheet1;

import java.util.Scanner;

public class userInputMessage {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        getInputMessage();
        scanner.close();

    }
   static void getInputMessage(){
        System.out.println("Enter your message");
        String inputMessage = scanner.nextLine();
        System.out.println(inputMessage);
    }
}
