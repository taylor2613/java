package org.opentutorials.javatutorilas.eclipse;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class helloworld {
	private static String Address;
	private static URL url;
	private static BufferedReader br;
	private static HttpURLConnection conn;
	private static String protocol = "GET";
	
	public static void main(String[] args) throws Exception{
		Address = "http://www.myipaddress.com";
		url = new URL(Address);
		conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod(protocol);
		br= new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		String line;
		while((line = br.readLine()) != null) {
			//System.out.println(line);
			if(line.startsWith("<p><b>Your computer's IP address is: ")) {
				String ip = line.replace("<p><b>Your computer's IP address is: ", "").replace("</b>","");
				System.out.println(ip);
			}
			
		}
		br.close();
	}

}
