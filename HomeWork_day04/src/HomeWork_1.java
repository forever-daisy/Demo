import java.util.Scanner;

public class HomeWork_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int i= sc.nextInt();
        System.out.println("输入一个整数：");
        int i= sc.nextInt();
        if(i%2 == 0 ){
            System.out.println("偶数");
        }
        if (i%2 == 1){
            System.out.println("奇数");
        }


    }
}
