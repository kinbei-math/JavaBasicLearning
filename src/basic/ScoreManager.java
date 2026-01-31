package basic;

import  java.util.Scanner;
public class ScoreManager {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("受験者数を入力してください：");
        int num = scanner.nextInt();
        int[] scores =new int[num];
        double sum=0;
        int max =0;
        for (int i=0;i<scores.length;i++){
            System.out.println((i+1)+"人目の点数を入力してください；");
            scores[i]=scanner.nextInt();
            sum+=scores[i];
            if(max<scores[i]){
                max=scores[i];
            }
        }
        System.out.println("--- 集計結果 ---");
        System.out.println("平均点："+(sum/num)+"点");
        System.out.println("最高点："+max+"点");

    }
}
