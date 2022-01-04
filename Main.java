package com.AtmMachine.Bilal;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	Bank b=new Bank();
    System.out.println("Supossing your Balance is 5000 and Password is 1234 (Details Given JUst to check the program is good to go or not.");
        for (String s : Arrays.asList( "Enter Your Fucking Choice ",
                "1:Deposit",
                "2:Withdraw",
                "3:Balance ")) {
            System.out.println(s);
        }

        Scanner s3=new Scanner(System.in);
        int Choice = s3.nextInt();

        if (Choice == 1) {
            System.out.println("Enter the Amount");
            Scanner m=new Scanner(System.in);
        double    money = m.nextInt();
            b.Deposit(money);
        } else {
            if (Choice == 2) {
                System.out.println("Enter the Amount");
                Scanner m=new Scanner(System.in);
                double    money = m.nextInt();
                b.WithDraw(money);
            } else if (Choice == 3){
               b.CheckBalance();
            }
            else {
                System.out.print("Invalid Choice");
            }
        }
    }
}
