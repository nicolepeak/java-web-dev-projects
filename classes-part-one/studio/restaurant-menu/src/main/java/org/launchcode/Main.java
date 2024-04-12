package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        MenuItem appetizer1 = new MenuItem("Caprese Salad", "Tomatoes, mozzarella, basil, balsamic glaze", 8.99, "Appetizer", false);
        MenuItem appetizer2 = new MenuItem("Garlic Bread", "Toasted bread with garlic butter", 6.99, "Appetizer", false);

        MenuItem mainCourse1 = new MenuItem("Spaghetti Carbonara", "Pasta with bacon, eggs, Parmesan cheese", 12.99, "Main Course", true);
        MenuItem mainCourse2 = new MenuItem("Grilled Salmon", "Fresh salmon fillet with lemon and herbs", 14.99, "Main Course", false);

        MenuItem dessert1 = new MenuItem("Tiramisu", "Italian dessert made with ladyfingers and coffee", 7.99, "Dessert", false);
        MenuItem dessert2 = new MenuItem("Chocolate Lava Cake", "Warm chocolate cake with a molten chocolate center", 6.99, "Dessert", true);

        ArrayList<MenuItem> fullMenu1 = new ArrayList<>();
        fullMenu1.add(appetizer1);
        fullMenu1.add(appetizer2);
        fullMenu1.add(mainCourse1);
        fullMenu1.add(mainCourse2);
        fullMenu1.add(dessert1);
        fullMenu1.add(dessert2);


        Date currentDate = new Date();
        Menu menu1 = new Menu(currentDate, fullMenu1);
        System.out.println(menu1);

        MenuItem selectedItem = menu1.getMenuItems().get(0);

        System.out.println(selectedItem.toString());

        menu1.removeMenuItem(selectedItem);

        System.out.println();
        System.out.println("Updated Menu: ");
        System.out.println(menu1);

    }
}
