package be.pathfinder.dmhelper.model;

import be.pathfinder.dmhelper.constants.Constants;
import be.pathfinder.dmhelper.enums.DiceSides;
import be.pathfinder.dmhelper.util.RandomNumberGenerator;

// TODO: Auto-generated Javadoc
/**
 * The Class Dice represents a physical dice, it has a number of sides, a result and you can roll it.
 */
public class Dice {

	/** The dice sides. */
	private DiceSides diceSides;
	
	/** The result. */
	private int result;
	
	/**
	 * Instantiates a new dice.
	 *
	 * @param diceSides the dice sides
	 */
	public Dice(DiceSides diceSides){
		this.diceSides = diceSides;
	}
	
	/**
	 * Roll dice.
	 */
	public void rollDice(){
		assert diceSides != null;
		this.result = RandomNumberGenerator.createRandomInt(Constants.INT_ONE, diceSides.getSides());
	}
	
	/**
	 * Gets the result.
	 *
	 * @return the result
	 */
	public int getResult(){
		return result;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("Dice with ");
		sb.append(this.diceSides);
		sb.append(" sides, has a result of: ");
		sb.append(this.result);
		return sb.toString();
	}
}
