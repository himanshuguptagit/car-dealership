package car_dealership;

public class Employee {
	
	private String name;
	private Designation designation;
	public Employee(String name, Designation designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Designation getDesignation() {
		return designation;
	}
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}
	
	
	public void handlePurchaseRequest(Customer c, Vehicle v, boolean finance) {
		System.out.println("Sure " + c.getName() + " , I will help you.");
		System.out.println("The car costs:  " + v.getPrice());
		
		if(finance == true) {
			boolean isCreditHistoryOk = runCreditHistory(c);
			
			if(isCreditHistoryOk == true) {
				System.out.println("Your Credit History looks good. I will process the transaction.");
				processTransaction(c, v);
			}else {
				System.out.println("Your credit history is bad. Get Out !");
			}
			
		}else if(c.getCash() >= v.getPrice()) {
			processTransaction(c, v);
		}else {
			System.out.println("Get out! You can not afford this car");
		}
	}
	
	private void processTransaction(Customer c, Vehicle v) {
		
		c.setCash(c.getCash() - v.getPrice());
		
		System.out.println("Thank you for purchasing " + v.getName());
	}
	
	private boolean runCreditHistory(Customer c) {
		System.out.println("Dear " + c.getName() + ", I need to run by your credit History ");
		return Math.random() < 0.5;
	}
	
	
}


