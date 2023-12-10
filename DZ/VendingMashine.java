package DZ;

import java.util.List;

public interface VendingMashine {
    public void initsDrink(List<Drink> drinkList);
    public Drink getDrink(String name, double volume);
} 
