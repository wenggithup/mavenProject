package banyuan.com.TrainingHomework3.Choice;

public class choice {


    public void choiceMethod(Integer[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            int index=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            if(index!=i){
                int temp=0;
                temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }


        }



    }
}