package com.Parameterization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ParamaerizationWrite 
{

	
	
		public static void main(String args[]) throws IOException
		{
			
			int[] serial=new int[5]; //Sr.No:1 2 3 4 5 
			
			for(int i=0;i<serial.length;i++)
			{
			
				serial[i]=i+1;
			}
			
			String[] name=new String[5];//Names
			
			name[0]="Name";
			name[1]="Mangesh";
			name[2]="Raj";
			name[3]="Jayesh";
			name[4]="Suraj";
			

			String[] city=new String[5];//Names
			
			city[0]="City";
			city[1]="Pune";
			city[2]="Thane";
			city[3]="Nagpur";
			city[4]="Nasik";
			
			String[] Subject=new String[5];//Names
			
			Subject[0]="Subject Name";
			Subject[1]="Manual Testing";
			Subject[2]="Automation Testing";
			Subject[3]="Database Testing";
			Subject[4]="API Testing";
			
			String[] Marks=new String[5];//Names
			
				Marks[0]="Marks";
				Marks[1]="60";
				Marks[2]="70";
				Marks[3]="80";
				Marks[4]="90";
				
			XSSFWorkbook workbook= new XSSFWorkbook();
			
			XSSFSheet sheet=workbook.createSheet();
			
			for(int i=0;i<serial.length;i++)
			{
				
				XSSFRow row=sheet.createRow(i);
				
				for(int j=0;j<5;j++)
				{
					
					XSSFCell cell=row.createCell(j);
					
					if(cell.getColumnIndex()==0)
					{
						cell.setCellValue(serial[i]);
					}
					
					else if(cell.getColumnIndex()==1)
					{
						cell.setCellValue(name[i]);
					}
					
					else if(cell.getColumnIndex()==2)
					{
						cell.setCellValue(city[i]);
					}
					else if(cell.getColumnIndex()==3)
					{
						cell.setCellValue(Subject[i]);
					}
					
					else if(cell.getColumnIndex()==4)
					{
						cell.setCellValue(Marks[i]);
					}
					
					
				}
				
												
			}
			
			
			
			String path="D:\\Software TESTING\\Selenium Project\\Write2ndJuly.xlsx";
				
			//Use this class for sending path of the excel sheet
			FileOutputStream fo= new FileOutputStream(path);
			
			workbook.write(fo);
			
			System.out.println("Hey!! Congrats Your file has been generated");
			
			//To create Workbook: XSSF
			
			
		}

}
