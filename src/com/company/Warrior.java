package com.company;

public class Warrior extends Hero implements HavingSuperAbility {

    @Override
    public void usingSuperAbility() {
        System.out.println("Warrior using:\n" + "increased damage");
    }
}
