package com.galileo.cu.commons.models;

// default package
// Generated 16 may. 2022 00:39:42 by Hibernate Tools 5.6.7.Final

import java.io.Serial;
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
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "operaciones")
public class Operaciones implements java.io.Serializable {

	@Serial
	private static final long serialVersionUID = -3788221366437113461L;
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idEstado", nullable = false)
	private Estados estados;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idJuzgado", nullable = false)
	private Juzgados juzgado;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idUnidad", nullable = false)
	private Unidades unidades;
	@Column(name = "nombre")
	private String descripcion;
	private Date fechaInicio;
	private Date fechaFin;
	private String idDataminer;
	private String idElement;
	private String observaciones;
	private String diligencias;
	@Column(insertable = false, updatable = false)	
	private LocalDateTime  fechaCreacion;
	private Long idGrupo;
	@Transient
	private Conexiones servidor;
}