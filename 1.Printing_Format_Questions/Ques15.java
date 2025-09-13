// accept two nuumber and print it


import java.util.Scanner;

public class Ques15 {
    public static void main(String[] args) {
     Scanner nik = new Scanner(System.in);
     System.out.println("enter your first number");

     int num1 = nik.nextInt();

     System.out.println("Enter your second number");
     int num2 = nik.nextInt();

     System.out.println("num 1 and two are ->" + num1 + num2);

     nik.close();

    }
}
