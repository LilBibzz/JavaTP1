package com.example.rpglite;
public abstract class MecMagique extends Hero{
    public int reserveNen;

    public MecMagique(int pointDePv, int shieldArmure, int damageDeDegat, int reserveNen) {
        super(pointDePv, shieldArmure, damageDeDegat);
        this.reserveNen = reserveNen;
    }

    @Override public void fighterZ(Ennemy randomMerde){
        randomMerde.pointDePv -= this.damageDeDegat;
        this.reserveNen --;
    }
}

