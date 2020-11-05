package com.company;

public class Main {
    public static void main(String[] args) {
     Warrior warrior = new Warrior();
     Medic medic= new Medic();
     Magic magic = new Magic();
     warrior.usingSuperAbility();
     medic.usingSuperAbility();
     magic.usingSuperAbility();

     String jj[]={" " + warrior+ " " + magic+" "+medic+" "};



            System.out.println(jj.length);

        }


    }

