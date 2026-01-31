package oop;

public class Hero extends Character implements Human {
    private int attack;
    public Hero(String name){
        super(name);
        this.hp=100;
    }
    public String getName(){
        return this.name;
    }
    public int getHp(){
        return  this.hp;
    }
    public void sleep(){
        System.out.println(this.name+"は眠って回復した！");
        this.hp=100;
    }
    public void sit(int sec){
        System.out.println(this.name+"は"+sec+"秒座った。");
        this.hp+=sec;
    }
    public void slip() {
        System.out.println(this.name + "は転んだ！");
        this.hp -= 5;
    }
    @Override
    public void attack(){
        System.out.println(this.name+"は剣で攻撃した！");
    }

    @Override
    public void talk(){
        System.out.println(this.name+"は会話した");
    }

    @Override
    public void watch(){
        System.out.println(this.name+"は辺りを見回した");
    }
}
