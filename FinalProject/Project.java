package module_1;

import java.util.*;

/*
 * Author:  Randall Dexter
 * Date: 
 * 
 * Explanation:
 * 
*/
public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Card> deck = new ArrayList<Card>();
		Attack AttackTemp = new Attack();
		Shield ShieldTemp = new Shield();
		Draw DrawTemp = new Draw();
		for (int i = 0; i<=3;i++) {
			deck.add(AttackTemp);
			deck.add(ShieldTemp);
			deck.add(DrawTemp);
			
		}
		deck.add(AttackTemp);
		deck.add(AttackTemp);
		ArrayList<Card> discard = new ArrayList<Card>();
		ArrayList<Card> hand = new ArrayList<Card>();
		int handSize = 5;
		int energy = 3;
		int maxEnergy = 3;
		int gold = 0;
		
		while(true) {
			energy = maxEnergy;
			//if hand is not full then pick up cards till full
			if (hand.size()<handSize) {
				for (int i = hand.size(); i <handSize; i++) {
					//if out of cards in deck shuffle discard into deck
					if(deck.size()==0) {
						System.out.println("Shuffled discard into deck");
						for(Card card : discard) {
							deck.add(card);
						}
						discard.clear();
					}
					//pick random card then add it to hand
					int tempI = (int)(Math.random()*deck.size());
					hand.add(deck.get(tempI));
					deck.remove(tempI);	
				}
			}
			/*
			 * add enemy stuff here
			 */
			System.out.println("Gold: "+gold);
			System.out.println("Energy: "+energy+"/"+maxEnergy);
			CardUI(hand);
			System.out.print("What card would you like to use (0 to bring up help screen)");
			
			
			//int tempI = input.nextInt();
		}
	}
	public static void CardUI(ArrayList<Card> hand) {
		String tempS = "[     ]";
		for (int i = 0; i< hand.size(); i++) {
			System.out.printf(" %5s ","_____");
		}
		System.out.print("\n");
		for (int i = 0; i< hand.size(); i++) {
			tempS = "["+hand.get(i).amount+"    ]";
			if (hand.get(i) instanceof Shield) {
				tempS = "["+hand.get(i).amount+"___ ]";
			}
			else if (hand.get(i) instanceof Attack) {
				tempS = "["+hand.get(i).amount+"_|_ ]";
			}
			else if (hand.get(i) instanceof Draw) {
				tempS = "["+hand.get(i).amount+" _  ]";
			}
			System.out.printf("%5s", tempS);
		}
		System.out.print("\n");
		for (int i = 0; i< hand.size(); i++) {
			if (hand.get(i) instanceof Shield) {
				tempS = "[ (+) ]";
			}
			else if (hand.get(i) instanceof Attack) {
				tempS = "[  |  ]";
			}
			else if (hand.get(i) instanceof Draw) {
				tempS = "[ [ ] ]";
			}
			System.out.printf("%5s", tempS);
		}
		System.out.print("\n");
		for (int i = 0; i< hand.size(); i++) {
			if (hand.get(i) instanceof Shield) {
				tempS = "[ (_) ]";
			}
			else if (hand.get(i) instanceof Attack) {
				tempS = "[  |  ]";
			}
			else if (hand.get(i) instanceof Draw) {
				tempS = "[ [_] ]";
			}
			System.out.printf("%5s", tempS);
		}
		System.out.print("\n");
		for (int i = 0; i< hand.size(); i++) {
			System.out.printf("%5s", "[_____]");
		}
		System.out.println("\n");
	}	
}

class enemy{
	int health;
	int type;
	
}

//The abstract card class, just a way to make the hand work better
abstract class Card{
	int cost;
	int amount;
	abstract void Use();
	Card(){
		cost = 1;
	}
}
//The attack card
class Attack extends Card {
	public Attack(){
		amount = 4;
	}
	public Attack(int dam) {
		amount = dam;
	}
	public void Use() {
		System.out.print("Dealt "+amount+" Damage");
	}
}
//The draw card
class Draw extends Card{
	Draw() {
		amount = 2;
	}
	public void Use() {
		System.out.print("Drew "+amount+" Cards");
	}
	
}
//The shield card
class Shield extends Card{
	Shield(){
		amount = 3;
	}
	public void Use() {
		System.out.print("Added "+amount+" Shield");
	}
}
