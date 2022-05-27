package com.example.rpglite;
public class HenterDeHunter extends Hero{

    public int sacDeFleche;

    public HenterDeHunter() {
        super(70, 3, 20);
        this.sacDeFleche = 25;

    }
    @Override public void fighterZ(Ennemy randomMerde){

        randomMerde.pointDePv -= this.damageDeDegat;
        this.sacDeFleche --;
    }
}
