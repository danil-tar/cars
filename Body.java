package Car;

public class Body {

	private String body;
	private int weight;
	private int tank;
		
	
	public static Body SEDAN = new Body("sedan", 1200, 60);
	public static Body HATCHBACK = new Body ("hatchback", 1400, 60);
	public static Body SUV = new Body ("SUV", 2100, 70);
	
		private Body(String body, int weight, int tank){
		this.body = body;
		this.weight = weight;
		this.tank = tank;
		
	}

		public String getBody() {
			return body;
		}

		public int getWeight() {
			return weight;
		}

		public int getTank() {
			return tank;
		}

		public static Body getSEDAN() {
			return SEDAN;
		}

		public static Body getHATCHBACK() {
			return HATCHBACK;
		}

		public static Body getSUV() {
			return SUV;
		}
			
		
	
	
}
