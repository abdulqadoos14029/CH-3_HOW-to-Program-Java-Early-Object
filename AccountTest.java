package com.example.account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Please Enter User Name: ");
        String name=input.nextLine();
        System.out.print("Please Enter Balance: ");
        Double balance= input.nextDouble();
        Account user1= new Account(name,balance);
        System.out.print("Press the buttons: \n1) To add Money\n2) To withDraw Money\n3) To Check Balance \n4) To quit\n");
        int input1= input.nextInt();

        while (input1!=4){
            if (input1==1){
                double ammount;
                System.out.print("Please Enter Deposit Ammount: ");
                ammount=input.nextDouble();
                user1.deposit(ammount);
                System.out.print("Press the buttons: \n1) To add Money\n2) To withDraw Money\n3) To Check Balance \n4) To quit\n");
                input1= input.nextInt();
            }
            if(input1==2){
                double withdrawAmmount;
                System.out.print("Please Enter Withdraw Ammount: ");
                withdrawAmmount=input.nextDouble();
                if(withdrawAmmount>user1.getBalance()){
                    System.out.print("Withdrawl Ammount Exceeded Account Balance\n");
                }
                else{
                    user1.withdrawl(withdrawAmmount);
                }
                System.out.print("Press the buttons: \n1) To add Money\n2) To withDraw Money\n3) To Check Balance \n4) To quit\n");
                input1= input.nextInt();
            }

            if(input1==3){
                System.out.printf("Remaining Balance: %.2f%n",user1.getBalance());
            }
            System.out.print("Press the buttons: \n1) To add Money\n2) To withDraw Money\n3) To Check Balance \n4) To quit\n");
            input1= input.nextInt();
        }
    }
}
