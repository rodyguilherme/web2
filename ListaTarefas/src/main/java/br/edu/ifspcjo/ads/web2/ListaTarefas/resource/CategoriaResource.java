//* Cada categoria possui código e nome. 
package br.edu.ifspcjo.ads.web2.ListaTarefas.resource;

import java.util.Arrays;
import java.util.List;

import br.edu.ifspcjo.ads.web2.ListaTarefas.domain.model.Categoria;

public class CategoriaResource {
	
	public List<Categoria> listar(){
		var categoria1 = new Categoria();
		categoria1.setId(1L);
		categoria1.setName("Gestão de Anúncios");
		
		var categoria2 = new Categoria();
		categoria2.setId(1L);
		categoria2.setName("Fechamento");
		
		return Arrays.asList(categoria1, categoria2);
	}
}
