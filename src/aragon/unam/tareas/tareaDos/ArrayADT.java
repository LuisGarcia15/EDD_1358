package aragon.unam.tareas.tareaDos;

import java.util.ArrayList;

public class ArrayADT<T> {
	private int tama�o;
	private ArrayList<T> datos;

	public ArrayADT(int tama�o) {
		this.tama�o = tama�o;
		this.datos = new ArrayList<T>();

		for (int i = 0; i < this.tama�o; i++) {
			this.datos.add(null);
		}

	}

	public T getItem(int indice) {
		if (indice >= 0 && indice < this.tama�o) {
			return datos.get(indice);
		}

		return null;
	}

	public void setItem(T elemento, int indice) {
		if (indice >= 0 && indice < this.tama�o) {
			datos.set(indice, elemento);
		}
	}

	public int getLength() {
		return this.tama�o;
	}

	public void clear(T parametro) {
		for (int i = 0; i < this.tama�o; i++) {
			this.datos.set(i, parametro);
		}
	}

	@Override
	public String toString() {
		return "ArrayADT [tama�o=" + tama�o + ", datos=" + datos.getClass() + "]";
	}

}

class Pruebas {
	public static void main(String[] args) {

		ArrayADT<Integer> enteros = new ArrayADT<Integer>(5);
		ArrayADT<String> cadenas = new ArrayADT<String>(5);

		System.out.println("M�todo setItem()");
		for (int i = 0; i < enteros.getLength(); i++) {
			enteros.setItem(i + 1, i);
			cadenas.setItem("Abecedario".substring(i, 10), i);
		}

		System.out.println();

		System.out.println("M�todo getItem()");
		for (int i = 0; i < enteros.getLength(); i++) {
			System.out.println(enteros.getItem(i));
			System.out.println(cadenas.getItem(i));
		}

		System.out.println();

		System.out.println("M�todo getLength()");
		System.out.println("La longitud del Array enteros es: " + enteros.getLength());
		System.out.println("La longitud del Array cadenas es: " + cadenas.getLength());

		System.out.println();

		System.out.println("M�todo clear()");
		enteros.clear(100);
		cadenas.clear("Universidad");
		for (int i = 0; i < enteros.getLength(); i++) {
			System.out.println(enteros.getItem(i));
			System.out.println(cadenas.getItem(i));
		}

		System.out.println();

		System.out.println("M�todo toString()");
		System.out.println("M�todo toString del Array enteros es: " + enteros);
		System.out.println("M�todo toString del Array cadenas es: " + cadenas);
	}
}
