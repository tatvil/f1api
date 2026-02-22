package es.tatvil.formula1.entity;

import jakarta.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "circuitos")
public class Circuito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String ciudad;
    private String pais;
    private Double latitud;
    private Double longitud;
    private Integer altitud_metros;
    private Double longitud_km;
    private Integer vueltas;

    @OneToMany(mappedBy = "circuito")
    private List<Carrera> carreras;

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

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public Integer getAltitud_metros() {
		return altitud_metros;
	}

	public void setAltitud_metros(Integer altitud_metros) {
		this.altitud_metros = altitud_metros;
	}

	public Double getLongitud_km() {
		return longitud_km;
	}

	public void setLongitud_km(Double longitud_km) {
		this.longitud_km = longitud_km;
	}

	public Integer getVueltas() {
		return vueltas;
	}

	public void setVueltas(Integer vueltas) {
		this.vueltas = vueltas;
	}

	public List<Carrera> getCarreras() {
		return carreras;
	}

	public void setCarreras(List<Carrera> carreras) {
		this.carreras = carreras;
	}

	@Override
	public int hashCode() {
		return Objects.hash(altitud_metros, carreras, ciudad, id, latitud, longitud, longitud_km, nombre, pais,
				vueltas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circuito other = (Circuito) obj;
		return Objects.equals(altitud_metros, other.altitud_metros) && Objects.equals(carreras, other.carreras)
				&& Objects.equals(ciudad, other.ciudad) && Objects.equals(id, other.id)
				&& Objects.equals(latitud, other.latitud) && Objects.equals(longitud, other.longitud)
				&& Objects.equals(longitud_km, other.longitud_km) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(pais, other.pais) && Objects.equals(vueltas, other.vueltas);
	}

	@Override
	public String toString() {
		return "Circuito [id=" + id + ", nombre=" + nombre + ", ciudad=" + ciudad + ", pais=" + pais + ", latitud="
				+ latitud + ", longitud=" + longitud + ", altitud_metros=" + altitud_metros + ", longitud_km="
				+ longitud_km + ", vueltas=" + vueltas + ", carreras=" + carreras + "]";
	}

    
}