package car_dealership;

public class Dealership {

	public static void main(String args[]) {
		
		Vehicle tesla = new Vehicle("Tesla", 5000);
		Vehicle bmw = new Vehicle("BMW", 4000);
		
		Employee salesman = new Employee("Jane", Designation.Salesman);
		Employee manager = new Employee("Jon", Designation.Manager);
		
		Customer customer = new Customer("Himanshu", 5000);
		boolean isFinance = Math.random() < 0.5;
		customer.purchaseCar(bmw, salesman, isFinance);
		salesman.handlePurchaseRequest(customer, bmw, isFinance);
		
	}
}
