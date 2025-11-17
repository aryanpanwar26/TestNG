package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class readexcel1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInput = new FileInputStream(new File("./src/test/resources/TestData.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
		XSSFSheet sheet = workbook.getSheet("Data");
		int totalrows = sheet.getLastRowNum();
		for(int i=1;i<=totalrows;i++) {
			XSSFRow row = sheet.getRow(i);
			int totalcols = row.getLastCellNum();
			for(int j=0;j<totalcols;j++) {
				Cell cell = row.getCell(j);
				if(cell.getCellType()==CellType.STRING) {
					System.out.println(row.getCell(j).getStringCellValue()+" ");
				}
				else if(cell.getCellType()==CellType.NUMERIC) {
					System.out.println(row.getCell(j).getNumericCellValue()+" ");
				}
				//System.out.println(row.getCell(j).getStringCellValue());
			}
			System.out.println("");
			
		}
		workbook.close();
	}

}
