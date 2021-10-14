package Familia36;

public abstract class Panimal {

	private String tipo;
	
	abstract public void som();
	
	public Panimal(String tipo)
	{
		this.tipo=tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
