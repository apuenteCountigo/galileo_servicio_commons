package com.galileo.cu.commons.models.dto;

import java.time.LocalDateTime;
import java.util.Date;

import com.galileo.cu.commons.models.Balizas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Value;

@AllArgsConstructor
@Value
public class PosicionesDTO implements java.io.Serializable {
    private long Id;
    private int idBalizas;
	private String clave;
	private String alias;
	private int idPosicion;
	private String fechaCaptacion;
	private LocalDateTime timestampServidor;
	private double latitud;
	private double longitud;
	private float rumbo;
	private int velocidad;
	private float estadoBateria;
	private String evento;
	private int satelites;
	private String precision;
	private int senalGps;
	private int senalGsm;
	private int mmcBts;
	private int mncBts;
	private String lacBts;
	private String toponimia;
	private String notas;
}
