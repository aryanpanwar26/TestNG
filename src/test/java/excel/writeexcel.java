package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeexcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInput = new FileInputStream(new File("./src/test/resources/TestData.xlsx"));
		Workbook wk = null;
		wk = WorkbookFactory.create(fileInput);
		Sheet sheet = wk.getSheet("Data");
		int totalrows = sheet.getLastRowNum();
		for(int i=1;i<=totalrows;i++) {
			sheet.getRow(i).createCell(3, CellType.STRING).setCellValue("Passed");
		}
		FileOutputStream fileoutput = new FileOutputStream(new File("./src/test/resources/TestData.xlsx"));
		wk.write(fileoutput);
		wk.close();
	}

}
