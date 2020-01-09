package banyuan.com.TrainingHomework5.Arithmetic;

public class Choice {
    public static void main(String[] args) {
        Integer []arr=new Integer[]{11,22,4,12,5,1,9,8,4};
        System.out.println("排序前:");
        for (Integer integer : arr) {
            System.out.print(integer+" ");
        }
        choice(arr);
        System.out.println();
        System.out.println("排序后:");
        for (Integer integer : arr) {
            System.out.print(integer+" ");
        }
    }
    public static void choice(Integer [] arr){
        int temp=0;
        for (int i = 0; i <arr.length ; i++) {
            int index=i;
            for (int j =1+i; j <arr.length ; j++) {
                if(arr[index]>arr[j]){
                    index=j;
                }
            }
            if(index!=i){
                temp =arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
        }
    }
}
