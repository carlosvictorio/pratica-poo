import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import enums.EnumSexo;

public class Main {

	public static void main(String[] args) {

		Produto ps5 = new Produto("Playstation 5", 4000.0, 1);
		Produto xboxSX = new Produto("Xbox Series X", 3500.0, 1);
		Produto xboxSS = new Produto("Xbox Series S", 2500.0, 1);
		
		List<Produto> produtosProntos = new ArrayList<>();
		produtosProntos.addAll(Arrays.asList(ps5, xboxSX, xboxSS));
		
		Funcionario gerente = new Gerente("Jorge", 2400.0, 10.0, 10000.0);
		Funcionario vendedor1 = new Vendedor("Paula", 1412.0, 1000.0, 900.0, EnumSexo.FEMININO);
		Funcionario vendedor2 = new Vendedor("Gildo", 1412.0, 1000.0, 1200.0, EnumSexo.MASCULINO);
		
		List<Funcionario> funcionarios = new ArrayList<>();
		funcionarios.addAll(Arrays.asList(gerente, vendedor1, vendedor2));
		
		Loja gamesStore = new Loja(produtosProntos, funcionarios);
		System.out.println(gamesStore.toString());
	}

}
