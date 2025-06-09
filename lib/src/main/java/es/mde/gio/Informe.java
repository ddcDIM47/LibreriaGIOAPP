package es.mde.gio;

import java.time.Instant;

public interface Informe {

	public String getNombre();
	public void setNombre(String nombreString);
	public PacienteImpl getPaciente();
	public void setPaciente(PacienteImpl paciente) ;
	public String getTexto() ;
	public void setTexto(String textoString);
	public Instant getFechaConsulta() ;
	public void setFechaConsulta() ;
	
}
