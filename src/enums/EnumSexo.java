package enums;

public enum EnumSexo {
	MASCULINO("masculino"),
	FEMININO("feminino");
		
	private String valor;
	
	EnumSexo(String valor) {
		this.valor = valor;
	}
	
	public String getValor() {
		return valor;
	}
}
