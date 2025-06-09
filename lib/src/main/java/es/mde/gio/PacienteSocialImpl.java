package es.mde.gio;

public class PacienteSocialImpl extends PacienteImpl implements PacienteSocial{

	private String dni;
	
	public PacienteSocialImpl() {
		super();
	}
	
	public PacienteSocialImpl(String dniPaciente) {
		this.dni = dniPaciente;
	}
	
	@Override
	public String getDni() {
		return dni;
	}

	@Override
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
}
