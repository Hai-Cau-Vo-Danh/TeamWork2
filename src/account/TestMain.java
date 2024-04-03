/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account;

/**
 *
 * @author Admin
 */
public class TestMain {
    public static void main(String[] args) {
        Account a1= new Account("A101", "Minh PY", 88);
        System.out.println(a1);
        Account a2= new Account("A102", "Kumar");
        System.out.println(a2);
        
        System.out.println("ID " + a1.getid());
        System.out.println("Name :" + a1.getname());
        System.out.println("Balace: " + a1.getbalance());
        
        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);
        System.out.println(a1);
        
        a1.transferto(a2, 100);
        System.out.println(a1);
        System.out.println(a2);
    }
}
