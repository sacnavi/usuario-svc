package com.sacnavi.diplomado.usuario.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sacnavi.diplomado.usuario.domain.Usuario;
import com.sacnavi.diplomado.usuario.dto.RegistroUsuarioRequest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RequestMapping(path="api/usuarios", produces="application/json")
@CrossOrigin(origins="*")
@Tag(name="usuario", description="API del Recurso Usuario")
public interface UsuarioApi {
	
	@Operation(summary = "Registrar Usuario")
	@ApiResponses(value = { 
	  @ApiResponse(responseCode = "201", 
		description = "Usuario Creado Exitosamente", 
	    content = { 
	    	@Content(mediaType="application/json", 
	    	schema = @Schema(implementation=Usuario.class)) }),
	  @ApiResponse(responseCode = "409", 
	  	description="Ya existe un usuario con el mail especificado", 
	    content = @Content) })
	@PostMapping(path="registro", consumes="application/json")
	@ResponseStatus(HttpStatus.CREATED)
	Usuario registrarUsuario(
		@RequestBody RegistroUsuarioRequest request);

}
