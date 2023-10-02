package tech.kemboi;

public class Oparators {
    public static void main(String[] args) {
        int a =4;
        int b = 5;
       if (a > b) {
           System.out.println("A is greater the B");
       } else  {
           System.out.println("A is less tha 3");
       }
        System.out.println("Continue");

       switch (a) {
           case 1:
               System.out.println("A is one");
               break;
           case 2:
               System.out.println("A is two");
               break;
           case 3:
               System.out.println("A is three");
               break;
           default:
               System.out.println("A is not found");
       }

    }
}
