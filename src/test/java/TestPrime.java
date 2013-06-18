package test.java;

import org.junit.Assert;

import java.util.List;

import main.java.com.simpragma.primenumber.PrimeNum;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestPrime {

	@Test
	public void test() {
		PrimeNum systemUnderTest = mock(PrimeNum.class);
		PrimeNum pn = new PrimeNum();
		stub(systemUnderTest.isItPrime(5)).toReturn(true);
		Boolean ret = systemUnderTest.isItPrime(5);
		Assert.assertEquals(true, ret);
		verify(systemUnderTest).isItPrime(5);
		
	}

}
