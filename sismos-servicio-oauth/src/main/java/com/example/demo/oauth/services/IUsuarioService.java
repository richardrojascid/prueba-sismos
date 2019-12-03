package com.example.demo.oauth.services;

import com.example.demo.usuarios.models.entity.Usuario;


public interface IUsuarioService {

		public Usuario findByUsername(String username);

}
