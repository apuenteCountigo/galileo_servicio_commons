package com.galileo.cu.commons.models;

// default package
// Generated 16 may. 2022 00:39:42 by Hibernate Tools 5.6.7.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="tipoEntidad")
public class TipoEntidad implements java.io.Serializable {

	private static final long serialVersionUID = -2376368141875017869L;
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String descripcion;
	/*@ElementCollection
	private Set<Estados> estadoses = new HashSet<Estados>(0);
	@ElementCollection
	private Set<Trazas> trazases = new HashSet<Trazas>(0);*/
}
