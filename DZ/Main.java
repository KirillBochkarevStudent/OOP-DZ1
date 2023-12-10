package DZ;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Drink> hotDrinks = new ArrayList<>();
        hotDrinks.add(new HotDrink("tea", 0.5, 60));
        hotDrinks.add(new HotDrink("latte", 0.7, 80));
        hotDrinks.add(new HotDrink("espresso", 0.2, 80));
        hotDrinks.add(new HotDrink("cappuchino", 0.5, 70));
        HotDrinkVendingMashine drink = new HotDrinkVendingMashine();
        drink.initsDrink(hotDrinks);
        System.out.println(drink.getDrink("tea", 0.5, 60));
    }
}
