/**
 * 
 */
package sEdwardsExercise9;

/**
 * @author Shane Edwards 
 *         
 *         Due Date: 12/11/2022
 *         
 *         This program rolls 5 die 100,000 times and takes count of how many 
 *         times 3 or a kind, 4 of a kind, and 5 of a kind are rolled.
 *         
 *         This is my own work with the following exceptions: NONE
 *
 */
public class SEdwardsExercise9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dice[] fiveDie = {new Dice(), new Dice(), new Dice(), new Dice(), new Dice()};
		int threeOfAKind = 0;
		int fourOfAKind = 0;
		int fiveOfAKind = 0;
		
		for(int i = 1; i<= 100000; i++) {
			
			rollAllDie(fiveDie);
		
			if(isFiveOfAKind(fiveDie)) fiveOfAKind += 1;
			
			else if(isFourOfAKind(fiveDie)) fourOfAKind += 1;
			
			else if(isThreeOfAKind(fiveDie)) threeOfAKind += 1;
		}
		
		System.out.println("In 100,000 rolls, you rolled 3 of a kind " + threeOfAKind +
				" times, 4 of a kind " + fourOfAKind + " times, and 5 of a kind " + 
				fiveOfAKind + " times.");
		
	}
	
	private static boolean isThreeOfAKind(Dice[] fiveDie ) {
		int [] freq = new int [7];
		for(Dice die : fiveDie) {
			freq[die.getValue()] += 1;
		}
		for(int i = 0; i < freq.length; i++)
			if(freq[i] == 3)
				return true;
		return false;
		}
	
	private static boolean isFourOfAKind(Dice[] fiveDie) {
		int [] freq = new int [7];
		for(Dice die : fiveDie) {
			freq[die.getValue()] += 1;
		}
		for(int i = 0; i < freq.length; i++)
			if(freq[i] == 4)
				return true;
		return false;
		}
	
	private static boolean isFiveOfAKind(Dice[] fiveDie) {
		int [] freq = new int [7];
		for(Dice die : fiveDie) {
			freq[die.getValue()] += 1;
		}
		for(int i = 0; i < freq.length; i++)
			if(freq[i] == 5)
				return true;
		return false;
		}
	
	private static void rollAllDie(Dice[] fiveDie) {
		for(Dice die : fiveDie) die.rollDie();
	}
	}
	


