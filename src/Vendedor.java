import enums.EnumSexo;

public class Vendedor extends Funcionario{
	
	private Double metaDeVendas;
	private Double vendasRealizadas;
	private EnumSexo sexo;
	
	public Vendedor(String name, Double salary, Double metaDeVendas, Double vendasRealizadas, EnumSexo sexo) {
		super(name, salary);
		this.metaDeVendas = metaDeVendas;
		this.vendasRealizadas = vendasRealizadas;
		this.sexo = sexo;
	}
	
	@Override
	public void increaseSalary(double percent) {
		Double currentSalary = getSalary();
		Double increase = percent * currentSalary / 100;
		
		setSalary(currentSalary + increase);
	}
	
	public Double salarioAPagar() {
		
		Double currentSalary = getSalary();
		
		if(vendasRealizadas == metaDeVendas) {
			Double comissao = 5 * getVendasRealizadas() / 100;
			return currentSalary + comissao;
		} else if (vendasRealizadas > metaDeVendas) {
			Double vendasAcimaDaMeta = getVendasRealizadas() - getMetaDeVendas();
			Double bonus = 5 * getVendasRealizadas() / 100;
			Double porcentagemDeBonusAcimaDaMeta = 2 * vendasAcimaDaMeta / 100;
			Double comissao = bonus + porcentagemDeBonusAcimaDaMeta;
			
			return currentSalary + comissao;
		} else {
			return currentSalary;
		}
	}
	
	public void realizarVenda(Double productPrice) {
		Double vendasAtuais = getVendasRealizadas();
		setVendasRealizadas(vendasAtuais + productPrice);
	}

	public Double getMetaDeVendas() {
		return metaDeVendas;
	}

	public void setMetaDeVendas(Double metaDeVendas) {
		this.metaDeVendas = metaDeVendas;
	}

	public Double getVendasRealizadas() {
		return vendasRealizadas;
	}

	public void setVendasRealizadas(Double vendasRealizadas) {
		this.vendasRealizadas = vendasRealizadas;
	}
	
	@Override
	public String toString() {
		
		String sexoValue = sexo.getValor();
		
		if(sexoValue.equals("masculino")) {
			return "%s - Vendedor".formatted(getName());
		} else {
			return "%s - Vendedora".formatted(getName());
		}
		
	}
}
