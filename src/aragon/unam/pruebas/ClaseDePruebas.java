package aragon.unam.pruebas;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

import aragon.unam.ejercicios.Empleado;
import aragon.unam.ejercicios.NominaADT;

@SuppressWarnings("unused")
public class ClaseDePruebas {
	public static void main(String[] args) throws IOException {
		NominaADT n = new NominaADT("/archivos/junio.dat");
		/*int[] o = {1,2,3,4,5,6};
		
		for (int i : o) {
			System.out.print(i + "-");
		}
		
		System.out.println("\n+++++++++++++++++++++++++++");
		
		o = Arrays.copyOfRange(o, 3, 6);
	
		for (int i : o) {
			System.out.print(i + "-");
		}*/

		/*System.out.println(n.pruebaToString());
		
		n.getDatos().getItem(0).sueldoTotal();
		System.out.println("**************************** \n");
		
		n.mostrarEmpleadosMayorYMenor();*/
		System.out.println(n);
		System.out.println("+++++++");
		System.out.println(n.listaSueldosEmpleados());
		System.out.println("+++++++");
		System.out.println(n.mostrarEmpleadosMayorYMenorAntiguedad());
		
	}
}
