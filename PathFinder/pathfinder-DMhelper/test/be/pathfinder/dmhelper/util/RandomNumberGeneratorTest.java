package be.pathfinder.dmhelper.util;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import static be.pathfinder.dmhelper.constants.Constants.*;
import static org.junit.Assert.assertThat;

public class RandomNumberGeneratorTest {

	@Test
	public void testCreateRandomInt(){
		//Min == 1 && max == 1 ==> 1
		assertThat(RandomNumberGenerator.createRandomInt(INT_ONE, INT_ONE), is(equalTo(INT_ONE)));
		
		int result = RandomNumberGenerator.createRandomInt(INT_ONE, INT_TWENTY);
	}
	
}
