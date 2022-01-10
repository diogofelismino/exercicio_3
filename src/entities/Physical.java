package entities;

public class Physical extends TaxPayer {
	
	private Double healthExpense;
	
	public Physical() {
	}
	
	public Physical(String name, Double annualIncome, Double healthExpense) {
		super(name, annualIncome);
		this.healthExpense = healthExpense;
	}

	public Double getHealthExpense() {
		return healthExpense;
	}

	public void setHealthExpense(Double healthExpense) {
		this.healthExpense = healthExpense;
	}

	@Override
	public Double tax() {
		Double taxPaid = 0.0;
		if(getAnnualIncome() > 20000.00) {
			taxPaid = (getAnnualIncome() * 0.25) - (healthExpense * 0.5);
		}else {
			taxPaid = (getAnnualIncome() * 0.15) - (healthExpense * 0.5);
		}
		
		return taxPaid;
	}
	
	
	
}
