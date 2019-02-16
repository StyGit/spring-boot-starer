package com.example.actuator.api.endpoint;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			l.add("satya" + i);
		}
		
		Iterator<String> itr = l.iterator();
		
		/*for (int n = 1; n <= 6; n++) {
			System.out.print(itr.next() + "\t");
		}*/
		

	}
}
