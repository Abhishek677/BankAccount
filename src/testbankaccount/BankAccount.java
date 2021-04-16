
package testbankaccount;

/**
 * Programmer: Abhishek Jassal
 * Program: PROG24178 OOP Java-2
 * Date: February 2021
 * @version 1.0
 * @author Abhishek
 */
public abstract class BankAccount {
    
    /**balance of bank account **/
    private double balance;
    /**number of deposit**/
    public int numdeposits;    
    /**number of withdrawals**/
    public int numwithdrwal;
    /**the annual Interest rate**/
    private double annualIntersetRate;
    /**The monthly charges**/
    public int monthlyCharges;
    
    /**
     * Constructor with arguments
     * @param balance
     * @param annualIntersetRate 
     */
    public BankAccount(double balance, double annualIntersetRate) {

        setBalance(balance);
        setAnnualIntersetRate(annualIntersetRate);
    }
    
    /**
     * this is getter method which return the value 
     * @return double
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * this is getter method which returns the annual interest rate
     * @return double
     */
    public double getAnnualIntersetRate() {
        return annualIntersetRate;
    }
    
    /**
     * this is setter method which validate the balance
     * @param balance 
     */
    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be Negative");
        } else {
            this.balance = balance;
        }
    }
    
    /**
     * This is setter method for Annual interest rate
     * @param annualIntersetRate 
     */
    public void setAnnualIntersetRate(double annualIntersetRate) {
        if (annualIntersetRate < 0) {
            throw new IllegalArgumentException("Interest cannot be Negative");
        } else {
            this.annualIntersetRate = annualIntersetRate;
        }
    }
    
    /**
     * this is non-abstract method for deposit
     * @param d
     * @return double
     */
    public double deposit(double d) {
        balance = balance + d;
        numdeposits++;
        return balance;

    }
    
    /**
     * this is non-abstract method for withdraw
     * @param w
     * @return 
     */
    public double withdrwal(double w) {
        balance = balance - w;
        numwithdrwal++;
        return balance;

    }
    
    /**
     * this is non-abstract method for calculating the interest
     * @return double
     */
    public double calInt() {
        double monthlyIntRate = (annualIntersetRate / 12);
        double intRate = balance * monthlyIntRate;
        return (balance = balance + intRate);

    }
    
    /**
     * this is non-abstract method for monthly Process
     */
    public void monthlyProcess() {
        this.balance = this.balance - this.monthlyCharges;
        this.calInt();
        monthlyCharges = 0;
        numdeposits = 0;
        numwithdrwal = 0;
    }
 
    /**
     * This is to string method
     * @return String
     */
    public String toString() {
        return ("The balance of account is " + balance + " The annual interest rate is " + annualIntersetRate +" The calculated interst rate is " + calInt()) ;
    }

}
