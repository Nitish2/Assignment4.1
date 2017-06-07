package LargestNumber;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		int a = in.nextInt();

		System.out.println("Enter the second number: ");
		int b = in.nextInt();

		System.out.println("Enter the third number: ");
		int c = in.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println("Greatest number is " + a);
			} else {
				System.out.println("Greatest number is " + c);
			}

		} else {
			if (b > c) {

				System.out.println("Greatest number is " + b);
			}
			else{
				System.out.println("Greatest number is " + c);
			}
			}
		}

	}

