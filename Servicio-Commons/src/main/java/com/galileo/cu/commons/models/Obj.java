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
import javax.persistence.OneToOne;
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
@Table(name = "objetivos")
public class Obj implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5467511593508419910L;
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@OneToOne(fetch = FetchType.EAGER)	
	@JoinColumn(name = "idBaliza", nullable = true)
	private Balizas balizas;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idJuzgado", nullable = false)
	private Juzgados juzgados;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idOperacion", nullable = false)
	private Operaciones operaciones;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "responsable", nullable = false)
	private Usuarios usuarios;
	private String descripcion;
	private String urgencia;
	private String telContactos;
	private String diligencias;
	private String equipo;
	private Date fechaInicio;
	private Date finalAuto;
	private Date finalBateria;
	private String emailIncidenciaJud;
	private String emailIncidencias;
	private String telefonos;
	private String docSolicitud;
	private String observaciones;
	private Long traccarID;
	@Column(insertable = false, updatable = false)	
	private LocalDateTime  fechaCreacion;
	@Transient
	private Conexiones servidor;
}
