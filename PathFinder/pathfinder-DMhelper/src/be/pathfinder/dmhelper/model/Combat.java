package be.pathfinder.dmhelper.model;

import java.util.ArrayList;
import java.util.List;

import be.pathfinder.dmhelper.util.CombatUtil;

// TODO: Auto-generated Javadoc
/**
 * The Class Combat.
 */
public class Combat {
	
	/** The rounds. */
	private int rounds;

	 /** The combatants. */
 	private List<Combatant> combatants;
 	
	 
	 /**
 	 * Gets the rounds.
 	 *
 	 * @return the rounds
 	 */
 	public int getRounds() {
		return rounds;
	}


	/**
	 * Sets the rounds.
	 *
	 * @param rounds the new rounds
	 */
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}


	/**
	 * Gets the combatants.
	 *
	 * @return the combatants
	 */
	public List<Combatant> getCombatants() {
		if(combatants == null){
			combatants = new ArrayList<>();			
		}
		return combatants;
	}


	/**
	 * Sets the combatants.
	 *
	 * @param combatants the new combatants
	 */
	public void setCombatants(List<Combatant> combatants) {
		this.combatants = combatants;
	}

	/**
 	 * Adds the combatant to the combatants list. The addition of this combatants will happen ordered on initiative. 
 	 *
 	 * @param combatant the combatant
 	 */
 	public void addCombatant(Combatant combatant){
 		this.combatants = CombatUtil.addCombatantToList(combatants, combatant);
	}
}
