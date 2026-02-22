package es.tatvil.formula1.entity;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "resultados",
       uniqueConstraints = {@UniqueConstraint(columnNames = {"carrera_id","piloto_id"})})
public class Resultado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "carrera_id", nullable = false)
    private Carrera carrera;

    @ManyToOne
    @JoinColumn(name = "piloto_id", nullable = false)
    private Piloto piloto;

    private Integer posicion;
    private Double puntos;
    private String tiempo;
    private Boolean abandono = false;
    private Boolean vuelta_rapida = false;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Carrera getCarrera() {
		return carrera;
	}
	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	public Piloto getPiloto() {
		return piloto;
	}
	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	public Integer getPosicion() {
		return posicion;
	}
	public void setPosicion(Integer posicion) {
		this.posicion = posicion;
	}
	public Double getPuntos() {
		return puntos;
	}
	public void setPuntos(Double puntos) {
		this.puntos = puntos;
	}
	public String getTiempo() {
		return tiempo;
	}
	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}
	public Boolean getAbandono() {
		return abandono;
	}
	public void setAbandono(Boolean abandono) {
		this.abandono = abandono;
	}
	public Boolean getVuelta_rapida() {
		return vuelta_rapida;
	}
	public void setVuelta_rapida(Boolean vuelta_rapida) {
		this.vuelta_rapida = vuelta_rapida;
	}
	@Override
	public int hashCode() {
		return Objects.hash(abandono, carrera, id, piloto, posicion, puntos, tiempo, vuelta_rapida);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resultado other = (Resultado) obj;
		return Objects.equals(abandono, other.abandono) && Objects.equals(carrera, other.carrera)
				&& Objects.equals(id, other.id) && Objects.equals(piloto, other.piloto)
				&& Objects.equals(posicion, other.posicion) && Objects.equals(puntos, other.puntos)
				&& Objects.equals(tiempo, other.tiempo) && Objects.equals(vuelta_rapida, other.vuelta_rapida);
	}
	@Override
	public String toString() {
		return "Resultado [id=" + id + ", carrera=" + carrera + ", piloto=" + piloto + ", posicion=" + posicion
				+ ", puntos=" + puntos + ", tiempo=" + tiempo + ", abandono=" + abandono + ", vuelta_rapida="
				+ vuelta_rapida + "]";
	}

    
}