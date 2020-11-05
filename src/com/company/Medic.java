package com.company;

public class Medic extends Hero  implements  HavingSuperAbility{
    @Override
    public void usingSuperAbility() {
        System.out.println("Medic using:Healing ");
    }
}
