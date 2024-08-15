package com.galileo.cu.commons.models;



import java.sql.Timestamp;
import java.time.LocalDateTime;

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
@Table(name = "unidades")
public class Unidades implements java.io.Serializable {

	private static final long serialVersionUID = 6828315366140961677L;
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idprovincia", nullable = true)
	private Provincias provincia;
	@Column(unique=true)
	private String denominacion;
	private String responsable;
	private String groupWise;
	private String telefono;
	private String email;
	private String direccion;
	private String codigoPostal;
	private String localidad;
	private String notas;
	@Column(insertable = false, updatable = false)	
	private LocalDateTime  fechaCreacion;
	//private LocalDateTime  fechaCreacion;
	/*@PrePersist
	private void onCreate() {		
		fechaCreacion=LocalDateTime.now();
	}*/
}