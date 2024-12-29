
public class Gerente extends Funcionario {
	
	private Double sales;
	private Double salesBonus;

	public Gerente(String name, Double salary, Double salesBonus, Double sales) {
		super(name, salary);
		this.salesBonus = salesBonus;
		this.sales = sales;
	}
	
	@Override
	public void increaseSalary(double percent) {
		Double currentSalary = getSalary();
		Double increase = percent * currentSalary / 100;
		salesBonus = salesBonus * sales / 100;
		setSalary(currentSalary + increase + salesBonus);
	}
	
	public Double salaryToPay() {
		Double currentSalary = getSalary();
		salesBonus = 10 * sales / 100;
		return currentSalary + salesBonus;
	}
	
	@Override
	public String showInformation() {
		return "Nome: %s%nBônus de vendas: %.2f%nSalary: %.2f".formatted(getName(), getSalesBonus(), getSalary());
	}

	public Double getSalesBonus() {
		return salesBonus;
	}

	public void setSalesBonus(Double salesBonus) {
		this.salesBonus = salesBonus;
	}
	
	@Override
	public String toString() {
		return "%s - Gerente".formatted(getName());
	}
	
}
