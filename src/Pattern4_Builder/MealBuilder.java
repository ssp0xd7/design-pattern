package Pattern4_Builder;

/**
 * 点餐类
 *
 * @author kevin(ssp0xd7 @ gmail.com) 27/02/2018
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();

        Meal meal = builder.prepareVegMeal();
        meal.showItems();
    }
}
