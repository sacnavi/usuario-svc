package com.sacnavi.diplomado.usuario.dto;

import com.sacnavi.diplomado.usuario.domain.Domicilio;
import com.sacnavi.diplomado.usuario.domain.Usuario;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RegistroUsuarioRequest {
	
	private Usuario usuario;
	private Domicilio domicilio;

}