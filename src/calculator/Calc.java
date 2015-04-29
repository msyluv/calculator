package calculator;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		
		int a, b, c;
		char op = 0;
		a=10;
		b=5;
		c=0;
		
		Scanner s = new Scanner(System.in);
		op = s.next().charAt(0);
		
		switch(op){
			case'+':
				c=a+b;
				break;
			case'-':
				c=a-b;
				break;
			case'*':
				c=a*b;
				break;
			case'/':
				c=a/b;
				break;
		}
		
		System.out.println(c);
		
		
	}
}
