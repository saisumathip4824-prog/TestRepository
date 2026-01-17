package day29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		Properties propertiesobj = new Properties();
		propertiesobj.load(file);
		String url = propertiesobj.getProperty("appurl");
		String email = propertiesobj.getProperty("email");
		System.out.print(url+" "+email);
		file.close();
		

	}

}
