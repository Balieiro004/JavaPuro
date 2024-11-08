import model.Drink;
import model.Expresso;
import model.Tea;
import model.decoratos.DoubleDrink;
import model.decoratos.Milk;

public class Main {

    public static void order(String name, Drink drink) {
        System.out.println("Ordem: " + name);
        drink.server();
        System.out.println("Valor: "+ drink.getPrice());
        System.out.println("---------------");
    }
    public static void main(String[] args) {

        order("Expresso", new Expresso());
        order("Tea", new Tea());
        order("Longo", new DoubleDrink(new Expresso()));
        order("Café com leite", new Milk(new Expresso()));
        order("Tea Inglês", new Milk(new Tea()));
        order("Tea Inglês", new DoubleDrink(new Milk(new Tea())));

    }
}