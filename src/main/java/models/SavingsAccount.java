package models;

public class SavingsAccount {

    int balance;

    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }
    public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
    }
    public int deposit(int amountToDeposit ){
        balance = balance + amountToDeposit ;
        System.out.println( "You just deposited " + amountToDeposit);
        return amountToDeposit;
    }

//    public void deposit(int amountToDeposit ){
//        int updatedBalance = balance + amountToDeposit ;
//        balance = updatedBalance;
//    }
//
    public int withdraw(int amountToWithdraw ){
        balance =  balance - amountToWithdraw;
        System.out.println( "You just withdrew " + amountToWithdraw);
        return amountToWithdraw;

    }
//    public void withdraw(int amountToWithdraw ){
//        int updatedBalance=  balance - amountToWithdraw;
//        balance = updatedBalance;
//
//    }
    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);

        //Check balance:
        savings.checkBalance();

        //Withdrawing:
        savings.withdraw(100);

        //Check balance:
        savings.checkBalance();

        //Deposit:
        savings.deposit(200);

        //Check balance:
        savings.checkBalance();

        //Deposit:
        savings.deposit(300);

        //Check balance:
        savings.checkBalance();

    }
}
