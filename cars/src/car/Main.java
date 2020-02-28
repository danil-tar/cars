package car;

public class Main {
	
public static void main(String[] args){
	
	int way = 1500;
	double balanceInTank = 50;
	
	Car car1 =  Car.jeepGC;
	int tank = car1.getBody().getTank();
	float fuelConsumption_averageInHoar = car1.getEngine().getFuelConsumption_AverageInHoar();
	float fuelOnWay = way / fuelConsumption_averageInHoar;
		
	//Fuel in tank - ok?
	
	if (fuelOnWay > balanceInTank){
		double i = (fuelOnWay - balanceInTank)/tank;
		System.out.printf("При расходе %.2f  на путь в %d км \n" +
				"Нужна заправка %.2f бака при остатке в баке %.2f \n" , fuelConsumption_averageInHoar, way, i, balanceInTank );
	}else{
		System.out.println("так доедем туда)");
	}
	
} 
}
