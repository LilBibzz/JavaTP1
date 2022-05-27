package com.example.rpglite;
public abstract class Ennemy {
    public int pointDePv;
    public int damageDeDegat;

    public Ennemy(int pointDePv, int damageDeDegat) {
        this.pointDePv = pointDePv;
        this.damageDeDegat = damageDeDegat;
    }
    public void fighterZ(Hero chaperon){
        if(chaperon.boucliax == false){
            chaperon.pointDePv -= this.damageDeDegat;
        }
        else{
            chaperon.boucliax = false;
        }
    }
}
