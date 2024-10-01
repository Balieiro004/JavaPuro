package builder;

public class Menu2Builder extends FastFoodMealBuilder{
    @Override
    public void buildDrink() {
        meal.setDrink("Agua");
    }

    @Override
    public void buildMain() {
        meal.setMain("Hambuguer vegetariano");
    }

    @Override
    public void buildSide() {
        meal.setSide("Salada");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Maça");
    }

    @Override
    public void buildGift() {
        meal.setGift("Adesivo vegetariano");
    }
}
