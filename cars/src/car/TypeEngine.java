package car;

public class TypeEngine {

	private float volumeEngine;
	private String typeEngine;
	private float fuelConsumption_50InHoar;
	private float fuelConsumption_90InHoar;
	private float fuelConsumption_AverageInHoar;

	public static final TypeEngine BENZIN_1200 = new TypeEngine("Benzin 1200", 1200, 8.0f, 5.5f, 7.0f);
	public static final TypeEngine BENZIN_2000 = new TypeEngine("Benzin 2000", 2000, 10.0f, 6.0f, 8.0f);
	public static final TypeEngine DIEZEL_2700 = new TypeEngine("Diezel 2700", 2700, 12.0f, 8.0f, 10.0f);


    private TypeEngine(String typeEngine,
                       float volumeEngine,
                       float fuelConsumption_50InHoar,
                       float fuelConsumption_90InHoar,
                       float fuelConsumption_AverageInHoar) {

        this.typeEngine = typeEngine;
        this.volumeEngine = volumeEngine;
        this.fuelConsumption_50InHoar = fuelConsumption_50InHoar;
        this.fuelConsumption_90InHoar = fuelConsumption_90InHoar;
        this.fuelConsumption_AverageInHoar = fuelConsumption_AverageInHoar;

    }

    public float getVolumeEngine() {
        return volumeEngine;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public float getFuelConsumption_50InHoar() {
        return fuelConsumption_50InHoar;
    }

    public float getFuelConsumption_90InHoar() {
        return fuelConsumption_90InHoar;
    }

    public float getFuelConsumption_AverageInHoar() {
        return fuelConsumption_AverageInHoar;
    }
}
