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
		System.out.printf("��� ������� %.2f  �� ���� � %d �� \n" +
				"����� �������� %.2f ���� ��� ������� � ���� %.2f \n" , fuelConsumption_averageInHoar, way, i, balanceInTank );
	}else{
		System.out.println("��� ������ ����)");
	}
	
} 
}
