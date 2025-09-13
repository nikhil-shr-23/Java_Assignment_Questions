//program to calculate da,hra,pf,ta from user salary

import java.util.Scanner;

public class Ques22 {
    public static void main(String[] args) {
        Scanner socc = new Scanner(System.in);
        System.out.println("Enter your salary");

        double salr = socc.nextDouble();

        double da = salr * 0.05;
        double hra = salr * 0.09;
        double pf = salr * 0.10;
        double ta = salr * 0.06;

        double gross = salr + da +hra -pf +ta;

        System.out.println("\n------ Salary Breakdown ------");
        System.out.println("Basic Salary      : " + salr);
        System.out.println("Dearness Allowance (5%) : " + da);
        System.out.println("House Rent Allowance (8%): " + hra);
        System.out.println("Travel Allowance (6%)   : " + ta);
        System.out.println("Provident Fund (10%)    : " + pf);
        System.out.println("--------------------------------");
        System.out.println("Gross Salary      : " + gross);
        
    }
}
