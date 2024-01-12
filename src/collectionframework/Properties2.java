package collectionframework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties2 {
	
	public static void main(String[] args) throws IOException {
		
		//FileInputStream fis=new FileInputStream("D:\\XTGlobal\\JavaTraining\\configuration.properties");
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\configuration.properties");
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String url=prop.getProperty("URL");
		
		System.out.println(url);
		
		System.out.println(prop.getProperty("username111","keynotfound"));
		
		
		
	}

}
