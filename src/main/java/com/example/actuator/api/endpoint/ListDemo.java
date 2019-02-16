package com.example.actuator.api.endpoint;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		int n = 1;
		for (int i = 1; i <= 10; i++) {
			l.add("satya" + i);
		}
		System.out.println(l.get(6));
		Iterator<String> itr = l.iterator();
		while (n<=6) {
			System.out.println("ListDemo.main()");
				System.out.println(itr.next());
				n++;
			}

		}
	}

