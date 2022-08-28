package aragon.unam.estructuras;

import java.util.ArrayList;

public class ArrayADT<T> {
	private int tamaño;
	private ArrayList<T> datos;

	public ArrayADT(int tamaño) {
		this.tamaño = tamaño;
		this.datos = new ArrayList<T>();

		for (int i = 0; i < this.tamaño; i++) {
			this.datos.add(null);
		}

	}

	public T getItem(int indice) {
		if (indice >= 0 && indice < this.tamaño) {
			return datos.get(indice);
		}

		return null;
	}

	public void setItem(T elemento, int indice) {
		if (indice >= 0 && indice < this.tamaño) {
			datos.set(indice, elemento);
		}
	}

	public int getLength() {
		return this.tamaño;
	}

	public void clear(T parametro) {
		for (int i = 0; i < this.tamaño; i++) {
			this.datos.set(i, parametro);
		}
	}

	@Override
	public String toString() {
		return "ArrayADT [tamaño=" + tamaño + ", datos=" + datos.getClass() + "]";
	}

}

