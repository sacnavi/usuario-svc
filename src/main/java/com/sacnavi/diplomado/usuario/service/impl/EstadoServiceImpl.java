package com.sacnavi.diplomado.usuario.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacnavi.diplomado.usuario.domain.Estado;
import com.sacnavi.diplomado.usuario.repository.EstadoRepository;
import com.sacnavi.diplomado.usuario.service.EstadoService;

@Service
public class EstadoServiceImpl implements EstadoService {
	
	@Autowired
	private EstadoRepository estadoRepository;

	@Override
	public Estado actualizarEstado(String id, Estado estado) {
		Optional<Estado> estadoExistente = estadoRepository.findById(id);
		if (estadoExistente.isPresent()) {
			Estado estadoActualizar = estadoExistente.get();
			estadoActualizar.setNombre(estado.getNombre());
			estadoRepository.save(estadoActualizar);
			return estadoActualizar;
		}
		return null;
	}

}