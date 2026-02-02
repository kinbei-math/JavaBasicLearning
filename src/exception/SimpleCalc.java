package exception;

import java.util.Scanner;
public class SimpleCalc {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("1つ目の数字を入れて：");
        String input1 = scanner.nextLine();
        System.out.println("2つ目の数字を入れて：");
        String input2 =scanner.nextLine();

        try{
            int input1_number=Integer.parseInt(input1);
            int input2_number=Integer.parseInt(input2);
            int result=input1_number/input2_number;
            System.out.println("計算結果:"+result);
        } catch (NumberFormatException e) {
            System.out.println("エラー：数字以外の文字が入力されています");
        } catch (ArithmeticException e){
            System.out.println("エラー：0で割ることはできません");
        }finally {
            System.out.println("処理終了");
            scanner.close();
        }


    }
}
