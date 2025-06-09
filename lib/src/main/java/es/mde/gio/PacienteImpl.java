package es.mde.gio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;



public class PacienteImpl extends PersonaImpl implements Paciente{


	private String sexo;
	private LocalDate ultimaVisita;
	private Boolean seleccionado;
	private Collection<Informe> informes = new ArrayList<>();
	
	public PacienteImpl() {
		super();
	}

	public PacienteImpl( String sexo, LocalDate ultimaVisita,
			Boolean seleccionado) {
		super();
		this.sexo = sexo;
		this.ultimaVisita = ultimaVisita;
		this.seleccionado = seleccionado;
	}

	@Override
	public String getSexo() {
		return sexo;
	}

	@Override
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public LocalDate getUltimaVisita() {
		return ultimaVisita;
	}

	@Override
	public void setUltimaVisita(LocalDate ultimaVisita) {
		this.ultimaVisita = ultimaVisita;
	}

	@Override
	public Boolean getSeleccionado() {
		return seleccionado;
	}

	@Override
	public void setSeleccionado(Boolean seleccionado) {
		this.seleccionado = seleccionado;
	}
	
	@Override
	public Collection<Informe> getInformes() {
	    return informes;
	}

	@Override
	public void setInformes(Collection<Informe> informes) {
	   this.informes = informes;
	}

	// Establece la relacion en los dos sentidos
	@Override
	public void addInforme(Informe informe) {
        getInformes().add(informe);
        informe.setPaciente(this);
    }

   
		
}
