package day3;

import java.util.Scanner;

public class TextProcessor {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter some text ");
        String text= scanner.nextLine();
        boolean letterFound=false;
        int position= 0;
        for(int i =0;i<text.length();i++){
            char currentLetter=text.charAt(i);
            if(currentLetter=='A'||currentLetter=='a'){
                position = i+1;
                letterFound =true;
                break;
            }
        }
        if(letterFound){
            System.out.println("letter A found at pos "+position);
        }else{System.out.println("letter A not found");}
        scanner.close();

    }
}
