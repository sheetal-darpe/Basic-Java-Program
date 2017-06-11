package com.wbl.Basics;

//import java.util.Scanner;

public class Fibonacii {

	public static void febonicii(int num) {

		int n1 = 0;
		int n2 = 1;

		System.out.println(n1 + "," + n2);

		for (int i = 2; i <= num; i++) {
			// Scanner scan = new Scanner(System.in);
			int temp = n1 + n2;
			System.out.println("," + temp);

			n1 = n2;
			n2 = temp;
		}

	}

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;

		System.out.print(n1 + "," + n2);
		//Scanner scan = new Scanner(System.in);
		for (int i = 2; i <= 7; i++) {
		
			int temp = n1 + n2;
			System.out.print("," + temp);

			n1 = n2;
			n2 = temp;
		}

	}

}
