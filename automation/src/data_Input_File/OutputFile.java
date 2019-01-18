/**
 * 
 */
package data_Input_File;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author etejvem
 *
 */
public class OutputFile {
	
	public static void main(String a[]) throws Exception {
		File source = new File("C:\\Users\\etejvem\\Documents\\inputfle\\test.xlsx");
		
		FileInputStream fis = new FileInputStream(source);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		sheet1.getRow(0).createCell(2).setCellValue("Pass");
		sheet1.getRow(1).createCell(2).setCellValue("Fail");
		
		FileOutputStream fout= new FileOutputStream(source);
		
		wb.write(fout);
		
		wb.close();
		
	}

}
