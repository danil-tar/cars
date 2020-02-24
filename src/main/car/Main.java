package car;

public class Main {
	
public static void main(String[] args){
	Car car1 =  Car.jeepGC;
	int tank = car1.getBody().getTank();
	float fuelConsumption_averageInHoar = car1.getEngine().getFuelConsumption_AverageInHoar();
	System.out.println(tank);
	System.out.println(car1);
	
} 
}
