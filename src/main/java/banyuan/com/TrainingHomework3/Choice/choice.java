package banyuan.com.TrainingHomework3.Choice;

public class choice {

    public static void main(String[] args) {
        Integer [] arr={4,11,8,10,12,4,2};
        choiceMethod(arr);
        for (Integer integer : arr) {
            System.out.print(integer+" ");
        }
    }
    public static void choiceMethod(Integer[] arr){
        //外循环规定次数
        for (int i = 0; i <arr.length-1 ; i++) {
            //定义下标，每次拿出当前的值和后面每个数对比，选出一个最小的值并记录下标
            int index=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            //如果下标和初始值不同，那么需要交换位置
            if(index!=i){
                int temp=0;
                temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }


        }



    }
}
