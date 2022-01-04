package com.AtmMachine.Bilal;
import java.util.Scanner;
public class Bank{
    private  double balance=5000;
    private int pwd,id;

    public void Deposit(double money){
        System.out.println("Enter the Password ");
        Scanner s=new Scanner(System.in);
        pwd = s.nextInt();
        System.out.println("Enter the ID ");
        Scanner i=new Scanner(System.in);
        id = i.nextInt();
        if(pwd==1234 && id==4321){

            balance+=money;
            System.out.println("Deposited Amount"+" "  +money);
            System.out.println("Total Balance "+" "  +balance);
        }else{
            System.out.println("Wrong Password and ID");
        }
    }
    public void WithDraw(double money){
        System.out.println("Enter the Password");
        Scanner s=new Scanner(System.in);
        pwd = s.nextInt();

        System.out.println("Enter the ID ");
        Scanner i=new Scanner(System.in);
        id = i.nextInt();
        if(pwd==1234 && id == 4321){

                balance-=money;
                System.out.println("WithDrawn Amount"+" " +money);
                System.out.println("Total Balance "+" "  +balance);
            }


        else {

            System.out.println("Wrong Password and ID");
        }
    }
    public void CheckBalance(){
        System.out.println("Enter the Password");
        Scanner s=new Scanner(System.in);
        pwd = s.nextInt();
        System.out.println("Enter the ID ");
        Scanner i=new Scanner(System.in);
        id = i.nextInt();
        if (id == 4321 && pwd == 1234) {
            System.out.println("Total Balance "+" "  +balance);
        } else {
            System.out.println("Wrong Password or ID");
        }
    }


}