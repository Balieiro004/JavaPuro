package model;

public class Tea implements Drink{
    @Override
    public void server() {
        System.out.println("Adicionando 100ml de Tea");
    }

    @Override
    public Double getPrice() {
        return 1.5;
    }
}
