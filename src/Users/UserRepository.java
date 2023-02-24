package Users;

import Users.Interface.IUserRepository;
import UserData.UserData;


import java.sql.*;
import java.util.Scanner;

public class UserRepository{


    private static String URL = "jdbc:mysql://localhost:3306/users";

    public static String createUser(String name, String pass, int balance){

        String s = "";
        try{
            ;
            String sql = "INSERT INTO users_info  (user_name, user_pass, user_balance) VALUES (?,?,?)";
            PreparedStatement pst = DriverManager.getConnection(URL,"root","0000").prepareStatement(sql);

            pst.setString(1, name);
            pst.setString(2, pass);
            pst.setInt(3, balance);

            pst.execute();

            s = "A new user was inserted successfully!";
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return s;
    }

    public static UserData logIn(){

        Scanner in = new Scanner(System.in);
        Connection con = null;
        String s = "";
        String tempID = null;
        String tempName = null;
        String tempBalance = null;
        String tempPass = null;
        while (true) {
            System.out.print("Enter your name: ");
            String name = in.next();
            in.nextLine();
            System.out.print("Enter your pass: ");
            String pass = in.next();
            in.nextLine();
            try {
                con = DriverManager.getConnection(URL, "root", "0000");
                Statement st = con.createStatement();
                String sql = "SELECT * FROM users_info WHERE user_name='" + name + "' AND user_pass = '" + pass + "'";

                ResultSet rs = st.executeQuery(sql);

                if (rs.next()) {
                    tempID = rs.getString("id");
                    tempName = rs.getString("user_name");
                    tempPass = rs.getString("user_pass");
                    tempBalance = rs.getString("user_balance");
                    System.out.println("Welcome!");
                } else {
                    System.out.println("User name or password is not correct!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            return new UserData(Integer.parseInt(tempID), tempName, tempPass, Integer.parseInt(tempBalance));
        }
    }
    public static String  deleteUser(String name, String pass) {
        Connection con = null;
        String s = "";
        try {
            con = DriverManager.getConnection(URL,"root","0000");
            String sql = "DELETE FROM users_info WHERE user_name=? AND user_pass = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, name);
            st.setString(2,pass);
            st.executeUpdate();
            s = "User successfully deleted ";
        } catch(Exception e){
            s = e.getMessage();
        }

        return s;
    }
    public static String showUsers(){
        Connection con = null;
        String s = "1";
        try{
            con = DriverManager.getConnection(URL,"root","0000");
            String sql = "SELECT * FROM users_info";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                s = rs.getString("id") + " " + rs.getString("user_name");
                System.out.println(s);
            }
        }catch(Exception e){
            e.getMessage();
        }
        return s;

    }
    public static void updateDB(int id, int restSum, int sum)
    {
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","0000");
            String sql = "UPDATE users_info SET user_balance = ? WHERE id = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, restSum - sum);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
