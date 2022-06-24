package org.excel.com;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	private XSSFSheet ws;
	
	public void readExcel(int sheetNo) throws IOException {
		XSSFWorkbook wb = null;
		try {
			FileInputStream fis = new FileInputStream(".\\src\\main\\resources\\Excel\\payment.xlsx");
			wb = new XSSFWorkbook(fis);
			ws = wb.getSheetAt(sheetNo);			
		} catch (Exception e) {
			 System.out.println("In "+new Object() {}.getClass().getEnclosingMethod().getName()+" Method");
			 System.out.println(e);
		}finally {
			wb.close();
		}
	}
	
	public String getData(int row,int col) {
		if(ws!=null) {
			return String.valueOf(ws.getRow(row).getCell(col));
		}
		return "Please call readExcel Method First";
	}
	
	public int countData() {
		if(ws!=null) {
			return ws.getPhysicalNumberOfRows();
		}
		return 0;
	}
	
//	public static void main(String[] args) throws IOException {
//		Excel.readExcel(1);
//		System.out.println(Excel.countData());
//		String arr = Excel.getData(0, 1).replace("a", "");
//		System.out.println(arr);
//	}
}
