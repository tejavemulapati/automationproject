/**
 * 
 */
package data_Input_File;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author etejvem,,hello
 *
 */
public class InputFile {
	
	public static void main(String a[]) throws Exception {
		File source = new File("C:\\Users\\etejvem\\Documents\\inputfle\\test.xlsx");
		
		FileInputStream fis = new FileInputStream(source);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		//String data0=sheet1.getRow(0).getCell(1).getStringCellValue();
		
		//System.out.println("Data from Excel is "+data0);
		
		int rowcount = sheet1.getLastRowNum();
		System.out.println("Total rows in excel is "+rowcount);
		
		for(int i=0;i<rowcount;i++) {
			
			String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Test data from excel is"+ data0);
			
		}
		
		wb.close();
		
	}

}
