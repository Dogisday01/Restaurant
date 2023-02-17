package Entities.Staff;

import Entities.Interfaces.IAdmin;

public class Admin implements IAdmin {
    private int id;
    private String name;
    private String pass;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
