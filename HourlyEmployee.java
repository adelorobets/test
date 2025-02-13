
public class HourlyEmployee extends Employee {

	private double payRate;
	private int haursWorked;

	public HourlyEmployee() {
	}

	public HourlyEmployee(String name, String jobTitle, double payRate, int haursWorked) {
		super(name, jobTitle);
		this.payRate = payRate;
		this.haursWorked = haursWorked;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		if (payRate > 0)
			this.payRate = payRate;
	}

	public int getHaursWorked() {
		return haursWorked;
	}

	public void setHaursWorked(int haursWorked) {
		if (haursWorked >= 0)
			this.haursWorked = haursWorked;
	}

	@Override
	public double calculatePay() {
		double salary = haursWorked * payRate;
		return salary;
	}

	@Override
	public String toString() {
		return calculatePay() + " nis per Month";
	}

}
