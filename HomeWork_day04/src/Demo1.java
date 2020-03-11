public class Demo1 {
    public static void main(String[] args) {
       int[] a ={2,5,1,7,4,9};
        System.out.println("排序之前：");
        for (int i : a) {
            System.out.print(i+"  ");
        }
        System.out.println();
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = 0; j <a.length-1-i ; j++) {
                if(a[j]<a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("排序之后：");
        for (int i : a) {
            System.out.print(i+"  ");
        }
        System.out.println();
    }
    }
