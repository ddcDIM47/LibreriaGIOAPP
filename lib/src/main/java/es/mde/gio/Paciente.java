package es.mde.gio;

import java.time.LocalDate;
import java.util.Collection;

public interface Paciente {
	public String getSexo();
	public void setSexo(String sexo);
	public LocalDate getUltimaVisita();
	public void setUltimaVisita(LocalDate ultimaVisita);
	public Boolean getSeleccionado();
	public void setSeleccionado(Boolean seleccionado);
	public Collection<InformeImpl> getInformes();
	public void setInformes(Collection<InformeImpl> informes);
	
	// Establece la relacion en los dos sentidos
    public void addInforme(InformeImpl informe);
}
