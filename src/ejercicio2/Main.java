package ejercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			Double[][] CITIES_INSTANCE = DataManager.GetCities();
			int[][] SEASONS_INSTANCE = DataManager.GetSeasons();
			
			System.out.println(SEASONS_INSTANCE[1][1]);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
