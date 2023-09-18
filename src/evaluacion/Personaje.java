package evaluacion;

import java.util.Arrays;
import java.util.Objects;

public class Personaje {

	private String nombre;
	private int puntosVida, puntosConseguidos; // entero entre 0 y 100
	private int numeroElementos;
	private String[] mochila = new String[10];
	private int puntosFuerza;

	public Personaje(String nombre, int puntosVida, int puntosConseguidos, int numeroElementos, String[] mochila,
			int puntosFuerza) {
		super();
		this.nombre = nombre;
		this.puntosVida = puntosVida;
		this.puntosConseguidos = puntosConseguidos;
		this.numeroElementos = numeroElementos;
		this.mochila = mochila;
		this.puntosFuerza = puntosFuerza;
	}


	public Personaje(String nombre) {

		this.nombre = nombre;

	}

	public Personaje() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	public int getPuntosConseguidos() {
		return puntosConseguidos;
	}

	public void setPuntosConseguidos(int puntosConseguidos) {
		this.puntosConseguidos = puntosConseguidos;
	}

	public String[] getMochila() {
		return mochila;
	}

	public int getNumeroElementos() {
		return numeroElementos;
	}
	
	public int getPuntosFuerza() {
		return puntosFuerza;
	}

	public void setPuntosFuerza(int puntosFuerza) {
		this.puntosFuerza = puntosFuerza;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(mochila);
		result = prime * result + Objects.hash(nombre, numeroElementos, puntosConseguidos, puntosVida);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Arrays.equals(mochila, other.mochila) && Objects.equals(nombre, other.nombre)
				&& numeroElementos == other.numeroElementos && puntosConseguidos == other.puntosConseguidos
				&& puntosVida == other.puntosVida;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", puntosVida=" + puntosVida + ", puntosConseguidos=" + puntosConseguidos
				+ ", mochila=" + Arrays.toString(mochila) + ", numeroElementos=" + numeroElementos + "]";
	}

	public int addElemento(String s) {

		if (numeroElementos > 10) {
			System.out.println("YA NO PUEDES CONSEGUIR MÁS ELEMENTOS PUES TU MOCHILA ESTÁ\r\n" + "COMPLETA\".");
		} else {
			for (int i = 0; i < 10; i++) {
				s = mochila[i];
			}
			numeroElementos++;
		}

		return numeroElementos;

	}

	public void recibirGolpe(int golpe) {

		if (getPuntosVida() < 0) {
			System.out.println("Lo siento la vida no puede ser negativa");
		} else {
			setPuntosVida(puntosVida - golpe);
		}
	}

	public int curar() {
		int curacion = 10;

		if (Arrays.asList(mochila).contains("BOTIQUIN")&&getPuntosVida()<100) {
			setPuntosVida(puntosVida + curacion);
			
		}else {
			System.out.println("LO SIENTO, PERO NO TIENES NINGUNA POCIÓN DE BOTIQUÍN");
		}
		return puntosVida;
	}
	
	

}
