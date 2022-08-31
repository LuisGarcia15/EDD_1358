package aragon.unam.ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import aragon.unam.estructuras.ArrayADT;

public class NominaADT {
	
	private ArrayADT<Empleado>datos;

	public NominaADT(String ruta) throws IOException {
		File f = new File(System.getProperty("user.dir") + ruta);
		this.datos = new ArrayADT<>(this.inicializarArrayADT(ruta));
		String filas;
		String[] atributosEmp;
		int bandera = 0, contador = 0;
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			while((filas = br.readLine()) != null) {
				if(bandera == 0) {
					bandera ++;
				}else {
					atributosEmp = filas.split(",");
					datos.setItem(new Empleado(Integer.parseInt(atributosEmp[0])
							, atributosEmp[1], atributosEmp[2], atributosEmp[3], 
							Double.parseDouble(atributosEmp[4])
							, Double.parseDouble(atributosEmp[5])
							, Integer.parseInt(atributosEmp[6])), contador);
					contador++;
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException();
		}
		
	}
	
	private int inicializarArrayADT(String ruta) throws IOException{
		File f = new File(System.getProperty("user.dir") + ruta);
		FileReader fr;
		BufferedReader br;
		@SuppressWarnings("unused")
		String filas;
		int bandera = 0, numElementos = 0;
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			while((filas = br.readLine()) != null) {
				if(bandera == 0) {
					bandera ++;
				}else {
					numElementos++;
				}
			}
			br.close();
			return numElementos;
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException();
		}
	}
	
	public ArrayADT<Empleado> getDatos() {
		return datos;
	}

	public String pruebaToString() {
		return this.datos.toString();
	}
}
