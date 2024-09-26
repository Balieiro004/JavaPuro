package builder;

public class FatMealBuilder extends FastFoodMealBuilder{
    @Override
    public void buildDrink() {
        meal.setDrink("MilkShake");
    }

    @Override
    public void buildMain() {
        meal.setMain("Tripo cheddar bacon burguer");
    }

    @Override
    public void buildSide() {
        meal.setSide("Aneis de cebola");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Sorvete grande");
    }

    @Override
    public void buildGift() {
        meal.setGift("Passagem para o hospital");
    }
}
