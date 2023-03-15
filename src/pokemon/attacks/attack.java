/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon.attacks;

import java.util.Random;

/**
 *
 * @author Andrew
 */
public class attack {
    private String name;
    private int basePower;
    
    public attack(String name, int basePower)
    {
        this.name = name;
        this.basePower = basePower;
    }
    
    public int getAttackValue(int IV)
    {
        Random ran = new Random();
        int attackPower = basePower * (ran.nextInt(IV-5, IV));
        return attackPower;
    }
    
    public String getName()
    {
        return this.name;
    }
}
