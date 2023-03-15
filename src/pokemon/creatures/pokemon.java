/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon.creatures;

import java.util.Scanner;
import pokemon.attacks.attack;

/**
 *
 * @author Andrew
 */
public class pokemon {
    private String name;
    private int hp;
    int IV;
    boolean playerControlled;
    attack[] atk = new attack[2];
    
    
    public pokemon(String name, int hp, int IV, boolean pc)
    {
        this.name = name;
        this.hp = hp;
        this.IV = IV;
        this.playerControlled = pc;
        this.atk[0] = new attack("Basic", 5);
        this.atk[1] = new attack("Power", 10);
    }
    
    public int attack()
    {
        int choice = 0;
        if(this.playerControlled)
        {
            for(int i = 1; i-1 < this.atk.length; i++)
            {
                System.out.println(i + ". " + atk[i-1].getName());
            }
        }
        
        Scanner scan = new Scanner(System.in);
        while(choice == 0)
        {
            try
            {
                choice = scan.nextInt();
                if(choice > 2 || choice < 1)
                {
                    System.out.println(choice + " is not a valid input");
                    choice = 0;
                }
            }catch(NumberFormatException e)
            {
                choice = 0;
                System.out.println(e);
            }
        }
        
        return atk[choice-1].getAttackValue(this.IV);
    }
    
    public boolean attacked(int attack)
    {
        if(attack > this.hp)
        {
            System.out.print(this.name + " is dead");
            return true;
        }else{
            this.hp -= attack;
            System.out.println(this.name + " has only " + this.hp + " left");
        }
        return false;
    }
}
