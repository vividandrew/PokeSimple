/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokemon;

import java.util.Scanner;
import java.util.HashMap;
import pokemon.creatures.pokemon;

public class Pokemon {
	
	
String chosenPoke = null;
String opponent = null;
	




	public static void adventure() {
		HashMap<String, String> pokemons = new HashMap <String, String>();
		pokemons.put("1", "Pikachu");
		pokemons.put("2", "FireDragon");		
		
		System.out.println("Choose your Pokemon: 1.Pickachu 2.FireDragon");
		
		Scanner poke = new Scanner(System.in);
		String chosenOne = poke.nextLine();
		
		System.out.println("You chosen: " + pokemons.get(chosenOne));
		


		

		
		
		if(chosenOne.equals("1"))
		{
		
			String chosenPoke = pokemons.get(chosenOne);
			String opponent = pokemons.get("2");
			
			System.out.println("Do you want to use Basic attack or Strong attack on " + opponent);
			
			Scanner attackScan = new Scanner(System.in);
			String isAttack = attackScan.nextLine();
			
			if(isAttack.equals("basic") || isAttack.equals("strong"))
			{
				System.out.println("You have made " + opponent + " unconscious");
				System.out.println("Do you want to capture " + opponent + " to your pokeball yes or no");
				
				Scanner captureScan = new Scanner(System.in);
				String isCapture = attackScan.nextLine();
				
				if(isCapture.equals("yes"))
				{
					System.out.println("Well done you have captured " + opponent + " to your pokeball");
				}
				else {
					System.out.println("Goodbye enjoy your adventure");
				}
			}
			
			
		}
		else {
			String chosenPoke = pokemons.get(chosenOne);
			String opponent = pokemons.get("1");
			
			System.out.println("Do you want to use Basic attack or Strong attack on " + opponent);
			
			Scanner attackScan = new Scanner(System.in);
			String isAttack = attackScan.nextLine();
			
			if(isAttack.equals("basic") || isAttack.equals("strong"))
			{
				System.out.println("You have made " + opponent + " unconscious");
				System.out.println("Do you want to capture " + opponent + " to your pokeball yes or no");
				
				Scanner captureScan = new Scanner(System.in);
				String isCapture = attackScan.nextLine();
				
				if(isCapture.equals("yes"))
				{
					System.out.println("Well done you have captured " + opponent + " to your pokeball");
				}
				else {
					System.out.println("Goodbye enjoy your adventure");
				}
			}

		}
		
		
	
		
	}

	

	public static void test()
        {
            pokemon pkm1 = new pokemon("Pikachu", 110, 16, true);
            pokemon pkm2 = new pokemon("Charmander", 200, 31, true);
            boolean winner = false;
            
            while(!winner)
            {
                winner = pkm2.attacked(pkm1.attack());
                if(winner){break;}
                winner = pkm1.attacked(pkm1.attack());
            }
            System.out.print("Win!");
        }
	
	public static void main (String[] args)
	{
            test();
		//adventure();
	}
	
	
}