package TestNGprac.DmavenData_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Read {
	
	public static void particularDAta() throws IOException {
		File f = new File("C:\\Users\\dines\\eclipse-workspace\\DmavenData_driven\\xcel\\datdrivencocept.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fis);
	
	Sheet s= w.getSheet("java");
	Row r = s.getRow(0);
	org.apache.poi.ss.usermodel.Cell c= r.getCell(0);
	
CellType type = 	c.getCellType();
if (type.equals(CellType.STRING)) {
	
	String g = c.getStringCellValue();
	System.out.println(g);
	
} else {
	
	double d= c.getNumericCellValue();
	 int n = (int)d;
	String re=  String.valueOf(n);
	System.out.println(re);
	 

}
	
	
	}
	
	public static void main(String[] args) throws Throwable {
		particularDAta();
	}
	
	
}