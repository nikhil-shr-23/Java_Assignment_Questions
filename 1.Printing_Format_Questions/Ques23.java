//paragraph wala question

import java.util.Scanner;

public class Ques23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();

        System.out.println("\n" + name + " loves to play hockey and is a great player. "
                + name + " has one false foot. One day "+name+" bhai broke his leg into 4 pieces due to some anguish "
                + "but since Uday was kind at heart, he also paid for the medications, the operation and also gave him some cash. "
                + name + " is now entirely well.");

        sc.close();
    }
}
