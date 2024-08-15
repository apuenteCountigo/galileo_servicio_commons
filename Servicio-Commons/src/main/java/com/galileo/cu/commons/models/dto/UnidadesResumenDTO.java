package com.galileo.cu.commons.models.dto;

import lombok.AllArgsConstructor;
import lombok.Value;

@AllArgsConstructor
@Value
public class UnidadesResumenDTO {
	long cantidadOperaciones;
	long cantidadObjetivos;
	long cantidadUsuarios;
	long cantidadBalizasStock;
}
