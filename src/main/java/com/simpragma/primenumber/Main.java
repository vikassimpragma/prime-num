package main.java.com.simpragma.primenumber;

import main.java.com.simpragma.primenumber.PrimeNum;

public class Main {
	public static void main(String[] args) {
		Integer i = 5;
		PrimeNum p = new PrimeNum();
		System.out.println(p.isItPrime(i).toString());
	}
}
