package com.demo.automation.utils;
import com.demo.automation.utils.Excel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excel {
    public static String[][] excelFile(String filePath, String dataSheet) throws IOException {

        FileInputStream documento = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(documento);

        XSSFSheet sheet = workbook.getSheet(dataSheet);
        int contFilas = sheet.getLastRowNum()-sheet.getFirstRowNum();
        int contColumnas = sheet.getRow(0).getLastCellNum();
        int ii = 0;
        sheet.createRow(contFilas + 1);
        Row row;
        Cell cell;

        String data;
        String [][] dataDinamica  = new String [contFilas][contColumnas];

        for (int i = 0 ; i < contFilas ; i++ ) {
            ii++;
            row = sheet.getRow(ii);
            for(int j = 0 ; j < contColumnas ; j++) {
                cell = row.getCell(j);
                data = cell.toString();
                dataDinamica[i][j] = data;
            }
        }
        return dataDinamica;
    }
}
