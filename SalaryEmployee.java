
public class SalaryEmployee extends Employee {

	private double baseSalary;
	private double weeklySalary;

	public SalaryEmployee() {
	}

	public SalaryEmployee(String name, String jobTitle, double baseSalary, double weeklySalary) {
		super(name, jobTitle);
		this.baseSalary = baseSalary;
		this.weeklySalary = weeklySalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary > 0)
			this.baseSalary = baseSalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary >= 0)
			this.weeklySalary = weeklySalary;
	}

	@Override
	public double calculatePay() {
		int weekPerMonth = 4;
		double weeklySalary = baseSalary / weekPerMonth;
		return weeklySalary;
	}

	@Override
	public String toString() {
		return calculatePay() + " nis per Week";
	}

}
