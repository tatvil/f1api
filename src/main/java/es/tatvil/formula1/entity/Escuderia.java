package es.tatvil.formula1.entity;

import jakarta.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "escuderias")
public class Escuderia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String pais;
    private String motor;

    @OneToMany(mappedBy = "escuderia")
    private List<PilotoEscuderia> pilotoEscuderias;

	@Override
	public int hashCode() {
		return Objects.hash(id, motor, nombre, pais, pilotoEscuderias);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Escuderia other = (Escuderia) obj;
		return Objects.equals(id, other.id) && Objects.equals(motor, other.motor)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(pais, other.pais)
				&& Objects.equals(pilotoEscuderias, other.pilotoEscuderias);
	}

	@Override
	public String toString() {
		return "Escuderia [id=" + id + ", nombre=" + nombre + ", pais=" + pais + ", motor=" + motor
				+ ", pilotoEscuderias=" + pilotoEscuderias + "]";
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

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public List<PilotoEscuderia> getPilotoEscuderias() {
		return pilotoEscuderias;
	}

	public void setPilotoEscuderias(List<PilotoEscuderia> pilotoEscuderias) {
		this.pilotoEscuderias = pilotoEscuderias;
	}

}