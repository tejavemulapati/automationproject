/**
 * 
 */
package readExcelData;

import lib.ExcelDataConfig;

/**
 * @author etejvem
 *
 */
public class ReadExcelData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExcelDataConfig excel= new ExcelDataConfig("C:\\Users\\etejvem\\Documents\\inputfle\\test.xlsx");
		
		System.out.println(excel.getData(1, 0, 1));

	}

}
