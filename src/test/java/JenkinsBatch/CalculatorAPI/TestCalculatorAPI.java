package JenkinsBatch.CalculatorAPI;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCalculatorAPI {
	
	CalculatorAPI c;
	
	int result;
	
	@BeforeClass
	public void startTest() {
		c = new CalculatorAPI();
	}
	
	@BeforeMethod
	public void initResult() {
		result = 0;
	}
	
	@Test(priority=1)
	public void testAdditionWithPositiveValues() {
		result = c.addition(20, 30);
		Assert.assertEquals(50, result, "Addition function working for positive values");
	}
	
	@Test(priority=2)
	public void testAdditionWithNegativeValues() {
		result = c.addition(-20, -30);
		Assert.assertEquals(-50, result, "Addition function working for negative values");
	}
	
	

}
