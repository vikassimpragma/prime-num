package main.java.com.simpragma.primenumber;

import main.java.com.simpragma.primenumber.PrimeNum;

public class Main {
	public static void main(String[] args) {
		Integer i = 5;
		while (true) {
			PrimeNum p = new PrimeNum();
			System.out.println("isItPrime(" + i + ") returned " + p.isItPrime(i).toString());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
