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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="trazas")
public class Trazas implements java.io.Serializable {

	private static final long serialVersionUID = 5123546095057251891L;
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idAccionEntidad", nullable = false)
	private AccionEntidad accionEntidad;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idTipoEntidad", nullable = false)
	private TipoEntidad tipoEntidad;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idusuario", nullable = false)
	private Usuarios usuario;
	private Integer idEntidad;
	@Column(insertable = false, updatable = false)	
	private LocalDateTime fecha;
	private String descripcion;
}
