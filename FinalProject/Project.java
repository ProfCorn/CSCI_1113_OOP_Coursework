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
		enemy Enemy = new enemy();
		player Player = new player();
		for (int i = 0; i<=3;i++) {
			deck.add(AttackTemp);
			deck.add(ShieldTemp);	
		}
		deck.add(DrawTemp);
		deck.add(DrawTemp);
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
			Player.shield = 0;
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
			//Enemy Stuff
			
			System.out.println("Enemy Health: "+Enemy.health);
			System.out.println("Enemy Attack Damage: "+Enemy.attackDamage);
			
			
			
			//Player Stuff
			
			System.out.println("Health: "+Player.health);
			System.out.println("Shield: "+Player.shield);
			System.out.println("Gold: "+gold);
			System.out.println("Energy: "+energy+"/"+maxEnergy);
			CardUI(hand);
			System.out.print("What card would you like to use (0 to bring up help screen): ");
			//Grabs choice
			int tempI = input.nextInt();
			input.nextLine();
			
			if (tempI == 0) {
				System.out.println("This is the help screen, here we will go over the basics\n");
				System.out.println("Gold: "+gold+" <-- This is your gold, you get gold from killing enemies and you can spend it on upgrades in the shop\n");
				System.out.println("Energy: "+energy+"/"+maxEnergy+" <-- This is your energy, the amount of energy you have left is on the left and your total energy is on the right");
				System.out.println("Energy is used to play cards\n");
				CardUI(hand);
				System.out.println("This is your hand, here you see what cards you can play");
				System.out.println("The number on the left is the energy cost while the number on the right is the amount of the action that is applied\n\n");
				
				CardUI(AttackTemp);
				System.out.println("This is the Attack card, play this card to deal 4 damage to the enemy");
				CardUI(ShieldTemp);
				System.out.println("This is the Shield card, play this card to Add 3 shield to yourself");
				System.out.println("Shield decays each turn");
				CardUI(DrawTemp);
				System.out.println("This is the draw card, play this card to draw 2 extra cards");
				
				System.out.println("(click enter to continue)");
				String StrTemp = input.nextLine();
			}
			else {
				hand.get(tempI-1).Use(deck, discard, hand, Enemy, Player);
				discard.add(hand.get(tempI-1));
				hand.remove(tempI-1);
			}
				
			
		}
	}
	private static void CardUI(Card card) {
		// TODO Auto-generated method stub
		String tempS = "[     ]";
		
		System.out.printf(" %5s ","_____");
		
		System.out.print("\n");
		
		tempS = "["+card.amount+"    ]";
		if (card instanceof Shield) {
			tempS = "[1___"+card.amount+"]";
		}
		else if (card instanceof Attack) {
			tempS = "[1_|_"+card.amount+"]";
		}
		else if (card instanceof Draw) {
			tempS = "[1 _ "+card.amount+"]";
		}
		System.out.printf("%5s", tempS);
		
		System.out.print("\n");
		
		if (card instanceof Shield) {
			tempS = "[ (+) ]";
		}
		else if (card instanceof Attack) {
			tempS = "[  |  ]";
		}
		else if (card instanceof Draw) {
			tempS = "[ [ ] ]";
		}
		System.out.printf("%5s", tempS);
	
		System.out.print("\n");
		
		if (card instanceof Shield) {
			tempS = "[ (_) ]";
		}
		else if (card instanceof Attack) {
			tempS = "[  |  ]";
		}
		else if (card instanceof Draw) {
			tempS = "[ [_] ]";
		}
		System.out.printf("%5s", tempS);
		
		System.out.print("\n");
		
		System.out.printf("%5s", "[_____]");
		
		System.out.println("\n");
	}	
	
	public static void CardUI(ArrayList<Card> hand) {
		//outputs the graphics for the Cards in hand
		String tempS = "[     ]";
		for (int i = 0; i< hand.size(); i++) {
			System.out.printf(" %5s ","_____");
		}
		System.out.print("\n");
		for (int i = 0; i< hand.size(); i++) {
			tempS = "["+hand.get(i).amount+"    ]";
			if (hand.get(i) instanceof Shield) {
				tempS = "[1___"+hand.get(i).amount+"]";
			}
			else if (hand.get(i) instanceof Attack) {
				tempS = "[1_|_"+hand.get(i).amount+"]";
			}
			else if (hand.get(i) instanceof Draw) {
				tempS = "[1 _ "+hand.get(i).amount+"]";
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
	int attackType;
	int attackDamage;
	
}
class player{
	int health;
	int shield;
}

//The abstract card class, just a way to make the hand work better
abstract class Card{
	int cost;
	int amount;
	abstract void Use(ArrayList<Card> deck, ArrayList<Card> discard, ArrayList<Card> hand, enemy Enemy, player Player);
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
	public void Use(ArrayList<Card> deck, ArrayList<Card> discard, ArrayList<Card> hand, enemy Enemy, player Player) {
		Enemy.health = Enemy.health - amount;
		System.out.println("Delt "+amount+" Damage\n");
	}
}
//The draw card
class Draw extends Card{
	Draw() {
		amount = 2;
	}
	public void Use(ArrayList<Card> deck, ArrayList<Card> discard, ArrayList<Card> hand, enemy Enemy, player Player) {
		for (int i = 0; i <2; i++) {
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
		System.out.println("Drew "+amount+" Cards\n");
		
	}
	
}
//The shield card
class Shield extends Card{
	Shield(){
		amount = 3;
	}
	public void Use(ArrayList<Card> deck, ArrayList<Card> discard, ArrayList<Card> hand, enemy Enemy, player Player) {
		
		System.out.println("Added "+amount+" Shield\n");
		Player.shield = Player.shield + amount;
	}
}
