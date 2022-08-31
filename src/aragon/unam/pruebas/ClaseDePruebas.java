package aragon.unam.pruebas;

import java.io.IOException;

import aragon.unam.ejercicios.NominaADT;

public class ClaseDePruebas {
	public static void main(String[] args) throws IOException {
		NominaADT n = new NominaADT("/archivos/junio.dat");

		n.getDatos().getItem(0).sueldoTotal();
		
	}
}
