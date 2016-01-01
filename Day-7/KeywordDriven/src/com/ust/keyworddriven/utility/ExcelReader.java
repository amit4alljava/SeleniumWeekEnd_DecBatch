package com.ust.keyworddriven.utility;

import static com.ust.keyworddriven.utility.ConfigReader.getXLSPath;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import com.ust.keyworddriven.dto.CommandDTO;
public class ExcelReader {
	private static ExcelReader reader = null;
	private ExcelReader(){}
	
	public static ExcelReader getInstance(){
		if(reader==null){
			reader = new ExcelReader();
		}
		return reader;
	}
	
	public ArrayList<CommandDTO> readExcel() throws Exception{
		// Dynamic Nature
		ArrayList<CommandDTO> commandList = new ArrayList<>();
		CommandDTO commandDTO =null;
		// Step-1 Open a File
		FileInputStream fi = new FileInputStream(getXLSPath());
		// Step-2 Open a WorkBook
		HSSFWorkbook workBook = new HSSFWorkbook(fi);
		// Step -3 Open a WorkSheet
		HSSFSheet sheet = workBook.getSheetAt(0);
		// Step - 4 Traverse the Rows
		Iterator<Row> rows = sheet.rowIterator();
		while(rows.hasNext()){
			// This will give the currentRow
			Row currentRow = rows.next();
			// Step -5 Getting the Cells from a Row
			Iterator<Cell> cells = currentRow.cellIterator();
			// Step-6 Traverse the Cells
			
			int columnCount = 1;
			commandDTO = new CommandDTO();
			while(cells.hasNext()){
				Cell currentCell = cells.next();
				if(columnCount==1){
					commandDTO.setCommand(currentCell.getStringCellValue());
				}
				else
				if(columnCount==2){
					commandDTO.setTarget(currentCell.getStringCellValue());
				}
				else
				if(columnCount==3){
					commandDTO.setValue(currentCell.getStringCellValue());
				}
				columnCount++;
			} // Cell Loop Ends
			commandList.add(commandDTO);
		} // Row Loop Ends
		workBook.close();
		fi.close();
		return commandList;
	}

}
