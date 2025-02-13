
public class MainEmployee {

	public static void main(String[] args) {

		HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Alex", "driver", 60, 176);
		System.out.println("hourlySalary: " + hourlyEmployee1.getName() + " / " 
		                                    + hourlyEmployee1.getJobTitle() + " - " 
				                            + hourlyEmployee1);

		SalaryEmployee salaryEmployee1 = new SalaryEmployee("Max", "QA Tester", 18000, 0);
		System.out.println("weeklySalary: " + salaryEmployee1.getName() + " / " 
		                                    + salaryEmployee1.getJobTitle() + " - " 
		                                    + salaryEmployee1);
	}

}
