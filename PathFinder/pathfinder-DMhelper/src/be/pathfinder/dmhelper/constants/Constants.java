package be.pathfinder.dmhelper.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * The Class Constants. This is a collection of all the constants used in the pathfinder DMhelper
 */
public final class Constants {
	
	static{
		Map<Integer, Integer> am = new HashMap<>();
		am.put(0, -5);
		am.put(1, -5);
		am.put(2, -4);
		am.put(3, -4);
		am.put(4, -3);
		am.put(5, -3);
		am.put(6, -2);
		am.put(7, -2);
		am.put(8, -1);
		am.put(9, -1);
		am.put(10, 0);
		am.put(11, 0);
		am.put(12, 1);
		am.put(13, 1);
		am.put(14, 2);
		am.put(15, 2);
		am.put(16, 3);
		am.put(17, 3);
		am.put(18, 4);
		am.put(19, 4);
		am.put(20, 5);
		am.put(21, 5);
		am.put(22, 6);
		am.put(23, 6);
		am.put(24, 7);
		am.put(25, 7);
		am.put(26, 8);
		am.put(27, 8);
		am.put(28, 9);
		am.put(29, 9);
		am.put(30, 10);
		abilityModifiers = Collections.unmodifiableMap(am);
	}

	//MAP FOR ABILITY MODIFIERS
	/** The Constant abilityModifiers. */
	public static final Map<Integer, Integer> abilityModifiers;
	
	//INTEGERS
	
	/** The Constant INT_ZERO. */
	public static final int INT_ZERO = 0;
	
	/** The Constant INT_ONE. */
	public static final int INT_ONE = 1;
	
	/** The Constant INT_TWO. */
	public static final int INT_TWO = 2;
	
	/** The Constant INT_THREE. */
	public static final int INT_THREE = 3;
	
	/** The Constant INT_FOUR. */
	public static final int INT_FOUR = 4;
	
	/** The Constant INT_FIVE. */
	public static final int INT_FIVE = 5;
	
	/** The Constant INT_TEN. */
	public static final int INT_TEN = 10;
	
	/** The Constant INT_TWENTY. */
	public static final int INT_TWENTY = 20;
	
	//STRING
	
}
