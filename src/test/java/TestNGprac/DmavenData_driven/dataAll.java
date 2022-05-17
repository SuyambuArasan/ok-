package TestNGprac.DmavenData_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataAll {
	
	
	private static void allData() throws Throwable {
		
		File f = new File("C:\\Users\\dines\\eclipse-workspace\\DmavenData_driven\\xcel\\datdrivencocept.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		
		
	Sheet s= 	w.getSheet("java");
	int row = s.getPhysicalNumberOfRows();
	for (int i = 0; i <row ; i++) {
		
	Row r =	s.getRow(i);
	
	int cell =r.getPhysicalNumberOfCells();
	for (int j = 0; j < cell; j++) {
		
		Cell c= r.getCell(j);
		
	CellType type = 	c.getCellType();
	
	if (type.equals(CellType.STRING)) {
		
		String q = c.getStringCellValue();
		System.out.println(q);
		
	} else {
		
	double d = 	c.getNumericCellValue();
	int n = (int)d ;
	String qw= String.valueOf(n);
	System.out.println(qw);

	}
		
	}
		
	}
		
		
		
		
	}
	public static void main(String[] args) throws Throwable {
		allData();
	}
	}	