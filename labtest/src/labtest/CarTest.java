package labtest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CarTest {

	Car Mycar;
	@Before
	public void setUp() throws Exception {
		
		Mycar=new Car("Swift",1300,35);
	}

	@Test
	public void testGetCapacity() {
		//fail("Not yet implemented");
		int cap = Mycar.getCapacity();
		assertEquals(1300,cap);
		
	}

	@Test
	public void testLowerfuel() {
		//fail("Not yet implemented");
		Mycar.lowerfuel(5);
		assertEquals(30,Mycar.getFuelcap());		
	}

}
