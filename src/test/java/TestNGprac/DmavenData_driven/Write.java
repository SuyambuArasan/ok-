package TestNGprac.DmavenData_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {
	
	private static void writeInExcel() throws Throwable {
		
		File f = new File("C:\\Users\\dines\\OneDrive\\Desktop\\datdrivencocept.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		
		w.createSheet("great").createRow(1).createCell(1).setCellValue("Dinesh");
		 FileOutputStream fo = new FileOutputStream(f);
		 w.write(fo);
		 
		 
		
		
	}
	public static void main(String[] args) throws Throwable {
		writeInExcel();
	}
	}
