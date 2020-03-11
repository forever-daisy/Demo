

import java.util.Arrays;

/*
 *
 * * *
 * * * * *
 * * * * * * *
 * * * * *
 * * *
 *
 */
public class practice {
    public static void main(String[] args) {
        int[][]a =new int[3][];
        for (int i = 0; i <a.length ; i++) {
            a[i]=new int[5-i];//这里决定内数组的长度，5替换成x,Length=x-1
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"  ");
            }
        }
        System.out.println();
    }
}


