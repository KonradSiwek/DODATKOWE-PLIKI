package dodatki;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PobierzPlik {

	public static void main(String[] args) {
		try {
			URL url  = new URL("https://img-ovh-cloud.zszywka.pl/1/0091/5509-bialy-kon.jpg");
			
			 try(InputStream stream = url.openStream()) {
	   			 Files.copy(stream, Paths.get("obrazek.png"),
	   					 StandardCopyOption.REPLACE_EXISTING);
	   			 System.out.println("Gotowe");
	   		 }
	   	 } catch (MalformedURLException e) {
	   		 e.printStackTrace();
	   	 } catch (IOException e) {
	   		 e.printStackTrace();
	   	 }
	    }
	}


