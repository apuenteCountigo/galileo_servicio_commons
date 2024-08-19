package com.galileo.cu.commons.models.dto;

import com.galileo.cu.commons.models.Perfiles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Value;

@Value
@Data
@Getter
@Setter
@AllArgsConstructor
public class JwtObjectMap {
	private Perfiles perfil;
	private String user_name;
	private String nombre;
	private String[] authorities;
	private String client_id;
	private boolean nuevo;
	private String[] scope;
	private String apellido;
	private String correo;
	private String tip;
	private String Id;
	private String exp;
	private String jti;
}
