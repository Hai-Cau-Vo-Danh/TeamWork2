/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package account;

/**
 *
 * @author Admin
 */
public class Account {
    public String id;
    public String name;
    public int balance;
    
    Account(String id,String name)
    {
        this.id=id;
        this.name=name;
    }
    Account(String id,String name,int balance)
    {
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    public String getid()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }
    public int getbalance()
    {
        return balance;
    }
    public int credit(int amount)
    {
        this.balance=amount;
        return balance;
    }
    public int debit(int amount)
    {
        if(amount <= balance)
        {
            this.balance=balance;
        }
        else 
            System.out.println("Amount exceeded balance");
        return balance;
    }
    public int transferto(Account another,int amount)
    {
         if(amount <= balance){
        another.balance += amount;
        balance -= amount;
}
    else {
        System.out.println("Amount exceeded balance");
    }
    return balance;
    }
    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name=" + name + ", balance=" + balance + '}';
    }
}
