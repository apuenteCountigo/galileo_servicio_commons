package com.galileo.cu.commons.models;

import java.time.LocalDateTime;

// default package
// Generated 16 may. 2022 00:39:42 by Hibernate Tools 5.6.7.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "balizas")
public class Balizas implements java.io.Serializable {

	private static final long serialVersionUID = -5191902421603215880L;
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	@ManyToOne
	@JoinColumn(name = "idEstadoBaliza", nullable = false)
	private Estados estados;
	@ManyToOne
	@JoinColumn(name = "idTipoBaliza", nullable = true)
	private TipoBaliza tipoBaliza;
	@ManyToOne
	@JoinColumn(name = "modelo", nullable = true)
	private ModelosBalizas modelo;
	@ManyToOne
	@JoinColumn(name = "idTipoContrato", nullable = true)
	private TipoContrato tipoContrato;
	@ManyToOne
	@JoinColumn(name = "idUnidad", nullable = true)
	private Unidades unidades;
	@Column(unique = true)
	private String clave;
	private String marca;
	private String numSerie;
	private String tipoCoordenada;
	private String imei;
	private String telefono1;
	private String compania;
	private String pin1;
	private String pin2;
	private String puk;
	private String iccTarjeta;
	private LocalDateTime fechaAlta;
	private LocalDateTime fechaAsignaUni;
	private LocalDateTime fechaAsignaOp;
	private String idDataminer;
	private String idElement;
	private String puerto;
	private String notas;
	@ManyToOne
	@JoinColumn(name = "idConexion")
	private Conexiones servidor;

	@Column(nullable = true)
	private String operacion;

	@Column(nullable = true)
	private String objetivo;

	@PrePersist
	private void onCreate() {
		fechaAlta = LocalDateTime.now();
	}
}