package es.tatvil.formula1.entity;

import jakarta.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "temporadas")
public class Temporada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer anio;

    @OneToMany(mappedBy = "temporada")
    private List<PilotoEscuderia> pilotoEscuderias;

    @OneToMany(mappedBy = "temporada")
    private List<Carrera> carreras;

	@Override
	public int hashCode() {
		return Objects.hash(anio, carreras, id, pilotoEscuderias);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Temporada other = (Temporada) obj;
		return Objects.equals(anio, other.anio) && Objects.equals(carreras, other.carreras)
				&& Objects.equals(id, other.id) && Objects.equals(pilotoEscuderias, other.pilotoEscuderias);
	}

	@Override
	public String toString() {
		return "Temporada [id=" + id + ", anio=" + anio + ", pilotoEscuderias=" + pilotoEscuderias + ", carreras="
				+ carreras + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public List<PilotoEscuderia> getPilotoEscuderias() {
		return pilotoEscuderias;
	}

	public void setPilotoEscuderias(List<PilotoEscuderia> pilotoEscuderias) {
		this.pilotoEscuderias = pilotoEscuderias;
	}

	public List<Carrera> getCarreras() {
		return carreras;
	}

	public void setCarreras(List<Carrera> carreras) {
		this.carreras = carreras;
	}

    
}