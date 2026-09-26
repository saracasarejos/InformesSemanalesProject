package informe;

import java.util.List;

public class Informe {
	
	//Atributos
	private String nombre;
	private String tipo;
	private int numHojas;
	
	
	public Informe (String nombre, String tipo, int numHojas) {
		this.nombre=nombre;
		this.tipo=tipo;
		this.numHojas=numHojas;
		
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
	}


