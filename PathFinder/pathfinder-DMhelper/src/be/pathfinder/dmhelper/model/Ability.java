package be.pathfinder.dmhelper.model;

import be.pathfinder.dmhelper.constants.Constants;
import be.pathfinder.dmhelper.enums.AbilityName;

// TODO: Auto-generated Javadoc
/**
 * The Class AbilityScore.
 */
public class Ability {

	/** The ability score. */
	private int abilityScore;
	
	/** The ability name. */
	private AbilityName abilityName;
	
	/** The ability modifier. */
	private int abilityModifier;
	
	public Ability(int abilityScore, AbilityName abilityName){
		this.abilityScore = abilityScore;
		this.abilityName = abilityName;
		this.abilityModifier = Constants.abilityModifiers.get(this.abilityScore);
	}
	
	/**
	 * Gets the ability score.
	 *
	 * @return the ability score
	 */
	public int getAbilityScore() {
		return abilityScore;
	}

	/**
	 * Sets the ability score.
	 *
	 * @param abilityScore the new ability score
	 */
	public void setAbilityScore(int abilityScore) {
		this.abilityScore = abilityScore;
	}

	
	/**
	 * Gets the ability name.
	 *
	 * @return the ability name
	 */
	public AbilityName getAbilityName() {
		return abilityName;
	}

	/**
	 * Gets the ability modifier.
	 *
	 * @return the ability modifier
	 */
	public int getAbilityModifier() {
		return abilityModifier;
	}

	/**
	 * Sets the ability modifier.
	 *
	 * @param abilityModifier the new ability modifier
	 */
	public void setAbilityModifier(int abilityModifier) {
		this.abilityModifier = abilityModifier;
	}
}
