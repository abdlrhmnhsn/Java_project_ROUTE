package sheet1;

public class printFrom1To10 {
    public static void main(String[] args) {
        //Print 1–10 (Without Loop)
        getNumberToPrint();
        //Print 1–10 (With Loop)
        getNumberToPrintLoop();
    }
    static void getNumberToPrint(){
        int x=1;
        //Print 1–10 (Without Loop)
       switch (x)
       {
           case 1:
               System.out.println(x);
               x=x+1;
               System.out.println(x);
           case 2: x=x+1;
               System.out.println(x);
           case 3: x=x+1;
               System.out.println(x);
           case 4: x=x+1;
               System.out.println(x);
           case 5: x=x+1;
               System.out.println(x);
           case 6: x=x+1;
               System.out.println(x);
           case 7: x=x+1;
               System.out.println(x);
           case 8: x=x+1;
               System.out.println(x);
           case 9: x=x+1;
               System.out.println(x);break;
       }

    }
    static void getNumberToPrintLoop(){
        int y=1;
        for(int i=0;y<=10;i++){
            System.out.println(y);
            y++;
        }
    }
}
