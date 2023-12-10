package DZ;

import java.util.ArrayList;
import java.util.List;

/**
 * BottleOfWatterVendingMashine
 */
public class HotDrinkVendingMashine implements VendingMashine {

    private List<Drink> hotDrinks = new ArrayList<>();
    @Override
    public void initsDrink(List<Drink> drinkList) {
        hotDrinks = drinkList;
    }

    public Drink getDrink(String name, double volume, double temrerature){
        for (Drink i : hotDrinks) {
            if (i.getName().equals(name) && volume == i.getVolume() && temrerature == i.getTemperature()){
                return i;
            }
        }
        return null;
    }

    @Override
    public Drink getDrink(String name, double volume) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDrink'");
    }

    
}