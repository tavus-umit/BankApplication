import java.math.*;
import java.text.DecimalFormat;
import java.util.Random;

public class Account {
    // Instance Variables
    private String Name;
    private String Iban;
    private double Balance;

    // Constructor
    public Account(String name)
    {
        this.Name = name;
        this.Balance = 0.00;
        this.Iban = ibanGenerator();
    }
    public Account()
    {
        this.Name = "";
        this.Balance = 0;
        this.Iban = "";
    }
    // Getters and Setters

    public String getName(){return  Name;}
    public String getIban() {
        return Iban;
    }
    public double getBalance() {
        return Balance;
    }
    public String getBalanceString()
    {
        DecimalFormat df = new DecimalFormat("0.00");
        String balance =  df.format(this.Balance) + "₺";
        return balance;
    }

    public void setName(String name){Name = name;}
    public void setIban(String iban) {
        Iban = iban;
    }
    public void setBalance(double balance) {
        Balance = balance;
    }

    public String toString()
    {
        String account = "Name: " + this.Name + " | " + "Iban: " + this.Iban + " | " + "Balance: " + getBalanceString();
        return account;
    }
    public String ibanGenerator()
    {
        String IbanHead = "TR";
        Random rand = new Random();
        long ibanNum1 = rand.nextLong(100000000,1000000000);
        long ibanNum2= rand.nextLong(100000000,1000000000);
        long ibanNum3 = rand.nextLong(10000,1000000);
        IbanHead = IbanHead + ibanNum1 + ibanNum2 + ibanNum3;
        return IbanHead;
    }

}


