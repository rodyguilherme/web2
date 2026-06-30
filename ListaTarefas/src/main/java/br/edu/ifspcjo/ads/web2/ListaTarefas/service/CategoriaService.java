package br.edu.ifspcjo.ads.web2.ListaTarefas.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.edu.ifspcjo.ads.web2.ListaTarefas.domain.model.Categoria;
import br.edu.ifspcjo.ads.web2.ListaTarefas.repository.CategoryRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaService categoriaService;
	
	public Categoria update(Long id, Categoria categoria) {
		Categoria categorySaved = categoryRepository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		BeanUtils.copyProperties(categoria, categorySaved, "id");
		return categoryRepository.save(categorySaved);
	}
	
}
