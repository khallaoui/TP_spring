package presentation;

import dao.DAO;
import metier.Metier;

public class Presentation {

	public static void main(String[] v) {
		
		DAO dao = new DAO();
		Metier metier = new Metier(dao);
		
		double donnee = metier.calcul();
		
		// l'exploitation des données : affichage
		
		System.out.println(donnee);
		
		
	}

}
