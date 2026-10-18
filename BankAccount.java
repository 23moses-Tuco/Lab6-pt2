
/**
 * Write a description of class BankAccount here.
 *
 * @author Moses Mendez, mmendez029@student.sddccd.edu
 * @version v1.0
 * @since 10/17/2026
 */
public class BankAccount
{
    // instance variables - replace the example below with your own
    private double balance, deposit, withdraw, interest, monthlyIntRate;

    /**
     * Constructor for objects of class BankAccount
     */
    public BankAccount()
    {
        monthlyIntRate=(0.044)/12;
    }
    
    /**
     * Constructor for objects of class BankAccount with parameters where inBalance is an int
     * 
     * @param  inBalance int representing current account balance
     * @param  intRate double representing the current annual rate
     */
    public BankAccount(int inBalance, double intRate)
    {
        balance=(double)inBalance;
        monthlyIntRate=(intRate/100)/12;
    }
    
    /**
     * Constructor for objects of class BankAccount with parameters where inBalance is a double
     * 
     * @param  inBalance double representing current account balance
     * @param  intRate double representing the current annual rate
     */
    public BankAccount(double inBalance, double intRate)
    {
        balance=inBalance;
        monthlyIntRate=(intRate/100)/12;
    }
    
    
    /**
     * Mutator adding in the currency as a double
     * 
     * @param add double representing the number to be added to the current balance
     */
    public void makeDeposit(double add){
        balance+=add;
        deposit+=add;
    }
    
    /**
     * Mutator adding in currency as an integer
     * 
     * @param add int representing the number to be added to the current balance
     */
    public void makeDeposit(int add){
        balance+=(double)add;
        deposit+=(double)add;
    }
    
    /**
     * Mutator subtracting currency from balance as a double
     * 
     * @param sub double representing number to be subtracted from current balance.
    */
    public void makeWithdraw(double sub){
        balance-=sub;
        withdraw+=sub;
    }
    
    /**
     * Mutator subtracting currency from balance as an int
     * 
     * @param sub int representing number to be subtracted from current balance.
    */
    public void makeWithdraw(int sub){
        balance-=(double)sub;
        withdraw+=(double)sub;
    }
    
    /**
     * calculates interest and adds it to overall interest and overall balance.
     * 
    */
    public void calcInterest(){
        if(balance>0){
            interest+=balance*monthlyIntRate;
            balance+=balance*monthlyIntRate;
        }
    }
    
    /**
     * Getter that returns current balance.
     * 
     * @return balance double representing current balance.
    */
    public double getBalance(){
        return balance;
    }
    
    /**
     * Getter that returns total deposits made.
     * 
     * @return balance double representing current balance.
    */
    public double getDeposit(){
        return deposit;
    }
    
    /**
     * Getter that returns total withdraws made.
     * 
     * @return balance double representing current balance.
    */
    public double getWithdraw(){
        return withdraw;
    }
    
    /**
     * Getter that returns total interest accumulated.
     * 
     * @return balance double representing current balance.
    */
    public double getInterest(){
        return interest;
    }
}