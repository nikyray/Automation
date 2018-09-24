package qsp;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoA {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("./data/xl.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		String s = w.getSheet("sheet1").getRow(0).getCell(0).toString();
		System.out.println(s);
		
	}

}
