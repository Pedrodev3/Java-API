package br.com.fiap.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class UsersResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String[][] getUsers() {
		String[][] info = new String[3][3];
		//Cabecalho
		info[0][0] = "NOME";
		info[0][1] = "CPF";
		info[0][2] = "EMAIL";
		
		//Linha 1
		info[1][0] = "Ale";
		info[1][1] = "12345678911";
		info[1][2] = "prof@sla";
		
		//Linha 2
		info[2][0] = "Lucas";
		info[2][1] = "647281919237";
		info[2][2] = "lucas@sla";
		
		return info;
	}
}
