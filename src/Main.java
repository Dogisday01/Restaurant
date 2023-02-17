import Users.UserRepository;
import Users.Interface.IUserRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello welcome to our restaurant\n" + "options:");
        System.out.println("1. Sign up\n" + "2. Log in\n" + "3. Delete User\n" + "4. Show all users");
        int n = in.nextInt();
        if (n == 1){
            System.out.print("Enter your name: ");
            String name = in.next();
            System.out.print("Enter your pass: ");
            String pass = in.next();
            System.out.print("Enter your balance: ");
            int balance = in.nextInt();
            System.out.println(UserRepository.createUser(name,pass,balance));

        } else if (n==2) {
            System.out.print("Enter your name: ");
            String name = in.next();
            System.out.print("Enter your pass: ");
            String pass = in.next();
            System.out.println(UserRepository.logIn(name,pass));
        } else if (n==3) {
            System.out.print("Enter your name: ");
            String name = in.next();
            System.out.print("Enter your pass: ");
            String pass = in.next();
            System.out.println(UserRepository.deleteUser(name,pass));
        }
        else if (n==4) {
            System.out.println(UserRepository.showUsers());
        }
    }
}
