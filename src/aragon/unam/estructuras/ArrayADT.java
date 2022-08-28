package aragon.unam.estructuras;

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

