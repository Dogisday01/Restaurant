package UserData;

public class UserData {
    private int id;
    private String name, pass;
    private int balance;
    public UserData(int id, String name, String pass, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + pass + ", " + balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
