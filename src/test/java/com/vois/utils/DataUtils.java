package com.vois.utils;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	//create @dataProvider method invalidLoginData()
		@DataProvider
		public Object[][] invalidLoginData() {
			Object[][] data= new Object[2][3];   //2D array
			data[0][0]="john";
			data[0][1]="john123";
			data[0][2]="Invalid credentials";
			
			data[1][0]="saul";
			data[1][1]="saul123";
			data[1][2]="Invalid credentials";
			return data;
		} 

}
