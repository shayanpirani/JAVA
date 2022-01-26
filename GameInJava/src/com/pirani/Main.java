package com.pirani;

public class Main {

    public static void main(String[] args) {
    Player1 Player=new Player1("shayan","Sword",1000);
     // System.out.println(Player.Name());
       // System.out.println(Player.Weapon());
        //System.out.println(Player.Health());
        Player.DamageByGun1();
        Player.DamageByGun1();
        Player.heal();
        Player.DamageByGun2();
        Player.DamageByGun2();
        Player.heal();

       // Player2 BetterPlayer=new Player2("hassan","Gun",100,false);
        //BetterPlayer.DamageByGun1();
        //BetterPlayer.DamageByGun2();
        //BetterPlayer.DamageByGun2();
    }
}
