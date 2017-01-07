/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaMaven.utility.ExportExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author ricardocorrea
 */
public class ExportExcel {
    
        public static void main(String[] args)
    {
        boolean excel = BuildExel();
        
        excel = ReadExcel();
        
        URL location = Sheet.class.getProtectionDomain().getCodeSource().getLocation();
        System.out.println(location.getPath());
        
    }

    private static boolean BuildExel() {
       //Blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();
         
        //Create a blank sheet
        XSSFSheet sheet = workbook.createSheet("Employee Data");
          
        //This data needs to be written (Object[])
        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
        data.put("2", new Object[] {1, "Amit", "Shukla"});
        data.put("3", new Object[] {2, "Lokesh", "Gupta"});
        data.put("4", new Object[] {3, "John", "Adwards"});
        data.put("5", new Object[] {4, "Brian", "Schultz"});
          
        //Iterate over data and write to sheet
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset)
        {
            Row row = sheet.createRow(rownum++);
            Object [] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr)
            {
               Cell cell = row.createCell(cellnum++);
               if(obj instanceof String)
                    cell.setCellValue((String)obj);
                else if(obj instanceof Integer)
                    cell.setCellValue((Integer)obj);
            }
        }
        try
        {
            //Write the workbook in file system
            FileOutputStream out = new FileOutputStream(new File("/Users/ricardocorrea/saida/howtodoinjava_demo.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("howtodoinjava_demo.xlsx written successfully on disk.");
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }        
    
    
    }

    private static boolean ReadExcel() {
        try
        {
            FileInputStream file = new FileInputStream(new File("howtodoinjava_demo.xlsx"));
 
            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);
 
            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
 
            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) 
            {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();
                 
                while (cellIterator.hasNext()) 
                {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType()) 
                    {
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "t");
                            break;
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue() + "t");
                            break;
                    }
                }
                System.out.println("Read OK");
                
            }
            file.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    
    
    
}
