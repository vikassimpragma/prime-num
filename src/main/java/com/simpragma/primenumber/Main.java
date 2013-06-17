package main.java.com.simpragma.primenumber;

import java.util.Collection;
import java.util.HashSet;

import main.java.com.simpragma.primenumber.PrimeNum;
import com.google.common.collect.*;

public class Main {
	public static void main(String[] args) {
		Multiset<String> wordsMultiset = HashMultiset.create();
		Collection<String> words = new HashSet<String>();
		words.add("Sunday");words.add("Monday");
		wordsMultiset.addAll(words);
		Integer i = 5;
		while (true) {
			PrimeNum p = new PrimeNum();
			System.out.println("isItPrime(" + i + ") returned " + p.isItPrime(i).toString());
			System.out.println("guava "+wordsMultiset.count(java.lang.Object.class));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
