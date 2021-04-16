package testbankaccount;

import java.util.Scanner;    //this Imports the Scanner class

/**
 * Programmer: Abhishek Jassal
 * Program: PROG24178 OOP Java-2
 * Date: February 2021
 * @version 1.0
 * @author Abhishek
 */
public class TestBankAccount { //start of class block

    /**
     * Program always start from main method
     * @param args the command line arguments
     */
    public static void main(String[] args) { //start of main method block

        Scanner input = new Scanner(System.in);   // this is for taking user input
        
        try {//start of try block
            
            System.out.print("Enter your balance of Account: ");
            double b = input.nextDouble();
            System.out.print("Enter the Annual Interest Rate for the amount: ");
            double i = input.nextDouble();
            
            
            //Creating object for Saving account class which takes balance and Interst rate as arguments
            SavingAccount sa = new SavingAccount(b, i);             
            System.out.println("The Balance after Putting the Monthly Interest on  Balance " + sa.calInt());
            

            System.out.print("\nEnter money to withdraw: ");  
            double w = input.nextDouble();
            System.out.print("Enter money to deposit: ");
            double d = input.nextDouble();

            System.out.println("\nYour balnce after withdraw the money: " + sa.withdrwal(w));
            System.out.println("Your balnce after deposited the money: " + sa.deposited(d));

            System.out.println("\nDo you want to make any more withdrawals? If yes please enter 1 and if no please enter 0");

            int a = input.nextInt();
            while (a == 1) {  // loop for Witdrawing the money
                System.out.println("Enter Money to Withdraw");
                double w1 = input.nextDouble();
                System.out.println("After withdraw your Balance=" + sa.withdrwal(w1));
                System.out.println();
                System.out.println("Do you want more withdraw? enter 1 for yes , 0 for no");
                a = input.nextInt();
            }

            System.out.println("\nDo you want to make any more deposited? If yes please enter 1 and if no please enter 0");

            int c = input.nextInt();
            while (c == 1) {  // loop for depositing the money
                System.out.print("enter money to deposit ");
                double d1 = input.nextDouble();
                System.out.println("after deposit balance=" + sa.deposited(d1));
                System.out.println("do you want more deposited? enter 1 for yes , 0 for no");
                c = input.nextInt();
            }
            System.out.println("\nTotal number of deposit made = " + sa.numdeposits);
            System.out.println("The total number of withdrawals made = " + sa.numwithdrwal);
            sa.monthlyProcesss();
            
            System.out.println("\nThis is toString method from abstarct class\n" + sa.toString() );
            

        }//end of catch block
            catch (Exception e) {//start of catch block
            System.out.println("catch block=" + e.getMessage());

        }//end of catch block
    }//end of main method block
}//end class block
