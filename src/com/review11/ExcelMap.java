package com.review11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMap {
	
	public static void main(String[] args) throws IOException {
		
		String filePath=System.getProperty("user.dir")+"\\extra\\AnotherFile.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook book=new XSSFWorkbook(fis);
		
		Sheet sheet=book.getSheet("Sheet2");
		
		int rows=sheet.getPhysicalNumberOfRows();
		int cells=sheet.getRow(0).getLastCellNum();
		
		Row row=sheet.getRow(1);
		String cell=row.getCell(1).toString();
		System.out.println(cell);
		System.out.println("========");
		
		Map<String, String> maryMap = new LinkedHashMap<>();
		// Let's create a map for Mary, which is row 2
		for (int i = 0; i < cells; i++) {
			String headerCell = sheet.getRow(0).getCell(i).toString();
			String maryCell = sheet.getRow(2).getCell(i).toString();
			maryMap.put(headerCell, maryCell);
		}
		System.out.println(maryMap);

		// I will have three maps
		// I will store the three maps into a List
		List<Map<String, String>> mapList = new ArrayList<>();

		// Iterating data rows, not header
		for (int i = 1; i < rows; i++) {
			//For every data row I will create a map
			Map<String, String> map = new LinkedHashMap<>();
			
			// Iterating cells, to fill the map
			for (int j = 0; j < cells; j++) {
				map.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i).getCell(j).toString());
			}
			
			//After I filled the map, I am adding it into the list
			mapList.add(map);
		}
		
		System.out.println(mapList);
		
		//HW for Jamoliddin AND Ali Tarlaci
		//iterate the list of maps
		
		//print the map
		
		//Then get the keys in a Set from the map 
		//and iterate the key and print in this format: 
		//key -> value
		
	}
}