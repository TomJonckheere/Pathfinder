package be.pathfinder.dmhelper.enums;

// TODO: Auto-generated Javadoc
/**
 * The Enum DiceSides.
 */
public enum DiceSides {

	/** The D0. This is used to indicate something went wrong... A dice with zero sides is returned. */
	D0(0),
	
	/** The D2. */
	D2(2),
	
	/** The D3. */
	D3(3),
	
	/** The D4. */
	D4(4),
	
	/** The D6. */
	D6(6),
	
	/** The D8. */
	D8(8),
	
	/** The D10. */
	D10(10),
	
	/** The D12. */
	D12(12),
	
	/** The D20. */
	D20(20),
	
	/** The D100. */
	D100(100);
	
	/** The sides. */
	private int sides;
	
	/**
	 * Instantiates a new dice sides.
	 *
	 * @param sides the sides
	 */
	private DiceSides(int sides){
		this.sides = sides;
	}
	
	/**
	 * Gets the dices sides.
	 *
	 * @param diceSides the dice sides
	 * @return the dices sides
	 */
	public static DiceSides getDicesSides(int diceSides){
		DiceSides ds = null;
		for(DiceSides diceS : DiceSides.values()){
			if(diceSides == diceS.sides){
				return ds;
			}
		}
		return D0;
	}
	
	/**
	 * Gets the sides. If 0 is returned, something went wrong.
	 *
	 * @return the sides
	 */
	public int getSides(){
		return this.sides;
	}
	
}
