package es.tatvil.formula1.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "pilotos")
public class Piloto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private LocalDate fecha_nacimiento;
    private String nacionalidad;
    private Integer numero;
    private String codigo;

    @OneToMany(mappedBy = "piloto")
    private List<PilotoEscuderia> pilotoEscuderias;

    @OneToMany(mappedBy = "piloto")
    private List<Resultado> resultados;

	@Override
	public int hashCode() {
		return Objects.hash(apellido, codigo, fecha_nacimiento, id, nacionalidad, nombre, numero);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piloto other = (Piloto) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(codigo, other.codigo)
				&& Objects.equals(fecha_nacimiento, other.fecha_nacimiento) && Objects.equals(id, other.id)
				&& Objects.equals(nacionalidad, other.nacionalidad) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(numero, other.numero);
	}
	
	@Override
	public String toString() {
		return "Piloto [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fecha_nacimiento="
				+ fecha_nacimiento + ", nacionalidad=" + nacionalidad + ", numero=" + numero + ", codigo=" + codigo
				+ "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

    
}