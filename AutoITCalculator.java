package Selenium.basic.start;

import java.io.IOException;

public class AutoITCalculator {

	public static void main(String[] args) throws IOException {
		
		try {
			Runtime process=Runtime.getRuntime();
			process.exec("D://AutoIT//firstscreeptAuto.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
