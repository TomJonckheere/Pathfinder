package be.pathfinder.dmhelper.pro;

import be.pathfinder.dmhelper.enums.DiceSides;
import be.pathfinder.dmhelper.model.Dice;

public class Dmhelper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		for(DiceSides diceSides : DiceSides.values()){
//			if(diceSides.getSides() != 0){
//				Dice dice = new Dice(diceSides);
//				dice.rollDice();
//				System.out.println(dice.toString());
//			}
//		}
		
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		int a5 = 0;
		int a6 = 0;
		
		Dice dice = new Dice(DiceSides.D6);
		for(int i = 0; i< 1000000000;i++){
			System.out.println("roll number: " + i);
			dice.rollDice();
			if(dice.getResult()==1){
				a1++;
			}else if (dice.getResult()==2) {
				a2++;
			}else if (dice.getResult()==3) {
				a3++;
			}else if (dice.getResult()==4) {
				a4++;
			}else if (dice.getResult()==5) {
				a5++;
			}else if (dice.getResult()==6) {
				a6++;
			}
		}
		System.out.println("a1: " + a1);
		System.out.println("a2: " + a2);
		System.out.println("a3: " + a3);
		System.out.println("a4: " + a4);
		System.out.println("a5: " + a5);
		System.out.println("a6: " + a6);
	}
}
