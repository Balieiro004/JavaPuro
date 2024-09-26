package builder;

public class Menu1Builder extends FastFoodMealBuilder{
    @Override
    public void buildDrink() {
        meal.setDrink("Coca");
    }

    @Override
    public void buildMain() {
        meal.setMain("Chesseburguer");
    }

    @Override
    public void buildSide() {
        meal.setSide("Batata");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Torta de maça");
    }

    @Override
    public void buildGift() {
        meal.setGift("Brinquedo dos vingadores");
    }
}
