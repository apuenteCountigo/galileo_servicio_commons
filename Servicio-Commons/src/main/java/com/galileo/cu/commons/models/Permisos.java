package com.galileo.cu.commons.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;

@NoArgsConstructor
@Data
@Entity
@Table(name = "permisos")
public class Permisos {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long Id;
	//@Column(name = "idTipoEntidad")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idTipoEntidad", nullable = false)	
	private TipoEntidad tipoEntidad;
	
	private long idEntidad;
	//@JsonIgnoreProperties(value="unidadesusuarios")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idUsuario", nullable = false)		
	private Usuarios usuarios;
	private String permisos;
	@Column(insertable = false, updatable = false)	
	private LocalDateTime  fechaCreacion;
}
