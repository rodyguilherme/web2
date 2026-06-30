package br.edu.ifspcjo.ads.web2.ListaTarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifspcjo.ads.web2.ListaTarefas.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}