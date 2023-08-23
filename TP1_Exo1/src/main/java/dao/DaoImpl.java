package dao;

import java.util.Scanner;

public class DaoImpl implements Idao{
	
	private double data;
	
	public DaoImpl () {
		System.out.println("constructeur de dao"); 
	}

	public double getValue() {
		System.out.println("Taper une valeur : ");
		Scanner clavier = new Scanner(System.in);
		double entree = clavier.nextDouble();
		data = entree;
		return data;
	}
	
	public void test() {
		
	}

}
