package es.mde.gio;

public class MedicoImpl extends PersonaImpl implements Medico{

	private String nColegiado;
	private String correoElectronico;
	
	public MedicoImpl() {
		super();
	}

	public MedicoImpl(String nColegiado, String correoElectronico) {
		super();
		this.nColegiado = nColegiado;
		this.correoElectronico = correoElectronico;
	}

	@Override
	public String getnColegiado() {
		return nColegiado;
	}
	
	@Override
	public void setnColegiado(String nColegiado) {
		this.nColegiado = nColegiado;
	}

	@Override
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	@Override
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	
}

