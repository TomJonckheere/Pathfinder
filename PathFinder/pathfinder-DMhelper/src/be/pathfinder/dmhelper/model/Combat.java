package be.pathfinder.dmhelper.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import be.pathfinder.dmhelper.comparators.InitiativeComparator;

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
	 * Orders the combatans list based on the initiative in a descending order. All combatants 
	 */
	public void orderCombatantsList(){
		if(checkInitiatives()){
			Collections.sort(combatants, new InitiativeComparator());
			for(int i =0; i< combatants.size(); i++){
				combatants.get(i).setInitiativeRank(i+1);
			}
		}
	}


	/**
 	 * Adds the combatant to the combatants list. The addition of this combatants doesn't happen ordered on initiative...
 	 *
 	 * @param combatant the combatant
 	 */
 	public void addCharacter(Combatant combatant){
 		getCombatants().add(combatant);
	}
 	
 	private boolean checkInitiatives(){
 		if(this.combatants==null || this.combatants.isEmpty()){
 			return false;
 		}else{
 			for(Combatant combatant: combatants){
 				if(combatant.getInitiative() == null){
 					return false;
 				}
 			}
 		}
 		return true;
 	}
}
