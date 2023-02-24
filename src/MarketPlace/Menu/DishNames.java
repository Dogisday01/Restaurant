package MarketPlace.Menu;
import java.util.*;
public class DishNames {

    public static String getName(int n, int m){
        String[][] dishList = new String[4][10];
        dishList[0][0] = "Tomato soup -- 500tg";
        dishList[0][1] = "Chicken noodle soup -- 600tg";
        dishList[0][2] = "Mushroom soup -- 550tg";
        dishList[0][3] = "Minestrone soup -- 650tg";
        dishList[0][4] = "Borscht -- 700tg";
        dishList[0][5] = "Lentil soup -- 550tg";
        dishList[0][6] = "Clam chowder -- 800tg";
        dishList[0][7] = "Pumpkin soup -- 600tg";
        dishList[0][8] = "Beef soup -- 750tg";
        dishList[0][9] = "Vegetable soup -- 550tg";

        dishList[1][0] = "Grilled chicken -- 1200tg";
        dishList[1][1] = "Beef stroganoff -- 1400tg";
        dishList[1][2] = "Fish and chips -- 1300tg";
        dishList[1][3] = "Pork chops -- 1100tg";
        dishList[1][4] = "Spaghetti bolognese -- 1200tg";
        dishList[1][5] = "Sushi platter -- 1500tg";
        dishList[1][6] = "Grilled salmon -- 1400tg";
        dishList[1][7] = "Steak -- 1600tg";
        dishList[1][8] = "Lobster -- 2000tg";
        dishList[1][9] = "Fried rice -- 1000tg";

        dishList[2][0] = "Chocolate cake -- 700tg";
        dishList[2][1] = "Cheesecake -- 650tg";
        dishList[2][2] = "Apple pie -- 600tg";
        dishList[2][3] = "Tiramisu -- 800tg";
        dishList[2][4] = "Ice cream sundae -- 550tg";
        dishList[2][5] = "Fruit salad -- 500tg";
        dishList[2][6] = "Brownie -- 650tg";
        dishList[2][7] = "Pudding -- 550tg";
        dishList[2][8] = "Creme brulee -- 750tg";
        dishList[2][9] = "Cupcakes -- 500tg";

        dishList[3][0] = "Coke -- 200tg";
        dishList[3][1] = "Sprite -- 200tg";
        dishList[3][2] = "Orange juice -- 300tg";
        dishList[3][3] = "Lemonade -- 250tg";
        dishList[3][4] = "Iced tea -- 250tg";
        dishList[3][5] = "Coffee -- 350tg";
        dishList[3][6] = "Hot chocolate -- 400tg";
        dishList[3][7] = "Milkshake -- 450tg";
        dishList[3][8] = "Red wine -- 700tg";
        dishList[3][9] = "Beer -- 500tg";

        return dishList[n][m];
    }
}
