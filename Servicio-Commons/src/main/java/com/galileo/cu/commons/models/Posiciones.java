package com.galileo.cu.commons.models;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "posiciones")
public class Posiciones implements java.io.Serializable {

	private static final long serialVersionUID = 8072699080334469730L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idBalizas", nullable = false)
	private Balizas balizas;
	private String clave;
	private String alias;
	private int idPosicion;
	private String fechaCaptacion;
	private String timestampServidor;
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
