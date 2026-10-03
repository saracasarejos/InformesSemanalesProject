package informe;

import java.util.List;

public class Informe {
	
	//Atributos
	private String nombre;
	private String tipo;
	private int numHojas;
	private List<Expediente> expedientes;
	
	public Informe (String nombre, String tipo, int numHojas,List<Expediente> expedientes) {
		this.nombre=nombre;
		this.tipo=tipo;
		this.numHojas=numHojas;
		this.expedientes=expedientes;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void SetNombre (String nombre) {
		this.nombre=nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public int getNumHojas() {
		return numHojas;
	}
	public List<Expediente> getExpedientes() {
		return expedientes;
	}
	
	}


