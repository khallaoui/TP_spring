package metier;

import dao.DAO;

public class Metier {
	private double data;
	private DAO dao;
	
	
	public Metier (DAO d) {
		this.dao = d;
	}
	
	public double calcul() {
		
		double input = dao.getValue();
		
		data = input * 2.5  / 100;
		
		return data;
	}

}
