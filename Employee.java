public abstract class Employee {

	private String name;
	private String jobTitle;

	public Employee() {

	}

	public Employee(String name, String jobTitle) {
		super();
		this.name = name;
		this.jobTitle = jobTitle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null)
			this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		if (jobTitle != null)
			this.jobTitle = jobTitle;
	}

	public abstract double calculatePay();

}
