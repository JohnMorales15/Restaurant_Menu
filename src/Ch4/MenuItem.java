package Ch4;

import java.util.Date;

public class MenuItem {

    private String description;
    private double price;
    private String category;
    private Date itemDate;
    private Boolean isNew = true;


    public MenuItem(String description, double price, String category, Date itemDate, Boolean isNew) {
        this.description = description;
        this.price = price;
        this.category = category;
        this.itemDate = itemDate;
        this.isNew = isNew;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDate(){
        return this.itemDate;
    }

    public void setItemDate(Date itemDate) {
        this.itemDate = itemDate;
    }

    public Boolean getIsNew(){
        return this.isNew;
    }

    public void setNew(Boolean aNew) {
        this.isNew = aNew;
    }
}
