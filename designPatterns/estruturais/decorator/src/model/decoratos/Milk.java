package model.decoratos;

import model.Drink;

public class Milk extends DrinkDecorator{

    public Milk(Drink drink) {
        super(drink);
    }
    @Override
    public void server() {
        drink.server();
        System.out.println("Adicionando 30ml de Leite");
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() + 0.5;
    }
}
