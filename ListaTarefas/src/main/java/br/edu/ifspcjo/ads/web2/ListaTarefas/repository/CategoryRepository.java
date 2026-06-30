package br.edu.ifspcjo.ads.web2.ListaTarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifspcjo.ads.web2.ListaTarefas.domain.model.Categoria;

public interface CategoryRepository extends JpaRepository<Categoria, Long>{

}