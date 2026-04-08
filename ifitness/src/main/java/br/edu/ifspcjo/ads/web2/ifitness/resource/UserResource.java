package br.edu.ifspcjo.ads.web2.ifitness.resource;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifspcjo.ads.web2.ifitness.domain.model.User;

@RestController
public class UserResource {
	
	@GetMapping("/users")
	public List<User> list(){
		
		// declação de um objeto da classe User
		User user1 = new User();
		user1.setId(1L);
		user1.setName("Rodrigo da Silva");
		user1.setEmail("rg2588@outlook.com");
		user1.setPassword("1234");
		user1.setBirthDate(LocalDate.of(1988, 12, 1));
		user1.setActive(true);
		
		// declação de um segundo objeto da classe User
		User user2 = new User();
		user2.setId(1L);
		user2.setName("Guilherme Andrade");
		user2.setEmail("rody.guilherme@gmail.com");
		user2.setPassword("5678");
		user2.setBirthDate(LocalDate.of(1998, 5, 15));
		user2.setActive(true);
		
		return Arrays.asList(user1, user2);
				
	}
	
}
