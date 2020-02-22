package car;

public class Fuel {

    public static final Fuel DIESEL = new Fuel("diesel", 15);
    public static final Fuel BENZIN_92 = new Fuel("benzin-92", 15);
    public static final Fuel BENZIN_95 = new Fuel("benzin-95", 16);

    private String fuel;
    private int price;

    private Fuel(String fuel, int price) {
        this.fuel = fuel;
        this.price = price;
    }


}
