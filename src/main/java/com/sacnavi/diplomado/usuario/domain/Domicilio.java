package com.sacnavi.diplomado.usuario.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Domicilio {
	private String calle;
	private String numExterior;
	private String numInterior;

}
