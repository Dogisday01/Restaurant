import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItalianRestaurantMenu {

    public static void main(String[] args) {

        // Create the menu items
        MenuItem spaghetti = new MenuItem("Spaghetti", "Traditional Italian dish with tomato sauce", 12.99);
        MenuItem pizza = new MenuItem("Pizza", "Classic Italian dish with cheese and tomato sauce", 14.99);
        MenuItem lasagna = new MenuItem("Lasagna", "Layers of pasta, meat sauce, and cheese", 16.99);
        MenuItem tiramisu = new MenuItem("Tiramisu", "Italian dessert made with ladyfingers and mascarpone cheese", 8.99);

        // Create the menu categories
        MenuCategory appetizers = new MenuCategory("Appetizers");
        appetizers.addItem(spaghetti);
        appetizers.addItem(pizza);

        MenuCategory entrees = new MenuCategory("Entrees");
        entrees.addItem(lasagna);

        MenuCategory desserts = new MenuCategory("Desserts");
        desserts.addItem(tiramisu);

        // Create the menu
        Menu menu = new Menu("Italian Restaurant Menu");
        menu.addCategory(appetizers);
        menu.addCategory(entrees);
        menu.addCategory(desserts);

        // Print the menu
        menu.printMenu();

        // Ask the user to select a menu item
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the item you would like to order:");
        int itemNumber = scanner.nextInt();
        MenuItem item = menu.getItemByNumber(itemNumber);

        // Confirm the order
        System.out.println("You have selected: " + item.getName() + " for $" + item.getPrice());
    }
}

class Menu {
    private String name;
    private List<MenuCategory> categories;

    public Menu(String name) {
        this.name = name;
        this.categories = new ArrayList<>();
    }

    public void addCategory(MenuCategory category) {
        categories.add(category);
    }

    public void printMenu() {
        System.out.println(name);
        System.out.println("---------------");
        for (int i = 0; i < categories.size(); i++) {
            categories.get(i).printCategory(i + 1);
        }
    }

    public MenuItem getItemByNumber(int number) {
        int count = 0;
        for (MenuCategory category : categories) {
            for (MenuItem item : category.getItems()) {
                count++;
                if (count == number) {
                    return item;
                }
            }
        }
        return null;
    }
}

class MenuCategory {
    private String name;
    private List<MenuItem> items;

    public MenuCategory(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void printCategory(int number) {
        System.out.println(number + ". " + name);
        System.out.println("--------------------");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((number - 1) * 10 + (i + 1) + ". " + items.get(i).getName() + " $" + items.get(i).getPrice());
        }
        System.out.println();
    }
}

class MenuItem {
    private String name;
    private String description;
    private double price;

    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;