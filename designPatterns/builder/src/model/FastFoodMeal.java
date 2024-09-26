package model;

public class FastFoodMeal {

    private String drink;
    private String main;
    private String side;
    private String dessert;
    private String gift;

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    public String getDrink() {
        return drink;
    }

    public String getMain() {
        return main;
    }

    public String getSide() {
        return side;
    }

    public String getDessert() {
        return dessert;
    }

    public String getGift() {
        return gift;
    }

    @Override
    public String toString() {
        return "FastFoodMeal{" +
                "drink='" + drink + '\'' +
                ", main='" + main + '\'' +
                ", side='" + side + '\'' +
                ", dessert='" + dessert + '\'' +
                ", gift='" + gift + '\'' +
                '}';
    }
}
