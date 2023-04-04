package Loops;

import java.util.Iterator;

public class While_Loop {

	public static void main(String[] args) {
		int c = 150 ;
		int b =1;
		int a =0;
		while(a<10) {
			a++;
			System.out.println(a);
		}
		System.out.println("i itaration Complated");
		do {
			b+=5;
			System.out.println(b);
		}while(b<500);
		
		System.out.println("b itaration Complated");
     do {
	 if (c% 7 == 0) {
		 System.out.println(c);
	 }
		c ++;
	} while (c<=200);

	}}


