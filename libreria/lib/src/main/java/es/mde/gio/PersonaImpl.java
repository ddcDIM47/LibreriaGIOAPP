package es.mde.gio;

public class PersonaImpl implements Persona{
	
	private String nombre;
	private String pApellido;
	private String sApellido;
	
	public PersonaImpl() {
		super();
	}

	public PersonaImpl(String nombre, String pApellido, String sApellido) {
		super();
		this.nombre = nombre;
		this.pApellido = pApellido;
		this.sApellido = sApellido;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getpApellido() {
		return pApellido;
	}

	@Override
	public void setpApellido(String pApellido) {
		this.pApellido = pApellido;
	}

	@Override
	public String getsApellido() {
		return sApellido;
	}

	@Override
	public void setsApellido(String sApellido) {
		this.sApellido = sApellido;
	}
	
	
	
}
