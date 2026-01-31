package basic;

import java.util.Scanner;
public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("身長(cm)を入力してください：");
        double height = scanner.nextDouble()/100;
        System.out.println("体重(kg)を入力してください：");
        double weight = scanner.nextDouble();
        double BMI = weight/(height*height);

        if (BMI>=26.5){
            System.out.println("肥満です");
        }
        else{
            System.out.println("標準です");
        }

    }
}
