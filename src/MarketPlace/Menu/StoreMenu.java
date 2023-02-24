package MarketPlace.Menu;

import UserData.UserData;
import Users.UserRepository;
import com.sun.jdi.Value;

import javax.management.RuntimeErrorException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;


public class StoreMenu {
    private int curBalance;
    private int curID;
    public StoreMenu(UserData userData) {
        curBalance = userData.getBalance();
        curID = userData.getId();
    }

    public void run() {
        int sum = 0;
        int[][] arr = Price.setPrice();
        ArrayList<String> dishes= new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        while (true) {
            int op;
            System.out.println("Choose the category of food:");
            System.out.println("1. Soups\n" + "2. Second courses\n" + "3. Desserts\n" + "4. Drinks\n" + "5. Order");
            while (true) {
                try {
                    op = in.nextInt();
                    in.nextLine();
                    if (op < 1 || op > 5) {
                        throw new InvalidInputException("");
                    }

                } catch (InvalidInputException e) {
                    System.out.println("Wrong ID");
                    continue;
                }
                break;
            }
            if (op == 1) {
                int x = op - 1;
                System.out.println("Soups:\n" +
                        "1. Tomato soup -- 500tg\n" +
                        "2. Chicken noodle soup -- 600tg\n" +
                        "3. Mushroom soup -- 550tg\n" +
                        "4. Minestrone soup -- 650tg\n" +
                        "5. Borscht -- 700tg\n" +
                        "6. Lentil soup -- 550tg\n" +
                        "7. Clam chowder -- 800tg\n" +
                        "8. Pumpkin soup -- 600tg\n" +
                        "9. Beef soup -- 750tg\n" +
                        "10. Vegetable soup -- 550tg\n");
                while (true) {
                    try {
                        op = in.nextInt();
                        in.nextLine();
                        if (op < 1 || op > 10) {
                            throw new InvalidInputException("Wrong ID");
                        }
                        else if(arr[x][op - 1] + sum > curBalance){
                            throw new InvalidInputException("Not enough money!");
                        }

                    } catch (InvalidInputException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                        sum += arr[x][op - 1];
                        dishes.add(DishNames.getName(x, op - 1));
                    System.out.println("Dish is added to list\n");
                    break;
                }
            } else if (op == 2) {
                int x = op - 1;
                System.out.println(
                        "Second Courses:\n" +
                                "1. Grilled chicken -- 1200tg\n" +
                                "2. Beef stroganoff -- 1400tg\n" +
                                "3. Fish and chips -- 1300tg\n" +
                                "4. Pork chops -- 1100tg\n" +
                                "5. Spaghetti bolognese -- 1200tg\n" +
                                "6. Sushi platter -- 1500tg\n" +
                                "7. Grilled salmon -- 1400tg\n" +
                                "8. Steak -- 1600tg\n" +
                                "9. Lobster -- 2000tg\n" +
                                "10. Fried rice -- 1000tg\n");
                while (true) {
                    try {
                        op = in.nextInt();
                        in.nextLine();
                        if (op < 1 || op > 10) {
                            throw new InvalidInputException("Wrong ID");
                        }
                        else if(arr[x][op - 1] + sum > curBalance){
                            throw new InvalidInputException("Not enough money!");
                        }

                    } catch (InvalidInputException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    sum += arr[x][op - 1];
                    dishes.add(DishNames.getName(x, op - 1));
                    System.out.println("Dish is added to list\n");
                    break;
                }
            } else if (op == 3) {
                int x = op - 1;
                System.out.println(
                        "Desserts:\n" +
                                "1. Chocolate cake -- 700tg\n" +
                                "2. Cheesecake -- 650tg\n" +
                                "3. Apple pie -- 600tg\n" +
                                "4. Tiramisu -- 800tg\n" +
                                "5. Ice cream sundae -- 550tg\n" +
                                "6. Fruit salad -- 500tg\n" +
                                "7. Brownie -- 650tg\n" +
                                "8. Pudding -- 550tg\n" +
                                "9. Creme brulee -- 750tg\n" +
                                "10. Cupcakes -- 500tg\n");
                while (true) {
                    try {
                        op = in.nextInt();
                        in.nextLine();
                        if (op < 1 || op > 10) {
                            throw new InvalidInputException("Wrong ID");
                        }
                        else if(arr[x][op - 1] + sum > curBalance){
                            throw new InvalidInputException("Not enough money!");
                        }

                    } catch (InvalidInputException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    sum += arr[x][op - 1];
                    dishes.add(DishNames.getName(x, op - 1));
                    System.out.println("Dish is added to list\n");
                    break;
                }
            } else if (op == 4) {
                int x = op - 1;
                System.out.println(
                        "Drinks:\n" +
                                "1. Coke -- 200tg\n" +
                                "2. Sprite -- 200tg\n" +
                                "3. Orange juice -- 300tg\n" +
                                "4. Lemonade -- 250tg\n" +
                                "5. Iced tea -- 250tg\n" +
                                "6. Coffee -- 350tg\n" +
                                "7. Hot chocolate -- 400tg\n" +
                                "8. Milkshake -- 450tg\n" +
                                "9. Red wine -- 700tg\n" +
                                "10. Beer -- 500tg\n");
                while (true) {
                    try {
                        op = in.nextInt();
                        in.nextLine();
                        if (op < 1 || op > 10) {
                            throw new InvalidInputException("Wrong ID");
                        }
                        else if(arr[x][op - 1] + sum > curBalance){
                            throw new InvalidInputException("Not enough money!");
                        }

                    } catch (InvalidInputException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    sum += arr[x][op - 1];
                    dishes.add(DishNames.getName(x, op - 1));
                    System.out.println("Dish is added to list\n");
                    break;
                }
            }
            else if(op == 5){
                UserRepository.updateDB(curID, curBalance, sum);

                System.out.println("This is your bill");
                System.out.println("---------------------------------------");
                for (String i : dishes){
                    System.out.println(i);
                }
                System.out.println("---------------------------------------");
                System.out.println("Total price: " + sum + "tg");
                System.out.println("---------------------------------------");
                System.out.println("Rest money: " + (curBalance - sum) + "tg");
                break;
            }
        }
    }
}

