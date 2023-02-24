package MarketPlace;

import MarketPlace.Menu.StoreMenu;
import Users.UserRepository;

import java.sql.SQLOutput;
import java.util.Scanner;
import UserData.UserData;

public class Application extends UserRepository{

public void run(){
    Scanner in = new Scanner(System.in);
    System.out.println("Hello welcome to our restaurant");
    while (true) {
        System.out.println("\noptions:");
        System.out.println("1. Sign up\n" + "2. Log in\n" + "3. Delete User\n" + "4. Show all users\n" + "5. Exit");
        int n = in.nextInt();
        if (n == 1) {
            System.out.print("Enter your name: ");
            String name = in.next();
            System.out.print("Enter your pass: ");
            String pass = in.next();
            System.out.print("Enter your balance: ");
            int balance = in.nextInt();
            System.out.println(UserRepository.createUser(name, pass, balance));

        }
        else if (n == 2) {

            UserData userData =  UserRepository.logIn();

            System.out.println("what would you like to order?\n");
            StoreMenu d = new StoreMenu(userData);
            d.run();
        }
        else if (n == 3) {
            System.out.print("Enter your name: ");
            String name = in.next();
            System.out.print("Enter your pass: ");
            String pass = in.next();
            System.out.println(UserRepository.deleteUser(name, pass));
        }
        else if (n == 4) {
            System.out.println(UserRepository.showUsers());
        }
        else{
            System.out.println("Bye!");
            break;
        }
    }
}

}
