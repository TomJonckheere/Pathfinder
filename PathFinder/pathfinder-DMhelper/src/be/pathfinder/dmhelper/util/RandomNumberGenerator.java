package be.pathfinder.dmhelper.util;

import java.util.Random;

// TODO: Auto-generated Javadoc
/**
 * The Class RandomNumberGenerator.
 */
public final class RandomNumberGenerator {

	/**
	 * Returns a pseudo-random number between min and max, inclusive.
	 * The difference between min and max can be at most
	 * <code>Integer.MAX_VALUE - 1</code>.
	 *
	 * @param min Minimum value
	 * @param max Maximum value.  Must be greater than min.
	 * @return Integer between min and max, inclusive.
	 * @see java.util.Random#nextInt(int)
	 */
	public static int createRandomInt(int min, int max){
		
		// nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
		return new Random().nextInt((max - min) + 1) + min;
	}
	
	/**
	 * Instantiates a new random number generator. This is a private constructor, so no instance can be created.
	 */
	private RandomNumberGenerator(){
		
	}
}
