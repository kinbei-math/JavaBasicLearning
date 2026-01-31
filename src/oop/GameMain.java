package oop;

public class GameMain {
    public static void main(String[] args){

        /*課題13
        HashMap<String ,Integer> items= new HashMap<>();
        items.put("薬草",50);
        items.put("聖水",10);
        System.out.println("薬草を使った！");
        items.put("薬草",items.get("薬草")-1);
        System.out.println("現在の薬草の数："+items.get("薬草")+"個");
        */

        /* items.keySet() で "薬草", "聖水" というラベルの束が取れる
        for (String key : items.keySet()) {
            int value = items.get(key); // ラベルを使って中身を取る
            System.out.println(key + "の在庫：" + value);
        }
        */

        /*課題12
        oop.Hero h = new oop.Hero("ミナト");
        h.talk();
        h.watch();
        */

        /*課題11
        oop.Hero h =new oop.Hero("ミナト");
        h.run();
        h.attack();
        */
        /*課題10
        ArrayList<oop.Hero> party =new ArrayList<>();
        party.add(new oop.Hero("ミナト"));
        party.add(new oop.SuperHero("アサカ"));
        party.add(new oop.Hero("シン"));

        for(int i=0;i<party.size();i++){
            System.out.println("勇者"+party.get(i).getName()+"のHPは"+party.get(i).getHp()+"です");
        }
        for(int i=0;i<party.size();i++){
            party.get(i).slip();
        }
        */

        /*課題9
        oop.Hero[] party=new oop.Hero[2];
        party[0]=new oop.Hero("ミナト");
        party[1]=new oop.SuperHero("アサカ");

        for(int i=0;i<party.length;i++){
            party[i].slip();
        }*/

        /*課題7,8
        oop.Hero h1 =new oop.Hero("ミナト"); //勇者誕生1
        oop.Hero h2 =new oop.Hero("アサカ"); //勇者誕生2
        */
        //h.attack=5; // attackを設定

        /*課題7
        //oop.SuperHero h3= new oop.SuperHero("スーパーミナト");
        //h3.fly();
        //h3.sleep();
        //h3.slip();
        */

        /*課題6,7
        //h.slip(); //勇者が転ぶ
        //h.sit(25); //勇者を座らせる
        //h.sleep(); //勇者を眠らせる

        //System.out.println("現在のHPは"+h.hp+"です");

        //System.out.println("「勇者"+h1.getName()+"のHPは"+h1.getHp()+"です」");
        //System.out.println("「勇者"+h2.getName()+"のHPは"+h2.getHp()+"です」");
         */
    }
}
