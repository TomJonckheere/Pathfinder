package be.pathfinder.dmhelper.util;

import java.util.ArrayList;
import java.util.List;

import be.pathfinder.dmhelper.model.Combatant;

public final class CombatUtil {

	/**
	 * This method adds a combatant to the list of current combatants. The addition happens based on the initiative and rank in a descending order.
	 * 
	 * @param combatants the original list of Combatants
	 * @param combatant the combatant that will be added to the list
	 * @return the list of combatants with the combatant added
	 */
	public static List<Combatant> addCombatantToList(List<Combatant> combatants, Combatant combatant){
		List<Combatant> newList = new ArrayList<Combatant>();
		if(combatants == null || combatants.isEmpty()){
			newList.add(combatant);
		}else{
			//Add combatants with higher initiative to the list
			for(Combatant comb:combatants){
				if(!combatant.isHigherInInitiativeOrder(comb)){
					newList.add(combatant);
				}else{
					newList.add(combatant);
					break;
				}
			}
			//Add combatants with lower initiative to the list
			for(Combatant comb:combatants){
				if(!newList.contains(comb)){
					newList.add(comb);
				}
			}
		}
		refillRanks(newList);
		return newList;
	}
	
	/**
	 * 
	 * @param combatants the list of combatants whoms rank needs to be refilled
	 * @return the modified list of combatants.
	 */
	public static List<Combatant> refillRanks(List<Combatant> combatants){
		for(int i = 0; i<combatants.size();i++){
			combatants.get(i).setInitiativeRank(i+1);
		}
		return combatants;
	}
	
	
	private CombatUtil(){
		
	}
}
