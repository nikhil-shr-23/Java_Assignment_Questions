// printing data in a particular format like in question

import java.util.Scanner;

public class Ques21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Class: ");
        String cls = sc.nextLine();
        System.out.println("Enter Section: ");
        String sec = sc.nextLine();
        System.out.println("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter School Name: ");
        String school = sc.nextLine();
        System.out.println("Enter Website: ");
        String website = sc.nextLine();

        System.out.println("===============================");
        System.out.println("||Name : " + name + "                   ||");
        System.out.println("|| Class : " + cls + " Sec: " + sec + " Roll: " + roll + "||");
        System.out.println("|| School name : " + school + " ||");
        System.out.println("|| Website : " + website + " ||");
        System.out.println("===============================");

        sc.close();
    }
}
