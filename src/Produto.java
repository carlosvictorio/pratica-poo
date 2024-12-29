
public class Produto {
	
	private String name;
	private Double price;
	private Integer quantity;
	
	public Produto() {
	}
	
	public Produto(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String showInformations() {
		return "Nome: %s%nPreço %.2f%nQuantidade: %d%n".formatted(name, price, quantity);
	}
	
	public String addDiscount(Double percent) {
		Double currentPrice = getPrice();
		Double discount = percent * getPrice() / 100;
		setPrice(currentPrice -= discount);
		return "Desconto de %.2f adicionado!%nPreço atualizado: %.2f".formatted(discount, currentPrice);
	}
	
	public void addQuantity(int quantidade) {
		int currentQuantity = getQuantity();
		setQuantity(currentQuantity + quantidade);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "%s".formatted(getName());
	}
}
