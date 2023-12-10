package DZ;

public class HotDrink extends Drink {
    private double temrerature;
    public HotDrink(String name, double volume, double temrerature) {
        super(name, volume);
        this.temrerature = temrerature;
    }
    public double getTemperature() {
        return temrerature;
    }

    public void setTemperature(double temrerature) {
        this.temrerature = temrerature;
    }
    
    @Override
    public String toString() {
        return "HotDrink{" + "name = " + super.getName() + ' ' + ", volume = " + super.getVolume() + ", temperature = " + temrerature + "}";
    }
}
