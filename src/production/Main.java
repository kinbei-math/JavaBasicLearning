package production;

public class Main {
    public static void main(String[] args){
        ItemManager manager = new ItemManager();
        manager.addItem(new Item("K-0029", "ネジM3", 500, "締結部品"));
        manager.addItem(new Item("K-0030", "潤滑油", 1500, "消耗品"));
        manager.exportToCsv("output.csv");
    }
}
