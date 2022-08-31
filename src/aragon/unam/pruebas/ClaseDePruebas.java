package aragon.unam.pruebas;

import java.io.IOException;

import aragon.unam.ejercicios.Empleado;
import aragon.unam.ejercicios.NominaADT;

@SuppressWarnings("unused")
public class ClaseDePruebas {
	public static void main(String[] args) throws IOException {
		NominaADT n = new NominaADT("/archivos/junio.dat");

		System.out.println(n.pruebaToString());
		System.out.println("**************************** \n");
		
		n.mostrarEmpleadosMayorYMenor();
		
	}
}
