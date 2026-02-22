package es.tatvil.formula1.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "carreras")
public class Carrera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "temporada_id", nullable = false)
    private Temporada temporada;

    @ManyToOne
    @JoinColumn(name = "circuito_id", nullable = false)
    private Circuito circuito;

    private String nombre_gp;
    private LocalDate fecha;

    @Enumerated(EnumType.STRING)
    private TipoCarrera tipo = TipoCarrera.normal;

    @OneToMany(mappedBy = "carrera")
    private List<Resultado> resultados;

    public enum TipoCarrera {
        normal,
        sprint
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Temporada getTemporada() {
		return temporada;
	}

	public void setTemporada(Temporada temporada) {
		this.temporada = temporada;
	}

	public Circuito getCircuito() {
		return circuito;
	}

	public void setCircuito(Circuito circuito) {
		this.circuito = circuito;
	}

	public String getNombre_gp() {
		return nombre_gp;
	}

	public void setNombre_gp(String nombre_gp) {
		this.nombre_gp = nombre_gp;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public TipoCarrera getTipo() {
		return tipo;
	}

	public void setTipo(TipoCarrera tipo) {
		this.tipo = tipo;
	}

	public List<Resultado> getResultados() {
		return resultados;
	}

	public void setResultados(List<Resultado> resultados) {
		this.resultados = resultados;
	}

	@Override
	public int hashCode() {
		return Objects.hash(circuito, fecha, id, nombre_gp, resultados, temporada, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carrera other = (Carrera) obj;
		return Objects.equals(circuito, other.circuito) && Objects.equals(fecha, other.fecha)
				&& Objects.equals(id, other.id) && Objects.equals(nombre_gp, other.nombre_gp)
				&& Objects.equals(resultados, other.resultados) && Objects.equals(temporada, other.temporada)
				&& tipo == other.tipo;
	}

	@Override
	public String toString() {
		return "Carrera [id=" + id + ", temporada=" + temporada + ", circuito=" + circuito + ", nombre_gp=" + nombre_gp
				+ ", fecha=" + fecha + ", tipo=" + tipo + ", resultados=" + resultados + "]";
	}

    
}