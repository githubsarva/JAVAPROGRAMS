package Photon;

import java.io.FileInputStream;

import com.sun.media.sound.InvalidFormatException;

public class WriteCellValue {
		
		public static void main(String[] args) throws InvalidFormatException, IOException {
			
			String filepath = "C:\\Users\\Saravanan\\Desktop\\test.xlsx";
			FileInputStream fis = new FileInputStream(filepath);
			Workbook wb = WorkbookFactory.create(fis);
			Row r= wb.getSheet("Sheet1").getRow(1);
			if(r==null){
				r=wb.getSheet("Sheet1").createRow(1);
			}
			Cell c= r.getCell(1);
			if(c==null){
				c=r.createCell(1);
			}
			c.setCellValue("Dhanyasri SV");
			FileOutputStream fos= new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
			
		}

	}


}
