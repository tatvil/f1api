package es.tatvil.formula1.dto;

public class PilotoDTO {

    private Integer numero;
    private String codigo;
    private String nombre;
    private String apellido;
    private String escuderia;
    private String nacionalidad;

    public PilotoDTO(Integer numero, String codigo, String nombre,
                     String apellido, String escuderia, String nacionalidad) {
        this.numero = numero;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.escuderia = escuderia;
        this.nacionalidad = nacionalidad;
    }

    public Integer getNumero() { return numero; }
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getEscuderia() { return escuderia; }
    public String getNacionalidad() { return nacionalidad; }
}