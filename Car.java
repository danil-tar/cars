package Car;

public class Car {
	private Body body;
	private TypeEngine engine;
	private Boolean cond;
	
	public static final Car jeepGC = new Car(Body.SUV, TypeEngine.DIEZEL_2700,true);
	public static final Car vwGolf = new Car(Body.HATCHBACK, TypeEngine.BENZIN_1200,false);
	public static final Car hondaAccord = new Car(Body.SEDAN, TypeEngine.BENZIN_2000,true);


private Car(Body body, TypeEngine engine, Boolean cond){
	this.body = body;
	this.engine = engine;
	this.cond = cond;
	
}


public Body getBody() {
	return body;
}


public TypeEngine getEngine() {
	return engine;
}


public Boolean getCond() {
	return cond;
}


public static Car getJeepgc() {
	return jeepGC;
}


public static Car getVwgolf() {
	return vwGolf;
}


public static Car getHondaaccord() {
	return hondaAccord;
}
	
}
