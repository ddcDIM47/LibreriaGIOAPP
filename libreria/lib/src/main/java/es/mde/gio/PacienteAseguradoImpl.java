package es.mde.gio;


public class PacienteAseguradoImpl extends PacienteImpl implements PacienteAsegurado{

	
	private String numeroSeguro;
	private String nAseguradora;
	
	public PacienteAseguradoImpl() {
		super();
	}

	public PacienteAseguradoImpl(String numeroSeguro, String nAseguradora) {
		super();
		this.numeroSeguro = numeroSeguro;
		this.nAseguradora = nAseguradora;
	}

	@Override
	public String getNumeroSeguro() {
		return numeroSeguro;
	}

	@Override
	public void setNumeroSeguro(String numeroSeguro) {
		this.numeroSeguro = numeroSeguro;
	}

	@Override
	public String getnAseguradora() {
		return nAseguradora;
	}

	@Override
	public void setnAseguradora(String nAseguradora) {
		this.nAseguradora = nAseguradora;
	}
	
	
}
