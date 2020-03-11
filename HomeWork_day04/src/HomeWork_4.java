import java.util.Scanner;

public class HomeWork_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个月份数：");
        int m = sc.nextInt();
        if(m==3||m==4||m==5){
            System.out.println("春季");
        }
        if(m==6||m==7||m==8){
            System.out.println("夏季");
        }
        if(m==9||m==10||m==11){
            System.out.println("秋季");
        }
        if(m==12||m==1||m==2){
            System.out.println("冬季");
        }


    }
}
