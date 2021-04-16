
package testbankaccount;

/**
 * Programmer: Abhishek Jassal
 * Program: PROG24178 OOP Java-2
 * Date: February 2021
 * @version 1.0
 * @author Abhishek
 */
public class SavingAccount extends BankAccount {  //this is Subclass of bank Account
    
    /**
     * This is constructor with argument for Saving Account
     * @param balance
     * @param AnnualIntersetRate 
     */
    public SavingAccount(double balance, double AnnualIntersetRate) {
        super(balance, AnnualIntersetRate);
    }
    
    /**
     * This is Monthly Process method which checks total service charges on withdrawals
     */
    public void monthlyProcesss() {
        if (numwithdrwal > 4) {
            super.monthlyCharges = super.monthlyCharges + super.numwithdrwal - 4;
            System.out.println("The total service charge of the month is  = " + super.monthlyCharges);
        } else if (super.getBalance() < 25) {
            throw new IllegalArgumentException("Your Saving Account is Inactive");
        } else {
            System.out.println("The total service charge of the month is  = " + super.monthlyCharges);
            System.out.println("Your Saving Account is Curently Active");
        }

    }
    
    /**
     * This is method to validate account is active or not upon withdraw
     * @param w
     * @return double
     */
    public double withdrwal(double w) {
        if (super.getBalance() > 25) {
            System.out.println("Your Saving Account is Currently Active");
            return super.withdrwal(w);
        } else {
            throw new IllegalArgumentException("Your Saving Account is Currently Inactive");
        }
    }

    /**
     * This method to validate  account is active or inactive upon deposit
     * @param d
     * @return double
     */
    public double deposited(double d) {
        if ((super.getBalance() < 25)) {
            throw new IllegalArgumentException("Your Saving Account is Inactive");
        } else {
            return super.deposit(d);
        }
    }
    
    /**
     * This method calls the method of abstract class
     * @return double
     */
    public double calInt() {
        return super.calInt();
    }

    /**
     * This method calls the method of abstract class toString method
     * @return String
     */
    public String toString() {
        return super.toString();
    }

}
