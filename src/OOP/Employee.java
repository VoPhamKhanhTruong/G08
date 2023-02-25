package OOP;

public class Employee {
	int id;
	String firstName;
	String lastName;
	int salary;
	
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	public String getFirstName() {
		return null;
	}
	
	public String getLastName() {
		return null;
	}
	
	public String getName() {
		return null;
	}
	
	public int getSalary() {
		return 0;
	}
	
	public int AnnualSalary() {
		return 0;
	}
	
	public int raiseSalary(int percent) {
		return 0;
	}

	@Override
	public String toString() {
		return "Employee []";
	}
}
