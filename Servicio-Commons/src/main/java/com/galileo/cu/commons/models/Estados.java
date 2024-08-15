package com.galileo.cu.commons.models;

// default package
// Generated 16 may. 2022 00:39:42 by Hibernate Tools 5.6.7.Final

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
@Table(name="estados")
public class Estados implements java.io.Serializable {

	private static final long serialVersionUID = -7987773387791128625L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tipoEntidad_id", nullable = false)
	private TipoEntidad tipoEntidad;
	private String descripcion;
	/*@ElementCollection
	private Set<Operaciones> operacioneses = new HashSet<Operaciones>(0);
	@ElementCollection
	private Set<Usuarios> usuarioses = new HashSet<Usuarios>(0);
	@ElementCollection
	private Set<Balizas> balizases = new HashSet<Balizas>(0);*/
}
