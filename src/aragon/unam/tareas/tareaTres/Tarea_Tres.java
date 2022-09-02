package aragon.unam.tareas.tareaTres;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

import aragon.unam.ejercicios.Empleado;
import aragon.unam.ejercicios.NominaADT;

@SuppressWarnings("unused")
public class Tarea_Tres {
	public static void main(String[] args) throws IOException {
		NominaADT n = new NominaADT("/archivos/junio.dat");
		
		System.out.println("+++++++ Presentaci�n de todos los trabajadores +++++++\n");
		System.out.println(n);
		System.out.println("+++++++ Presentaci�n de los sueldos totales de todos los trabajadores +++++++\n");
		System.out.println(n.listaSueldosEmpleados());
		System.out.println("+++++++ Presentaci�n de los trabajadores de mayor y menor antig�edad +++++++\n");
		System.out.println(n.mostrarEmpleadosMayorYMenorAntiguedad());
		
	}
}
