package es.tatvil.formula1.entity;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "piloto_escuderia",
       uniqueConstraints = {@UniqueConstraint(columnNames = {"piloto_id", "temporada_id"})})
public class PilotoEscuderia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "piloto_id", nullable = false)
    private Piloto piloto;

    @ManyToOne
    @JoinColumn(name = "escuderia_id", nullable = false)
    private Escuderia escuderia;

    @ManyToOne
    @JoinColumn(name = "temporada_id", nullable = false)
    private Temporada temporada;

    
    
	@Override
	public String toString() {
		return "PilotoEscuderia [id=" + id + ", piloto=" + piloto + ", escuderia=" + escuderia + ", temporada="
				+ temporada + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(escuderia, id, piloto, temporada);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PilotoEscuderia other = (PilotoEscuderia) obj;
		return Objects.equals(escuderia, other.escuderia) && Objects.equals(id, other.id)
				&& Objects.equals(piloto, other.piloto) && Objects.equals(temporada, other.temporada);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public Escuderia getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(Escuderia escuderia) {
		this.escuderia = escuderia;
	}

	public Temporada getTemporada() {
		return temporada;
	}

	public void setTemporada(Temporada temporada) {
		this.temporada = temporada;
	}

    
}