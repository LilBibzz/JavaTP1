package com.example.rpglite;
public class LaPopote {
    public void reVivall(Hero inFight){
        if (inFight.getClass().getName()=="WarriorDeCombat"){
            inFight.pointDePv += (99 - inFight.pointDePv);
            inFight.shieldArmure += (5 - inFight.shieldArmure);
        }
        else if(inFight.getClass().getName()=="HunterDeHunter"){
            inFight.pointDePv += (70 - inFight.pointDePv);
            inFight.shieldArmure += (3 - inFight.shieldArmure);
        }
        else if(inFight.getClass().getName()=="MerlinMagie"){
            inFight.pointDePv += (75 - inFight.pointDePv);
        }
        else if(inFight.getClass().getName()=="LaCroixRouge"){
            inFight.pointDePv += (70 - inFight.pointDePv);
            inFight.shieldArmure += (2 - inFight.shieldArmure);
        }
    }
}
