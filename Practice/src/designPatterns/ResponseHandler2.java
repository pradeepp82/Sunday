package designPatterns;

import java.util.Observable;
import java.util.Observer;

public class ResponseHandler2 implements Observer {
	private String resp;  
	@Override
	public void update(Observable o, Object arg) {
	 
		  if (arg instanceof String) {  
	            resp = (String) arg;  
	            System.out.println("\nReceived Response: " + resp );  
	        }  
	}

}
