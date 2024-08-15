package com.galileo.cu.commons.models;

import java.time.LocalDateTime;

// default package
// Generated 16 may. 2022 00:39:42 by Hibernate Tools 5.6.7.Final

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="historicoObjetivosBalizas")
public class HistoricoObjetivosBalizas implements java.io.Serializable {

	private static final long serialVersionUID = 3975384762328340456L;
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idBaliza", nullable = false)
	private Balizas baliza;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idObjetivo", nullable = false)
	private Objetivos objetivo;
	@Column(insertable = false,nullable = true)
	private LocalDateTime fecha;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idAccion", nullable = false)
	private AccionEntidad accion;
}
