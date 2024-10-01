import builder.*;
import director.MealDirector;

public class Main {

    public static void order(String name, FastFoodMealBuilder builder){
        System.out.println("Recebendo order " + name);
        MealDirector director = new MealDirector(builder);
        director.constructCombo();
        System.out.println(director.getCombo());

        System.out.println("----------------------");
    }
    public static void main(String[] args) {

        order("Burguer", new Menu1Builder());
        order("Hamburguer Vegetariano", new Menu2Builder());
        order("Batata Fritas", new JustFriesBuilder());
        order("Ataque do coração", new FatMealBuilder());
    }
}