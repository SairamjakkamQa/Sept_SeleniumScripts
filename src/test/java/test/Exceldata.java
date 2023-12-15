package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata {
	
	public static void main(String[] args) throws Throwable {

		File f = new File("C:\\Users\\Jakkam Sairam\\OneDrive\\Desktop\\SampleUserdata.xlsx");
		FileInputStream stream = new FileInputStream(f);

		XSSFWorkbook workbook = new XSSFWorkbook(stream);

		XSSFSheet sheet = workbook.getSheetAt(0);

		int rows = sheet.getPhysicalNumberOfRows();  //5

		int cells = sheet.getRow(1).getLastCellNum(); // 2

		for (int i = 1; i < rows; i++) {

			for (int j = 0; j < cells; j++) {

				DataFormatter df=new DataFormatter();
				
				System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
			}

		}

		stream.close();
		workbook.close();
		
	}
}
