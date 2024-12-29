import java.util.List;

public class Loja {

	private List<Produto> produtos;
	private List<Funcionario> funcionarios;
	
	public Loja() {
	}
	
	public Loja(List<Produto> produtos, List<Funcionario> funcionarios) {
		this.produtos = produtos;
		this.funcionarios = funcionarios;
	}
	
	public void addProduct(Produto produto) {
		produtos.add(produto);
	}
	
	public void removeProduct(Produto produto) {
		produtos.remove(produto);
	}
	
	public void addFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
		
	public void removeFuncionario(Funcionario funcionario) {
		funcionarios.remove(funcionario);
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	@Override
	public String toString() {
		return "Funcionários: %s%nProdutos: %s".formatted(funcionarios.toString(), produtos.toString());
	}
				
}
