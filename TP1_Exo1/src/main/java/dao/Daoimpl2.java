package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Daoimpl2 implements Idao{

	private double data;
	
	
	
	public double getValue() {
		int count = 0;
		
		try {
			// ouverture du fichier
		FileInputStream inputStream = 
					new FileInputStream(new File("test.xls"));
		// le fichier excel
		HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
		
		// pointer sur la premiere feuille
		HSSFSheet dataSheet = workbook.getSheetAt(0);
		// definir un lecteur su
		Iterator<Row> rowIterator = dataSheet.iterator();
		Cell cellule;
		// parcourir le fichier
		while (rowIterator.hasNext()) {  // detecter la fin
			Row row = (Row) rowIterator.next(); //  lire l'element courant
			cellule = row.getCell(0);              
			int id = (int)cellule.getNumericCellValue();
			count++;			
			data += id;	
			}
		 
		}
		catch(IOException io) {
			 System.out.println("Erreur d'ouverture de fichier !!!!!");
		}
		return data/count;  // recuperer la moyenne
	}

}
