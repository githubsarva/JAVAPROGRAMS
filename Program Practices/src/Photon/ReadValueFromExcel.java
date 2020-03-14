package Photon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadValueFromExcel {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		public static void main(String[] args) throws InvalidFormatException, IOException {
			String filepath = "C:\\Users\\Saravanan\\Desktop\\test.xlsx";
			FileInputStream fis = new FileInputStream(filepath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet("Sheet1");
			Row r=sh.getRow(1);
			Cell c=r.getCell(1);
			String cellval1= c.getStringCellValue();
			System.out.println("Value is:"+c);
			
		}


}
