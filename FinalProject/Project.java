package module_1;

import java.util.*;

/*
 * Author:  Randall Dexter
 * Date: 
 * 
 * Explanation:
 * 
*/
public class CardCatacombs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Card[] deck = new Card[10];
		List<Card> hand = new ArrayList<Card>();
		int handSize = 5;
		int gold = 0;
		
		
	}

}
class enemy{
	int health;
	int type;
	
}
abstract class Card{
	int cost;
	abstract void Use();
	Card(){
		cost = 1;
	}
}
class Attack extends Card {
	int damage;
	public Attack(){
		damage = 1;
	}
	public Attack(int dam) {
		damage = dam;
	}
	public void Use() {
		System.out.print("Dealt "+damage+" Damage");
	}
}
class Draw extends Card{
	int amount;
	public void Use() {
		System.out.print("Drew "+amount+" Cards");
	}
}
class Shield extends Card{
	int shieldAmmount;
	public void Use() {
		System.out.print("Added "+shieldAmmount+" Shield");
	}
}
