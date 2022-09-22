package br.com.fiap.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.resource.to.ProdutoTO;

public class ProdutosDAO {

	// CRIAR CLASSE ESTATICA PARA SIMULAR UM BANCO DE DADOS
	public static List<ProdutoTO> listaProduto;

	public ProdutosDAO() {
		if (listaProduto == null) {
			// INICIALIZAR A LISTA COM UM ARRAY LIST
			listaProduto = new ArrayList<ProdutoTO>();

			ProdutoTO pto = new ProdutoTO();
			pto.setCodigo(1);
			pto.setPreco(37.99);
			pto.setQuantidade(22);
			pto.setTitulo("Grampeador");
			// ADICIONANDO NA LISTA UM PRODUTO
			listaProduto.add(pto);

			// Criar uma nova instancia do produto
			pto = new ProdutoTO();
			pto.setCodigo(2);
			pto.setPreco(45.44);
			pto.setQuantidade(55);
			pto.setTitulo("Mesa");
			// ADICIONANDO NA LISTA UM PRODUTO
			listaProduto.add(pto);

			// Criar uma nova instancia do produto
			pto = new ProdutoTO();
			pto.setCodigo(3);
			pto.setPreco(10.50);
			pto.setQuantidade(10);
			pto.setTitulo("Fone");
			// ADICIONANDO NA LISTA UM PRODUTO
			listaProduto.add(pto);

			// Criar uma nova instancia do produto
			pto = new ProdutoTO();
			pto.setCodigo(4);
			pto.setPreco(60.99);
			pto.setQuantidade(1);
			pto.setTitulo("Teclado");
			// ADICIONANDO NA LISTA UM PRODUTO
			listaProduto.add(pto);
		}

	}

	// METODO QUE RETORNA A LISTA DE PRODUTOS
	public List<ProdutoTO> select() {
		return listaProduto;
	}

}
