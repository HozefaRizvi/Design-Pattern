/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonPattern;

/**
 *
 * @author fa20-bse-019
 */
public class BankAccount {
    //first we create a private constructor
    double balance;
    private BankAccount()
    {
        balance = 0.0;
    }
    private static BankAccount cashier;
    
    //create instance 
   public  static BankAccount getInstance()
    {
        if (cashier == null) 
        {
           cashier  = new BankAccount();
        }
        return cashier;
    }
   public void deposit(double amount)
   {
        balance+=amount;
        System.out.println("Amount credited : \t"+balance); 
   }
   public void withdraw(double amount)
   {
        balance-=amount;
        System.out.println("Amount withdrawn : \t"+balance); 
   }
   public double getBalance()
   {
      return balance;
   }
   
}
