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
import javax.persistence.PrePersist;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="unidadesUsuarios")
public class UnidadesUsuarios implements java.io.Serializable  {
	
	private static final long serialVersionUID = -8995511000546319094L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idunidad", nullable = false)	
	private Unidades unidad;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idusuario", nullable = false)	
	private Usuarios usuario;
	@Column(nullable=true)
	private LocalDateTime expira;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "estado", nullable = false)
	private Estados estado;
	@Column(insertable = false, updatable = false)	
	private LocalDateTime  fechaCreacion;
	
	@PrePersist
	private void onCreate() {		
		fechaCreacion=LocalDateTime.now();
	}
}
