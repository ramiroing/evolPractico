package ejercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	
	
	static Double[][] LeerInstancia(String archivo) throws FileNotFoundException, IOException {
	      String cadena;
	      FileReader f = new FileReader(archivo);
	      BufferedReader b = new BufferedReader(f);
	      ArrayList<Double[]> lines = new ArrayList<Double[]>();
	      while((cadena = b.readLine()) != null) {
	    	  String[] parts = cadena.split(" ");
	    	  Double[] values = new Double[parts.length];
	    	  for ( int i=0 ; i < parts.length ; i++ )
	    		  values[i] = Double.parseDouble(parts[i]);
	    	  lines.add(values);
	      }
	      b.close();
	      f.close();
	      return lines.toArray( new Double[lines.size()][] );
	}
	
	
	public static void main(String[] args) {
		
		try {
			Double[][] DATA_INSTANCE = LeerInstancia("ejemplo.txt");
			
			System.out.println(DATA_INSTANCE[1][1]);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
