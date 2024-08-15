package com.galileo.cu.commons.models;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "usuariosProjection", types = Usuarios.class)
public interface UsuariosProjection {
	Long getId();	
	Estados getEstados();
	@Value("#{target.getNombre()+' '+ target.getApellidos()}")
	String getNombreCompleto();
	Empleos getEmpleos();
	Perfiles getPerfil();
	 String getTip();
	 String getNombre();
	 String getApellidos();
	 String getContacto();
	 String getEmail();	
	 String getPassword();
	 String getCertificado();
	 String getObservaciones();
	 String getTraccar();	
	 LocalDateTime getFechaCreacion();
}
