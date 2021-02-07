package com.desarrollo.dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sun.istack.internal.NotNull;

/**
 *
 * @author desarrollador
 */
@Entity
@Table(name = "PRUEBA")
public class PruebaDto implements Serializable {

	@Id
	@NotNull
	@SequenceGenerator(name = "SEQ_PRUEBA", sequenceName = "SEQ_PRUEBA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PRUEBA")
	@Column(name = "CODIGO")
	private Integer codigo;

	@Column(name = "DNI")
	private String dni;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "EDAD")
	private Integer edad;

	@Column(name = "FECHANACIMIENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechanacimiento;

	@Column(name = "SEXO")
	private String sexo;

	public PruebaDto() {
	}

	public PruebaDto(Integer codigo, String dni, String nombre, Integer edad, Date fechanacimiento, String sexo) {
		super();
		this.codigo = codigo;
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.fechanacimiento = fechanacimiento;
		this.sexo = sexo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Date getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
}
