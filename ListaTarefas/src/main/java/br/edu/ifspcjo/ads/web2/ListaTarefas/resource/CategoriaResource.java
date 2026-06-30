//* Cada categoria possui código e nome. 
package br.edu.ifspcjo.ads.web2.ListaTarefas.resource;

import java.util.List;
import java.util.Locale.Category;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifspcjo.ads.web2.ListaTarefas.domain.model.Categoria;
import br.edu.ifspcjo.ads.web2.ListaTarefas.domain.model.User;
import br.edu.ifspcjo.ads.web2.ListaTarefas.repository.CategoryRepository;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/category")
public class CategoriaResource {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@GetMapping	
	public List<Categoria>list() {
		return categoryRepository.findAll();
	}
	
	// testar Postman
	// http://localhost:8080/category
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Categoria create(@Valid @RequestBody Categoria categoria, HttpServletResponse response) {
		return categoryRepository.save(categoria);
	}
		
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> findById(@PathVariable Long id){
		Optional<Categoria> categoria = categoryRepository.findById(id);
		if(categoria.isPresent()) {
			return ResponseEntity.ok(categoria.get());
		}
		return ResponseEntity.notFound().build();
	}
	
	
	
}
