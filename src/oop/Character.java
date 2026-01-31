package oop;

public abstract class Character {
    String name;
    int hp;
    public Character(String name){
        this.name=name;
    }
    public abstract void attack();
    public void run(){
        System.out.println(this.name+"は逃げ出した");
    }
}
