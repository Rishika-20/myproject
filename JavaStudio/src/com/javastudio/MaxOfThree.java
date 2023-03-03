package com.javastudio;

public class MaxOfThree {

	public static void main(String[] args) {
		
            int a = 12;
            int b = 15;
            int c = 20;
            int max;
            
            max = (a > c) ? (a > b ? a : c) : (b > c ? b : c);
            System.out.println("Maximum of three numbers is "+max);
	}

}
