package model;

public class Expresso implements Drink{
    @Override
    public void server() {
        System.out.println("Adicionando 50ml de Expresso");
    }

    @Override
    public Double getPrice() {
        return 1.0;
    }
}
