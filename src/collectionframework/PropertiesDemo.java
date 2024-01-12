package collectionframework;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) throws IOException {
		
		Properties p=new Properties();
		
		p.setProperty("username", "nagarjun.sdet@gmail.com");
		p.setProperty("password", "XTG$2342");
		
		
		p.store(new FileWriter("config.properties"), "Config file");
		
		
		
		
	}

}


/*
Properties:
============
setProperty

getProperty


*/