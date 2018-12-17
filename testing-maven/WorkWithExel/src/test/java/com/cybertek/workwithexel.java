package com.cybertek;

public class workwithexel {

	public static void main(String[] args) {
		String path="/Users/fd/Desktop/data.xlsx";
		
		Xls_Reader data=new Xls_Reader (path);

		int rowCount=data.getRowCount("data");
		System.out.println(rowCount);
		
		String cdata=data.getCellData("data", "name", 2);
		System.out.println(cdata);
		
		int columnCount=data.getColumnCount("data");
		System.out.println(columnCount);
		
		data.setCellData("data", "name", 8, "Ozzy");
		
	}

}
