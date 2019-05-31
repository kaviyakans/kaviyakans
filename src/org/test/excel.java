package org.test;
import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.InputStream;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	public class Excelnew {
		public static void main(String[] args) throws IOException {
			File loc= new File("C:\\Users\\Sambath\\eclipse-workspace\\ExcelRead\\Excel\\Book.xlsx");
	 Workbook wo=new XSSFWorkbook();
	 Sheet s=wo.createSheet("hello");
	 Row r=s.createRow(0);
	 Cell c=r.createCell(0);
	 c.setCellValue("kaviya");
	 FileOutputStream o=new FileOutputStream(loc);
	 wo.write(o);
	 System.out.println("done");

}
	}



