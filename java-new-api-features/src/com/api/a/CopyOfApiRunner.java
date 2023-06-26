package com.api.a;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ho");
		names.add("Ho2");
		names.add("Ho3");
		doNotChange(names);
		System.out.println(names);
	}

	private static void doNotChange(List<String> names) {
		// TODO Auto-generated method stub
		names.add("ShouldNotbeAllowed");
	}
}
