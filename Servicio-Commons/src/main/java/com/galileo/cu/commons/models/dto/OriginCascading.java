package com.galileo.cu.commons.models.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class OriginCascading {
	public String origin;
	public Long idUnidad;
	public Long idOperacion;
	public Long idObjetivo;
}
