
 abstract class Funcionario {
	
	private String name;
	private Double salary;
	
	public Funcionario() {
	}
	
	public Funcionario(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String showInformation() {
		return "Nome: %s%nSalary: %.2f".formatted(getName(), getSalary());
	}
	
	public void increaseSalary(double percent) {
		Double currentSalary = getSalary();
		Double increase = percent * currentSalary / 100;
		setSalary(currentSalary + increase);
	}
	
	public void decreaseSalary(double percent) {
		Double currentSalary = getSalary();
		Double decrease = percent * currentSalary / 100;
		setSalary(currentSalary - decrease);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
		
	@Override
	public String toString() {
		return "%s".formatted(name);
	}
}
