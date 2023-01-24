package Ch4;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    MenuItem pasta = new MenuItem("Pasta", 9.99, "Entree", January 1, 1970, 00:00:00, true);
    MenuItem chicken = new MenuItem("Chicken", 7.00, "Entree");
    MenuItem steak = new MenuItem("Steak", 10.99, "Entree");
    MenuItem fries = new MenuItem("French Fries", 2.99, "Appetizer");
    MenuItem cake = new MenuItem("Chocolate Cake", 2.99, "Dessert");

        ArrayList<MenuItem> appleChilis = new ArrayList<>();
        appleChilis.add(pasta);
        appleChilis.add(chicken);
        appleChilis.add(steak);
        appleChilis.add(fries);
        appleChilis.add(cake);

        System.out.println(appleChilis);
    }

}