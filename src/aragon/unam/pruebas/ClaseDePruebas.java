package aragon.unam.pruebas;

import java.io.IOException;

import aragon.unam.ejercicios.Empleado;
import aragon.unam.ejercicios.NominaADT;

public class ClaseDePruebas {
	public static void main(String[] args) throws IOException {
		NominaADT n = new NominaADT("/archivos/junio.dat");

		//System.out.println(n.pruebaToString());
		
		n.mostrarEmpleadosMayorYMenor();
		
		/*Empleado a = new Empleado(1, 2020);
		
		Empleado b = new Empleado(2, 2022);
		
		System.out.println(a.compareTo(b));*/
		
	}
}
