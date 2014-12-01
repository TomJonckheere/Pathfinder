package be.pathfinder.dmhelper.model;

// TODO: Auto-generated Javadoc
/**
 * The Class Combatant. This class represents a character in a fight.
 */
public class Combatant {

	/** The character. */
	private Character character;
	
	/** The initiative rank. Represents the rank in the initiative order.*/
	private Integer initiativeRank;
	
	/** The initiative. */
	private Integer initiative;
	
	/**
	 * Gets the initiative.
	 *
	 * @return the initiative
	 */
	public Integer getInitiative() {
		return initiative;
	}

	/**
	 * Sets the initiative.
	 *
	 * @param initiative the new initiative
	 */
	public void setInitiative(Integer initiative) {
		this.initiative = initiative;
	}

	/**
	 * Gets the character.
	 *
	 * @return the character
	 */
	public Character getCharacter() {
		return character;
	}

	/**
	 * Sets the character.
	 *
	 * @param character the new character
	 */
	public void setCharacter(Character character) {
		this.character = character;
	}

	/**
	 * Gets the initiative rank.
	 *
	 * @return the initiative rank
	 */
	public Integer getInitiativeRank() {
		return initiativeRank;
	}

	/**
	 * Sets the initiative rank.
	 *
	 * @param initiativeRank the new initiative rank
	 */
	public void setInitiativeRank(Integer initiativeRank) {
		this.initiativeRank = initiativeRank;
	}
	
	public boolean isHigherInInitiativeOrder(Combatant other){
		if(this.equals(other)){
			return false;
		}
		if(this.getInitiative() > other.getInitiative()){
			return true;
		}
		if(this.getInitiative() < other.getInitiative()){
			return false;
		}
		if(this.getInitiative() == other.getInitiative()){
			//NULL CHECKS
			if(this.getCharacter().getDexterity() == null && other.getCharacter().getDexterity() == null){
				return false;
			}
			if(this.getCharacter().getDexterity() != null && other.getCharacter().getDexterity() == null){
				return true;
			}
			if(this.getCharacter().getDexterity() == null && other.getCharacter().getDexterity() != null){
				return false;
			}
			
			//When the initiative is the same, compare the dexterity score
			if(this.getCharacter().getDexterity().getAbilityScore() == other.getCharacter().getDexterity().getAbilityScore()){
				return false;
			}
			if(this.getCharacter().getDexterity().getAbilityScore() > other.getCharacter().getDexterity().getAbilityScore()){
				return true;
			}
			if(this.getCharacter().getDexterity().getAbilityScore() < other.getCharacter().getDexterity().getAbilityScore()){
				return false;
			}
		}
		return false;
	}
}
