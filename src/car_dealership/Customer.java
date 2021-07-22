package car_dealership;

public class Customer {

	private String name;
	private double cash;
	
	
	Customer(String name, double cash){
		this.name = name;
		this.cash = cash;
	}
	
	public void purchaseCar(Vehicle v, Employee e, boolean finance) {
		
		System.out.println("Hey "+ e.getName() + ", I want to purchase "
		+ v.getName() + " I have " + this.getCash() + "; finance: " + finance);
	}
	
	
	public double getCash() {
		return cash;
	}
	public void setCash(double cash) {
		this.cash = cash;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
