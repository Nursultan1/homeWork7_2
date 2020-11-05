package com.company;

public abstract class Hero  {
   private int damage;
   private int health;
   private String criticalAttack;

    public String getCriticalAttack() {
        return criticalAttack;
    }

    public void setCriticalAttack(String criticalAttack) {
        this.criticalAttack = criticalAttack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
