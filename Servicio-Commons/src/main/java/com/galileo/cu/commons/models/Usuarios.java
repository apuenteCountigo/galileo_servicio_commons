package com.galileo.cu.commons.models;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenerationTime;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "usuarios")
// @JsonIgnoreProperties ( value ={ "password" }, allowSetters = true )
public class Usuarios implements java.io.Serializable {

	private static final long serialVersionUID = -7872404495014646051L;
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idEmpleo", nullable = false)
	private Empleos empleos;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idUnidad", nullable = true)
	private Unidades unidad;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "estado", nullable = false)
	private Estados estados;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idPerfil", nullable = false)
	private Perfiles perfil;
	private String tip;
	private String nombre;
	private String apellidos;
	private String contacto;
	private String email;
	private String password;
	private String certificado;
	private String observaciones;
	private String traccar;
	private Long traccarID;

	@Column(insertable = false, updatable = false)
	private LocalDateTime fechaCreacion;
	// private LocalDateTime fechaCreacion;
	/*
	 * @PrePersist
	 * private void onCreate() {
	 * fechaCreacion=LocalDateTime.now();
	 * }
	 */

}
