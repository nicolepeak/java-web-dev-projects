package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date dateUpdated;
    private ArrayList<MenuItem> fullMenu;

    public Menu(Date dateUpdated, ArrayList<MenuItem> menuItems) {
        this.dateUpdated = dateUpdated;
        this.fullMenu = menuItems;
    }

    public void buildInitialMenu() {
        //appetizers below:
        fullMenu.add(new MenuItem("Caprese Salad", "Tomatoes, mozzarella, basil, balsamic glaze", 8.99, "Appetizer", false));
        fullMenu.add(new MenuItem("Garlic Bread", "Toasted bread with garlic butter", 6.99, "Appetizer", false));
        fullMenu.add(new MenuItem("Spinach Artichoke Dip", "Creamy dip with spinach, artichokes, and cheese", 9.99, "Appetizer", false));
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return fullMenu;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.fullMenu = menuItems;
    }

    public void addMenuItem(MenuItem menuItem) {
        fullMenu.add(menuItem);
    }

    public void removeMenuItem(MenuItem menuItem) {
        fullMenu.remove(menuItem);
    }


}
