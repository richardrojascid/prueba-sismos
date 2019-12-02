package com.example.demo.usuarios.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.usuarios.models.entity.Usuario;

@RepositoryRestResource(path="usuarios")
public interface UsuarioDao extends PagingAndSortingRepository<Usuario,Long>{

	//Dos formas de implementar lo mismo 
	@RestResource(path="buscar-username")
	public Usuario findByUsername(String udername);

	@Query("select u from Usuario u where u.username=?1 and u.email=?2")
	public Usuario obtenerPorUsername(String username);
	
	
	
}
