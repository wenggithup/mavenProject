package banyuan.com.TrainingHomework3.Arithmetic.Bubbling;

public class bubbling {
    public static void main(String[] args) {
        int [] arr={10,5,4,8,11,9,7,4};
        int temp=0;
        //外循环给定要比较多少次
        for (int i = 0; i <arr.length-1 ; i++) {
            //每过一轮最大值都会沉底，所以无需在对其进行操作，所以长度每次减一
            for (int j =0; j < arr.length-1-i; j++) {
                if (arr[j]>=arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
