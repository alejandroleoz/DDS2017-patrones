package ar.edu.utn.dds.singleton;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {


	@Test
	public void test() {
		String expected = "String de prueba";

		Logger logger1 = Logger.getInstance();
		Logger logger2 = Logger.getInstance();

		Assert.assertSame(logger1, logger2);

		logger1.setValue(expected);
		Assert.assertEquals(expected, logger1.getValue());
	}
}
