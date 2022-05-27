package com.example.rpglite;
import java.util.ArrayList;
import java.util.List;


public abstract class Hero {
    public int pointDePv;
    public int shieldArmure;
    public boolean boucliax = false;
    public int damageDeDegat;
    public List<LaPopote> nbPotions = new ArrayList<LaPopote>();
    public List<LaGraillance> LaGraillance = new ArrayList<LaGraillance>();

    public Hero(int pointDePv, int shieldArmure, int damageDeDegat) {
        this.pointDePv = pointDePv;
        this.shieldArmure = shieldArmure;
        this.damageDeDegat = damageDeDegat;
    }
    public void fighterZ(Ennemy randomMerde){

        randomMerde.pointDePv -= this.damageDeDegat;
    }
    public void defensive(){
        this.shieldArmure --;
        this.boucliax = true;

    }
}
