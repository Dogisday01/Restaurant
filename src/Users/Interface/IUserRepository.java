package Users.Interface;

public interface IUserRepository {
    String createUser(String name, String pass, int balance);
    String logIn(String name, String pass);
    String deleteUser(String name, String pass);
    String showUsers();

}
