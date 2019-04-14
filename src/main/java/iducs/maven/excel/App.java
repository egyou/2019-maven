package iducs.maven.excel;

import java.util.Scanner;

/**
 * HSSF is prefixed before the class name to indicate operations related to a Microsoft Excel 2003 file.
 * XSSF is prefixed before the class name to indicate operations related to a Microsoft Excel 2007 file or later.
 * XSSFWorkbook and HSSFWorkbook are classes which act as an Excel Workbook
 * HSSFSheet and XSSFSheet are classes which act as an Excel Worksheet
 * Row defines an Excel row
 * Cell defines an Excel cell addressed in reference to a row.
 *
 * @author egyou(egyou@induk.ac.kr)
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println("Select Menu : ");
        System.out.println("0.read xlsx");
        System.out.println("1.write xlsx");
        Scanner sc = new Scanner(System.in);
        
        System.out.println( "Excel Reader Writer - xlsx " );
        
        final String FILE_NAME = "D:/my-excel.xlsx";
        
        ApachePOIExcelReader poiReader = new ApachePOIExcelReader();
        ApachePOIExcelWriter poiWriter = new ApachePOIExcelWriter();
        
        //poiWriter.writeXLSX(FILE_NAME);
        System.out.println( "Write Complete - xlsx " );
        
        
        if(sc.next().equals("0")) {
        	poiReader.readXLSX(FILE_NAME);
        	System.out.println( "Read a xlsx file completely! " );
        }
        else if(sc.next().equals("1")) {
        	poiWriter.writeXLSX(FILE_NAME);
            System.out.println( "Write a xlsx file completely! " );
        }
        else
        	;
    }
}
