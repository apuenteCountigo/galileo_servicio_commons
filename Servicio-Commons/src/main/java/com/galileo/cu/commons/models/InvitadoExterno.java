package com.galileo.cu.commons.models;

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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="invitadoExterno")
public class InvitadoExterno implements java.io.Serializable {

	private static final long serialVersionUID = 3860880010220565849L;
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "usuarios_id", nullable = false)
	private Usuarios usuarios;
	private String entidad;
	private String organismo;
	private Date fechaExpiracion;
}
