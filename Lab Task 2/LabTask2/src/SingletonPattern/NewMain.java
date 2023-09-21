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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Singleton Design Patern");
        BankAccount cashier  = BankAccount.getInstance();
        cashier.deposit(2000);
        cashier.withdraw(200);
        System.out.println("Current Balance: \t"+cashier.getBalance());
        
    }
    
}
