package com.pirani;

public class Player2 extends Player1 {
    private int Health2;
    private Boolean Armour;

    public Player2(String name, String weapon, int health, Boolean armour) {
        super(name, weapon, health);
        Health2 = health;
        Armour = armour;
    }

    @Override
    public void DamageByGun1()
   {
       if(Armour) {
           this.Health2 -= 20;
           if (this.Health2 <= 0) {
               this.Health2 = 0;
           }
           System.out.println("Got Hit By Gun1 and Health is Reduced By 20" +" "+  "New Health is " + this.Health2);
       }
       if(!Armour)
       {
           this.Health2 -= 30;
           if (this.Health2 <= 0) {
               this.Health2= 0;
           }
           System.out.println("Got Hit By Gun1 and Health is Reduced By 30" +" "+  "New Health is " + this.Health2);
       }
           if(this.Health2==0)
           {
               System.out.println(Name()+" is Dead.");
           }

   }
   @Override
    public void DamageByGun2()
    {
        if(Armour) {
            this.Health2 -= 40;
            if (this.Health2 <= 0) {
                this.Health2 = 0;
            }
            System.out.println("Got Hit By Gun2 and Health is Reduced By 40" +" "+  "New Health is " + this.Health2);
        }
        if(!Armour)
        {
            this.Health2 -= 50;
            if (this.Health2 <= 0) {
                this.Health2 = 0;
            }
            System.out.println("Got Hit By Gun2 and Health is Reduced By 50" +" "+  "New Health is " + this.Health2);
        }
        if(this.Health2==0)
        {
            System.out.println(Name()+" is Dead.");
        }
    }

    @Override
    public void heal() {
        super.heal();
    }
}
