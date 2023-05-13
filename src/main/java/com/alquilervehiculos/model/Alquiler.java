package com.alquilervehiculos.model;

import java.time.LocalDateTime;
import java.util.Base64;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "alquiler")
public class Alquiler {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombres;
	private String apellidos;
	private Integer dni;
	private String email;
	private String pais;
	private String departamento;
	private String direccion;
	private String distrito;
	private String telefono1;
	private String telefono2;
	private Date fechasolicitud;
	private Date fechainicio;
	private Date fechafin;
	private String lugarrecojo;
	private String lugardevolucion;
	private String comentarios;
	private String preciofinal;
	private Integer diasalquiler;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "idvehiculo")
	private Vehiculo vehiculo;
	
}
