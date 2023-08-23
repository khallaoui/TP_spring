package dao;

import java.util.Scanner;

public class DAO {
	
	private double data;
	
	public double getValue() {
		// lire depuis le clavier
		System.out.println("Taper une valeur : ");
		Scanner clavier = new Scanner(System.in);
		double entree = clavier.nextDouble();
		data = entree;
		return data;
	}

}
