package testAnt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimpleCalculationTest {
	SimpleCalulation sc=new SimpleCalulation();
	

	@Test
	public void testAdd() {
		int c=sc.Add(1, 2);
		assertEquals(3,c);
	}
	
	@Test
	public void testTimes(){
		int a=sc.times(2, 3);
		assertEquals(5,a);
	}

}
