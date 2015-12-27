import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


public class ExcelReader {
	public static void main(String[] args) throws Exception {
		ExcelReader.readExcel();
	}
	public static Object[][] readExcel() throws IOException{
		Object array[][]= new Object[3][2];
		int rowCounter = 0;
		int colCounter = 0;
		boolean isFirstRowPass = false;
		// Step - 1 Read a File (Bytes)
		FileInputStream fi = new FileInputStream("D:\\xls\\UserDataFile.xls");
		// Step - 2 Open a WorkBook
		HSSFWorkbook workBook = new HSSFWorkbook(fi);
		// Step -3 Open a WorkSheet
		HSSFSheet sheet = workBook.getSheetAt(0);
		// Step -4 Read the Rows 
		Iterator<Row> rows = sheet.rowIterator();
		while(rows.hasNext()){
			colCounter=0;
			Row currentRow = rows.next();
			// By Pass the First Row(Heading)
			if(!isFirstRowPass){
				isFirstRowPass = true;
				continue;
			}
			// Step -5 Read the Cells
			Iterator<Cell> cells = currentRow.cellIterator();
			while(cells.hasNext()){
				Cell currentCell = cells.next();
				if(currentCell.getCellType()==Cell.CELL_TYPE_STRING){
					//System.out.print(currentCell.getStringCellValue()+"\t");
					array[rowCounter][colCounter]=currentCell.getStringCellValue();
				}
				else
				if(currentCell.getCellType()==Cell.CELL_TYPE_NUMERIC)	
				{
					//System.out.print(currentCell.getNumericCellValue()+"\t");
				}
				colCounter++;
			} // Cells Loop Ends here
			//System.out.println();
			rowCounter++;
			
		} // Row Loop Ends
	return array;	
	}

}
