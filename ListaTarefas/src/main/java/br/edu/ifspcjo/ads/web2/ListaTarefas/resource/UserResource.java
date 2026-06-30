//* Cada usuário possui código, nome, e-mail, senha, telefone e ativo (manter estado ativo ou inativo). 
package br.edu.ifspcjo.ads.web2.ListaTarefas.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifspcjo.ads.web2.ListaTarefas.domain.model.User;
import br.edu.ifspcjo.ads.web2.ListaTarefas.repository.UserRepository;
import br.edu.ifspcjo.ads.web2.ListaTarefas.service.UserService;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserResource {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> list(){
		return userRepository.findAll();
	}
	
	// testar Postman
	// http://localhost:8080/users
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public User create(@Valid @RequestBody User user, HttpServletResponse response) {
		return userRepository.save(user);
	}
	

	// testar Postman
	// POST - http://localhost:8080/users
	// Body - raw - JSON
	/*
		{
    			"name": "Adriana Silva",
    			"email": "adrianasilva@ifsp.edu.br",
    			"password": "$2a$10$Ot4XGuyPP7r82nN3WXA0bOL1Qk9gShKDlVuPoyp89HoFnHcwO4Tji",
				"id": 3
    			"active": true
		}
	*/
	
	@PutMapping("/{id}")
	public ResponseEntity<User> update(@PathVariable Long id, @Valid @RequestBody User user) {
		User userSaved = userService.update(id, user);
		return ResponseEntity.ok(userSaved);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		Optional<User> user = userRepository.findById(id);
		if(user.isPresent()) {
			return ResponseEntity.ok(user.get());
		}
		return ResponseEntity.notFound().build();
	}
	

}