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


    public Date getLastUpdatedDate() {
        return dateUpdated;
    }

    @Override
    public String toString() {
        return
                "Current Menu: " + "\n" + fullMenu;
    }
}
