package com.Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ParameterizationRead //read data from excel sheet
{

	public static void main(String args[]) throws IOException
	{
		//Use this class for sending path of the excel sheet
		FileInputStream fs= new FileInputStream("D:\\Software TESTING\\Selenium Project\\2 Jul 2022- Evening.xlsx");
		
		//To create Workbook: XSSF
		
		XSSFWorkbook workbook= new XSSFWorkbook(fs);
		
		//To Create Worksheet
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		//to select
		Row row=sheet.getRow(0);
		
		//select cell
		
		Cell cell=row.getCell(0);
		System.out.println(sheet.getRow(0).getCell(0));
		
		//
	
		//to select
		
		
	}
	
}
