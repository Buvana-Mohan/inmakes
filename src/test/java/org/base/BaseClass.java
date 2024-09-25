package org.base;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Action;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	public static WebDriver driver;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	public static void windowMaximize() {
		driver.manage().window().maximize();
	}
	public static void launchUrl(String url) {
	driver.get(url);
	}
	public static String pageTitle() {
		String title = driver.getTitle();
	return title;
	}

	public static String pageUrl() {
		String url1 = driver.getCurrentUrl();
		return url1;
	}
	public static void passtext(String text,WebElement ele) {
		ele.sendKeys(text);
	}
	public static void closeEntireBrowser() {
		driver.quit();
	}
	public static void clickBtn(WebElement ele) {
		ele.click();
	}
	public static void screenShot(String imgName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		//step-2 use getScreenshotAs
		File image = ts.getScreenshotAs(OutputType.FILE);
		//step-3 Choose destination file
		File f = new File ("C:\\Users\\jana\\eclipse-workspace\\CucumProject1\\Screenshots\\");
		//step-4 move the image to  destination folder
		FileUtils.copyFile(image, f);
		
	}
	public static Actions  a;
	
	public static void moveTheCursor(WebElement dragWebElement,WebElement dropElement) {
		a=new Actions(driver);
		a.dragAndDrop(dragWebElement, dropElement).perform();
	}
	
	public static JavascriptExecutor js;
	
	public static void scrollThePage(WebElement tarWebEle) {
	js =  (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)", tarWebEle);
	}
	public static void scroll(WebElement element) {
		js =  (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
		}
	
	public static void excelRead(String sheetName,int rowNum,int cellNum) throws IOException {
		
		// 1.mention the excel path name
		File f = new File("C:\\Users\\jana\\eclipse-workspace\\MavenInstallation\\Excel\\Newfile.xlsx");
		// 2.To read excel File
		FileInputStream fis = new FileInputStream(f); // it throws filenotfoundException(compiletime exception)
		// 3.To read .xlsx File format by upcasting
		// XSSFWorkbook wb = new XSSFWorkbook(fis);
		Workbook wb = new XSSFWorkbook(fis); // IOException is parent of filenotfoundException
		// 4.To get the sheet
		Sheet mysheet = wb.getSheet("Datas");
		Row r = mysheet.getRow(rowNum);
		Cell c = r.getCell(cellNum);
		int cellType = c.getCellType();
		String value = " ";
		if (cellType == 1) {
			String value2 = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date dd = c.getDateCellValue();
			// to print the format we want
			SimpleDateFormat s = new SimpleDateFormat(value);
			String value1 = s.format(dd);
		} else {

			double d = c.getNumericCellValue();
			long l = (long) d;
			String valueof = String.valueOf(l);

}}
	public static void createNewExcelFile(int rowNum,int cellnum,String writeData) throws IOException {
		File f = new File ("C:\\Users\\jana\\eclipse-workspace\\MavenInstallation\\Excel\\Newfile.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet newsheet = w.createSheet("Datas");
		Row newRow = newsheet.createRow(rowNum);
		Cell newCell = newRow.createCell(cellnum);
		newCell.setCellValue(writeData);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
	}
	public static void createCell(int getRow,int creCell,String newData) throws IOException {
		File f = new File ("C:\\Users\\jana\\eclipse-workspace\\MavenInstallation\\Excel\\Newfile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("Datas");
		Row r = mysheet.getRow(getRow);
		Cell c = r.createCell(creCell);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	public static void createRow(int creRow,int creCell,String newData) throws IOException {
		File f = new File ("C:\\Users\\jana\\eclipse-workspace\\MavenInstallation\\Excel\\Newfile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Datas");
		Row r = s.createRow(creRow);
		Cell c = r.createCell(creCell);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	public static void updateDataToParticularCell(int getTheRow,int getTheCell,String existingData,String writeNewData) throws IOException {
		File f = new File ("C:\\Users\\jana\\eclipse-workspace\\MavenInstallation\\Excel\\Newfile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Datas");
		Row r = s.getRow(getTheRow);
		Cell c = r.createCell(getTheCell);
		String str = c.getStringCellValue();
		if (str.equals(existingData)) {
			c.setCellValue(writeNewData);
		}
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	
		
	
	

}
