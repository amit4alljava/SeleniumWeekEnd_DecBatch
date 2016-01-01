package com.ust.datadriven.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelReader {
	
	public static void main(String[] args) throws IOException {
		ExcelReader reader = new ExcelReader();
		reader.readExcelData();
	}
	
	public Object[][] readExcelData() throws IOException{
		Object [][]array =new Object[3][2];
		int row =0;
		int column=0;
		boolean isFirstRowPass =false;
		// Step - 1 Open a File to Read, and it read byte by byte
		
		String path = ConfigReader.getXLSPath();
		// Open a File
		FileInputStream fi = new FileInputStream(path);
		// Connect File with WorkBook . Opening a WorkBook
		HSSFWorkbook workBook = new HSSFWorkbook(fi);
		// Opening a Sheet
		HSSFSheet firstSheet = workBook.getSheetAt(0); // Read the First Sheet in a WorkBook
		// Iterating Rows
		Iterator<Row> rows = firstSheet.rowIterator();
		while(rows.hasNext()){
			// Reterive the CurrentRow from the Rows
			Row currentRow = rows.next();
			if(!isFirstRowPass){
				isFirstRowPass = true;
				continue; // Will Skip the Current Loop
			}
			// Iterating a Cells
			Iterator<Cell> cells = currentRow.cellIterator();
			column = 0;
			while(cells.hasNext()){
				// Getting the Current Cell
				Cell currentCell = cells.next();
				if(currentCell.getCellType()==Cell.CELL_TYPE_STRING){
					array[row][column] = currentCell.getStringCellValue();
					//System.out.print(currentCell.getStringCellValue()+" ");
				}
				else
				if(currentCell.getCellType()==Cell.CELL_TYPE_NUMERIC){
					array[row][column] = currentCell.getNumericCellValue();
					//System.out.println(currentCell.getNumericCellValue());
				}
				column++;
			} // Cell Loop Ends
			row++;
			//System.out.println();
		} // Row Loop Ends
		workBook.close();  // workbook close
		fi.close(); // file close
		return array;
	}

}
