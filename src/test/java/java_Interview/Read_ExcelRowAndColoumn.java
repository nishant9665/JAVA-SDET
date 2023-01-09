/*package java_Interview;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_ExcelRowAndColoumn {

	public static void main(String[] args) throws Exception {
		//Create an object of File class to open xlsx file
        File file =    new File("C:\\Users\\nishant.narwade\\Desktop\\Nishant\\Exam\\AutomationTest_Site\\Data\\Student_Data.xlsx");
        
        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);
        
        //Creating workbook instance that refers to .xls file
        XSSFWorkbook wb=new XSSFWorkbook(inputStream);
        
        //Creating a Sheet object using the sheet Name
        XSSFSheet sheet=wb.getSheet("Sheet1");
        
        //Create a row object to retrieve row at index 1
        XSSFRow row2=sheet.getRow(1);
        
        //Create a cell object to retreive cell at index 5
        XSSFCell cell=row2.getCell(3);
        
        //Get the address in a variable
        String address= cell.getStringCellValue();
        
        //Printing the address
        System.out.println("Address is :"+ address);

	}

}
*/
