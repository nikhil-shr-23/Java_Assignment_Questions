//take character and print it

import java.util.Scanner;

public class Ques20 {
    public static void main(String[] args) {
        Scanner socc = new Scanner(System.in);
        System.out.print("Enter a character ");
        char ch = socc.next().charAt(0); 

        System.out.println("character-- " + ch);
        socc.close();
    }
}
