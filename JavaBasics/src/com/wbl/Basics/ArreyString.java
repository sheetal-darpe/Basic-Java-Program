package com.wbl.Basics;

public class ArreyString {
	
	String str[] = { "Test1", "Test2", "Test3" };
	String conStr = str[0] + "," + str[1] + "," + str[2];

	public boolean compareStr(String inputString) {
		if (conStr.equals(inputString)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		ArreyString aStr = new ArreyString();

		boolean conStr = aStr.compareStr("Test1,Test2,Test3");

		System.out.println(conStr);

//syso

	}

}
