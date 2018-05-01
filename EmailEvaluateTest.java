import static org.junit.Assert.*;

import org.junit.Test;

public class EmailEvaluateTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		//mgarcia.com.mx 
		//mgarcia@.com.mx 
		//mgarcia@gmail.com
		//mgarcia@gmail.com.mx
		//mgarcia@@.com
		EmailEvaluate emailEvaluate  = new EmailEvaluate();
		boolean email = emailEvaluate.validate("mgarcia@@.com");
		System.out.println("Resultado de la prueba "+email);
		  assertEquals(true, email);
	}

}
