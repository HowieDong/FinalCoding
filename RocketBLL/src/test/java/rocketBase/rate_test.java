package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;


public class rate_test {

	//TODO - RocketBLL rate_test
	//		Check to see if a known credit score returns a known interest rate
	@Test
	public void testRate() throws RateException {
		
			double rate = RateBLL.getRate(600);
			assertTrue(rate == 5);

			double rate2 = RateBLL.getRate(650);
			assertTrue(rate2 == 4.5);
		
	}
	

	//TODO - RocketBLL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score
	@Test
	public void testRateException() throws RateException {
		
			double rate = RateBLL.getRate(400);
			assertTrue(rate == 0);
	}

}
