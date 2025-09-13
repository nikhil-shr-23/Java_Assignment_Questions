//take two numbers and add them and display result
import java.util.Scanner;
public class Ques01 {
    public static void main(String[] args) {
        Scanner neb = new Scanner(System.in);
        System.out.println("enter your first number");
        int num1 = neb.nextInt();

        System.out.println("enter your second number");
        int num2 = neb.nextInt();

        System.out.println(num1+num2);
        neb.close();
        

    }
}
