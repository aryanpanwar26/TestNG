package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testngex9 {
	
	@DataProvider(name="RetrieveData")
	public Object[][] retrieve() throws IOException {
		FileInputStream fileInput = new FileInputStream(new File("./src/test/resources/Retrieve.xlsx"));
		
		XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
		XSSFSheet sheet = workbook.getSheet("Data");
		int rows = sheet.getLastRowNum();
		int columns = sheet.getRow(0).getLastCellNum();
		Object obj [][] = new Object[rows ][columns];
		for(int i=1;i<=rows;i++) {
			XSSFRow row = sheet.getRow(i);
			int totalcols = row.getLastCellNum();
			for(int j=0;j<totalcols;j++) {
//				Cell cell = row.getCell(j);
//				if(cell.getCellType()==CellType.STRING) {
//					obj[i-1][j]= row.getCell(j).getStringCellValue();
//				}
//				else if(cell.getCellType()==CellType.NUMERIC) {
//					obj[i-1][j]= row.getCell(j).toString();
//				}
				//obj[i-1][j]= row.getCell(j).getStringCellValue();
				obj[i-1][j]=row.getCell(j).toString();
			}
		}
		workbook.close();
		return obj;
	}
	@Test(dataProvider="RetrieveData")
	public void login(String userName, String password) {
		System.out.println("UserName: "+userName+ " Password: " + password);
	}
	
//	@DataProvider(name="RetrieveData")
//	public Object[][] getData(){
//		Object[][] obj = new Object[3][2];
//		obj[0][0]="Aryan";
//		obj[0][1]="Aryan";
//		obj[1][0]="John";
//		obj[1][1]="234";
//		obj[2][0]="Nichole";
//		obj[2][1]="2343";
//		
//		return obj;
//	}
}
