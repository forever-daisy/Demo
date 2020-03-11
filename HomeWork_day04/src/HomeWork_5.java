import java.util.Scanner;

public class HomeWork_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 0 & score < 60) {
            System.out.println("差");
        } else if (score >= 60 & score < 70) {
            System.out.println("中");
        } else if (score >= 70 & score < 80) {
            System.out.println("良");
        } else if (score >= 80 & score <= 100) {
            System.out.println("优");
        }
    }



    }


