package be.pathfinder.dmhelper.model;

import java.util.List;

import be.pathfinder.dmhelper.enums.RollType;

/**
 * The Class Roll represents a roll. This includes the type of roll (attack, initiative,...), 
 * the dice(s) that is (are) required and the result of the roll.
 */
public class Roll {

	private RollType rollType;
	
	private List<Dice> dices;
	

	public Roll(RollType rollType, List<Dice> dices){
		this.rollType = rollType;
		this.dices = dices;
	}

	public RollType getRollType() {
		return rollType;
	}

	public List<Dice> getDices() {
		return dices;
	}

	/*
	 * Er moet een bonus bij komen (bv voor een critical, ini bonus, dam bonus, att bonus...) deze bonus 
	 * moet een vaste waarde kunnen zijn maar evengoed een nieuwe roll... (denk aan sneak attack ==> dam + 1d6)
	 * 
	 * Er moet ook een voorwaarde zijn die aangeeft wanneer de bonus moet toegepast worden... 
	 * bv bij damage bonus moet deze bijna altijd toegepast worden
	 * 
	 * 
	 * */
	
}
