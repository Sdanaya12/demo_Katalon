package com.demo.automation.models;

import com.demo.automation.utils.Excel;

import java.io.IOException;

public class DataInjection {

    public String getFilePath() {
        String filePath = "Resource/DataDriven.xlsx";
        return filePath;
    }
    public String getSheetNameLogin() {
        String sheetName = "Login";
        return sheetName;
    }

    public String getSheetNameData() {
        String sheetName = "Data";
        return sheetName;
    }

    public String getSheetNameValidations() {
        String sheetName = "Validations";
        return sheetName;
    }
    
    public String[] dataLogin() throws IOException {

        String[][] data = Excel.excelFile( getFilePath() , getSheetNameLogin());
        int contFilas = data.length;
        String[] infoLogin = new String[3];
        for (int i=0; i<contFilas; i++ ){
            for (int j=0; j<3;j++){
                infoLogin[j] = data[i][j];
            }
        }
        return infoLogin;
    }

    public String[] dataForm() throws IOException {

        String[][] data = Excel.excelFile( getFilePath() , getSheetNameData());
        int contFilas = data.length;
        String[] dataForm = new String[4];
        for (int i=0; i<contFilas; i++ ){
            for (int j=0; j<4;j++){
                dataForm[j] = data[i][j];
            }
        }
        return dataForm;
    }

    public String[] dataValidations() throws IOException {

        String[][] data = Excel.excelFile( getFilePath() , getSheetNameValidations());
        int contFilas = data.length;
        String[] dataValidations = new String[1];
        for (int i=0; i<contFilas; i++ ){
            for (int j=0; j<1;j++){
                dataValidations[j] = data[i][j];
            }
        }
        return dataValidations;
    }

}
