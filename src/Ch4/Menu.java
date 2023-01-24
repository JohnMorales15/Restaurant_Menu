package Ch4;

import Ch4.MenuItem;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> food;
    private final String restaurantName;

    public Menu(ArrayList<MenuItem> food, String restaurantName) {
        this.food = food;
        this.restaurantName = restaurantName;
    }

    public ArrayList<MenuItem> getFood() {
        return this.food;
    }

    public void setFood(ArrayList<MenuItem> food) {
        this.food = food;
    }

    public String getRestaurantName() {
        return this.restaurantName;
    }

}
