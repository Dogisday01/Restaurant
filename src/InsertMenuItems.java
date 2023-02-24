import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMenuItems{
    public void insert() throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "0000");

            String insertQuery = "INSERT INTO menu (id, name, price) VALUES (?, ?)";
            stmt = conn.prepareStatement(insertQuery);

            String sql = "INSERT INTO menu (id, name, price) VALUES " +
                    "(1, 'Tomato soup', 500), " +
                    "(2, 'Chicken noodle soup', 600), " +
                    "(3, 'Mushroom soup', 550), " +
                    "(4, 'Minestrone soup', 650), " +
                    "(5, 'Borscht', 700), " +
                    "(6, 'Lentil soup', 550), " +
                    "(7, 'Clam chowder', 800), " +
                    "(8, 'Pumpkin soup', 600), " +
                    "(9, 'Beef soup', 750), " +
                    "(10, 'Vegetable soup', 550), " +
                    "(11, 'Grilled chicken', 1200), " +
                    "(12, 'Beef stroganoff', 1400), " +
                    "(13, 'Fish and chips', 1300), " +
                    "(14, 'Pork chops', 1100), " +
                    "(15, 'Spaghetti bolognese', 1200), " +
                    "(16, 'Sushi platter', 1500), " +
                    "(17, 'Grilled salmon', 1400), " +
                    "(18, 'Steak', 1600), " +
                    "(19, 'Lobster', 2000), " +
                    "(20, 'Fried rice', 1000), " +
                    "(21, 'Chocolate cake', 700), " +
                    "(22, 'Cheesecake', 650), " +
                    "(23, 'Apple pie', 600), " +
                    "(24, 'Tiramisu', 800), " +
                    "(25, 'Ice cream sundae', 550), " +
                    "(26, 'Fruit salad', 500), " +
                    "(27, 'Brownie', 650), " +
                    "(28, 'Pudding', 550), " +
                    "(29, 'Creme brulee', 750), " +
                    "(30, 'Cupcakes', 500), " +
                    "(31, 'Coke', 200), " +
                    "(32, 'Sprite', 200), " +
                    "(33, 'Orange juice', 300), " +
                    "(34, 'Lemonade', 250), " +
                    "(35, 'Iced tea', 250), " +
                    "(36, 'Coffee', 350), " +
                    "(37, 'Hot chocolate', 400), " +
                    "(38, 'Milkshake', 450), " +
                    "(39, 'Red wine', 700), " +
                    "(40, 'Beer', 500)";
            stmt.executeUpdate();

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }}}