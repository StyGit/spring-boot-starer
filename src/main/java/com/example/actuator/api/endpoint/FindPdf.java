package com.example.actuator.api.endpoint;

import java.util.HashMap;
import java.util.Map;

public class FindPdf {

	public static void main(String[] args) {
		
		findPdf("1.pdf,2.doc,3.pdf,4.jpg,5.jpg,6.pdf,7.pdf,8.mp3,9.pdf","pdf");
	}

	private static void findPdf(String input,String extension) {
		String[] in=input.split(",");
		Map<String, String> map=new HashMap<>();
		for(String s:in)
		{
			String[] i=s.split("\\.");
			map.put(i[0], i[1]);
		}
		for (Map.Entry<String, String> entry : map.entrySet()) {
		   if(entry.getValue().equals(extension)) {
			System.out.print(entry.getKey()+"."+extension+"\t");
			//this is comment for checking
		}
	}
	}
}
	

