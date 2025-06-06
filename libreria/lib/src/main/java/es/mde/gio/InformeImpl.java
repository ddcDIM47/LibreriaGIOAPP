package es.mde.gio;

import java.time.Instant;

public class InformeImpl implements Informe{ 
  
  private String nombre;
  private PacienteImpl paciente;
  private String texto;
  private Instant fechaConsulta;
  
   public InformeImpl(String nombre, PacienteImpl paciente, String texto) {
	super();
	this.nombre = nombre;
	this.paciente = paciente;
	this.texto = texto;
	this.setFechaConsulta();
}



   public InformeImpl () {
    super();
    this.setFechaConsulta();
  }

  @Override
  public String getNombre() {
    return nombre;
  }
  @Override
  public void setNombre(String nombreString) {
    this.nombre = nombreString;
  }
  @Override
  public PacienteImpl getPaciente() {
    return paciente;
  }
  @Override
  public void setPaciente(PacienteImpl paciente) {
    this.paciente = paciente;
  }
  @Override
  public String getTexto() {
    return texto;
  }
  @Override
  public void setTexto(String textoString) {
    System.err.println(textoString);
    this.texto = textoString;
  }
  @Override
  public Instant getFechaConsulta() {
    return fechaConsulta;
  }
  @Override
  public void setFechaConsulta() {
    this.fechaConsulta = Instant.now();
  }
  
}
