package com.review11;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDemo {
	
	public static void main(String[] args) throws IOException {
		
		String filePath=System.getProperty("user.dir")+"//extra\\AnotherFile.xlsx";
		System.out.println(filePath);
		
		FileInputStream fis=new FileInputStream(filePath);
		
		//we get the whole file
		Workbook book=new XSSFWorkbook(fis);
		
		//we get into the sheet i use
		Sheet myFile=book.getSheet("Sheet2");
		
		//number of rows
		int rows=myFile.getPhysicalNumberOfRows();
		System.out.println(rows);
		
		//number of cells
		int cols=myFile.getRow(0).getLastCellNum();
		System.out.println(cols);
		
		//get one row from the current sheet
		Row row0=myFile.getRow(0);
				
		//lets iterate the cells of the header or row0
		
		for(int i=0; i<rows;i++) {
			String keys=row0.getCell(i).toString();
			System.out.print(keys+" ");
		}
		System.out.println("=============");
		//lets iterate all data from rows
		for(int i=1; i<rows;i++) {
			
			for(int j=0;j<cols;j++) {
				
		String allvals=myFile.getRow(i).getCell(j).toString();
		System.out.print(allvals+" ");
	
				
			}
			
			System.out.println();
		}
		
		}
		
		
		
	
}
