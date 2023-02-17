package Entities;

import Entities.Interfaces.IUser;

public class User implements IUser {
private String name;
private String pass;
private int balance;
private int id;
private static int _id = 0;

    public User() {
        id = _id ++;
    }

    public User(String name, String pass, int balance) {
        this();
        this.name = name;
        this.pass = pass;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", balance='" + balance + '\'' +
                ", id=" + id +
                '}';
    }
}
