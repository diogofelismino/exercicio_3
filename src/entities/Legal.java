package entities;

public class Legal extends TaxPayer{
	
	private int employeeNumbers;
	
	public Legal() {
	}
	
	public Legal(String name, Double annualIncome, int employeeNumbers) {
		super(name, annualIncome);
		this.employeeNumbers = employeeNumbers;
	}

	public int getEmployeeNumbers() {
		return employeeNumbers;
	}

	public void setEmployeeNumbers(int employeeNumbers) {
		this.employeeNumbers = employeeNumbers;
	}

	@Override
	public Double tax() {
		double taxPaid = 0.0;
		if(employeeNumbers > 10) {
			taxPaid = getAnnualIncome() * 0.14;
		}else {
			taxPaid = getAnnualIncome() * 0.16;
		}
		return taxPaid;
	}
	

}
