package com;

import general.Numbers;
import general.Strings;

public class Head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Strings s = new Strings();
		Numbers n = new Numbers();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
		s.reverse("Girish Mrudula");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
		s.revWords("Let's see the example to reverse each word in a string.");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
		s.fibo(20);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
		s.isPrime(28);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
		s.charreplace("abcdafgbcacbca");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
		//s.getbiggestnum("457230");
		
		s.dupchar("abcdafgbcacbca");
		
		//n.IsPrime(499);
		
	}

}
