package ejercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataManager {

	public static Double[][] GetCities() throws FileNotFoundException, IOException {
	      String cadena;
	      FileReader f = new FileReader("ejemplo_matriz");
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

	public static int[][] GetSeasons() throws FileNotFoundException, IOException 
	{
	      FileReader f = new FileReader("ejemplo_temporadas");
	      BufferedReader b = new BufferedReader(f);
	      String[] values;
	      int[][] output = new int[3][2];
	      values = b.readLine().split(",");
	      	output[0][0] = Integer.parseInt(values[0]);
	      	output[0][1] = Integer.parseInt(values[1]);
	      values = b.readLine().split(",");
	      	output[1][0] = Integer.parseInt(values[0]);
	      	output[1][1] = Integer.parseInt(values[1]);
	      values = b.readLine().split(",");
	      	output[2][0] = Integer.parseInt(values[0]);
	      	output[2][1] = Integer.parseInt(values[1]);
		  b.close();
		  f.close();
		  return output;
	}
	
}

