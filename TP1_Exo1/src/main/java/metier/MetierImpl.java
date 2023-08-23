package metier;

import dao.Idao;

public class MetierImpl implements Imetier{
	private Idao dao;
	private double data;
	
	
	public MetierImpl () { 
		
		System.out.println("constructeur de metier"); 
		
	}
	
	
	public void setDao(Idao d) {
		dao = d;
	}
	
	public double calcul() {
		
		double input = dao.getValue();		
		data = input * 2.5  / 100;		
		return data;	
	}
	
	
	
}
