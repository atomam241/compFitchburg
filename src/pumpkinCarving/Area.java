package pumpkinCarving;

import java.util.Scanner;

public class Area {
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Side 1?");
		Double a = (double) kb.nextInt();
		System.out.print("Side 2?");
		Double b = (double) kb.nextInt();
		System.out.print("Side 3?");
		Double c = (double) kb.nextInt();
		
		Double s = (a + b + c)/2;
		if(s < a || s < b || s < c) {
			
			System.out.println("that is not a triangle");
			
		}else{
			
			Double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
			System.out.println("the area is: " + area);
			
		}
		kb.close();

	}
}
