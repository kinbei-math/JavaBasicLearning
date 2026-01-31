package oop;

public class SuperHero extends Hero{
    public SuperHero(String name){
        super(name); //親(oop.Hero)のコンストラクタを呼び出す呪文
    }
    public void fly(){
        System.out.println(this.getName()+"は空を飛んだ！");
    }

    @Override
    public void slip(){
        System.out.println(this.getName()+"は転びそうになったが、空を飛んで体勢を立て直した！");
    }
}
