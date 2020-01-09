package banyuan.com.TrainingHomework5.Arithmetic;

public class maopao {
    public static void main(String[] args) {
        Integer []arr=new Integer[]{11,22,4,12,5,1,9,8,4};
        System.out.println("排序前:");
        for (Integer integer : arr) {
            System.out.print(integer+" ");
        }
        bubbling(arr);

        System.out.println();
        System.out.println("排序后:");
        for (Integer integer : arr) {
            System.out.print(integer+" ");
        }
    }
    public static void bubbling(Integer []arr){
        int temp=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
    }
}
