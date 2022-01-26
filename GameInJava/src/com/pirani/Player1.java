package com.pirani;


public class Player1 {
    private String Name, Weapon;
    private int Health;

    public Player1(String name, String weapon, int health) {
        this.Name = name;
        this.Weapon = weapon;
        if(health< 0 || health >100)
        {
            this.Health=100;
        }
        else
        this.Health = health;
    }

    public void DamageByGun1() {
        this.Health -= 30;
        if (this.Health <= 0) {
            this.Health = 0;
        }
        System.out.println("Got Hit By Gun1 and Health is Reduced By 30" +" " +"New Health is " + this.Health);
        if (this.Health == 0) {
            System.out.println(Name()+" is Dead.");
        }
    }

    public void DamageByGun2() {
        this.Health -= 50;
        if (this.Health <= 0) {
            this.Health = 0;
        }
        System.out.println("Got Hit By Gun2 and Health is Reduced By 50" +" "+ "New Health is " + this.Health);
        if (this.Health == 0) {
            System.out.println(Name()+" is Dead.");
        }
    }
    public void heal()
    {
        if(this.Health==0)
        {
            System.out.println(Name()+" Is Dead, Heal is not possible");
        }
        else{
            this.Health=100;
            System.out.println("You are Healed, Be Careful Again");
        }
    }

    public String Name() {
        return Name;
    }

    public Player1 setName(String name) {
        Name = name;
        return this;
    }

    public String Weapon() {
        return Weapon;
    }

    public Player1 setWeapon(String weapon) {
        Weapon = weapon;
        return this;
    }

    public int Health() {
        return Health;
    }

    public Player1 setHealth(int health) {
        Health = health;
        return this;
    }
}

