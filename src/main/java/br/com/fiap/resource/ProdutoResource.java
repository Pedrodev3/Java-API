package br.com.fiap.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.fiap.dao.ProdutosDAO;
import br.com.fiap.resource.to.ProdutoTO;

@Path("/produtos")
public class ProdutoResource {
	
	ProdutosDAO pd = null;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProdutoTO> listar(){
		pd = new ProdutosDAO();
		return pd.select();
	}
	
	
	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String buscar() {
//		return "Ola Mundo!";
//	}
	
//	public static void main(String args[]) {
//		ProdutoResource pr = new ProdutoResource();
//		System.out.println(pr.buscar());
//	}
}
