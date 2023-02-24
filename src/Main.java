import MarketPlace.Application;
import Users.UserRepository;
import Users.Interface.IUserRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        InsertMenuItems menu = new InsertMenuItems();
        Application app = new Application();
        app.run();
    }
}
