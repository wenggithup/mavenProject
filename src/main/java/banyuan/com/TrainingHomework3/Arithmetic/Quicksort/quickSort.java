package banyuan.com.TrainingHomework3.Arithmetic.Quicksort;

/**
 * @author edz
 */
public class quickSort {
    //Integer [] arr ={10,7,3,5,4,8,9,11,2,15};

    public static void main(String[] args) {
        Integer [] arr ={10,11,3,5,15,8,9,11,2,15};
        for (Integer integer : arr) {
            System.out.print(integer+" ");
        }
        System.out.println();
        quicksort(arr,0,arr.length-1);
        for (Integer integer : arr) {
            System.out.print(integer+" ");

        }
        String s1=new String("你好");
        String s2=s1;
        System.out.println(s1.hashCode()+" "+s2.hashCode());
        System.out.println(s1==s2);


    }

    //拿到目标值下标
    public static int getMiddle (Integer [] arr,int low,int high){
        int key=arr[low];
        while (low<high){
            //从右边开始，如果值比目标值大，往前移下标，否则，停止，并将该值赋给最左边
            while (low<high && arr[high]>=key){
                high--;
            }
            arr[low]=arr[high];
            //System.out.println("第一轮"+low+" "+arr[low]+" "+high+" "+arr[high]);
            //从左边开始，如果值比目标值小，往后移动下标，否则停止，并将该值赋给右边
            while (low<high&& arr[low]<key){
                low++;
            }
            //交换位置
            arr[high]=arr[low];
            //System.out.println("第er轮"+low+" "+arr[low]+" "+high+" "+arr[high]);
        }
        arr[low]=key;
        //System.out.println(low+" "+arr[low]+" "+key);

        return low;
    }
    public static void quicksort(Integer []arr,int low,int high){
        if(low>high){
            return;
        }
        if(low<high){
            int middle=getMiddle(arr,low,high);
            System.out.println(middle+" "+low+" "+high);
            quicksort(arr,low,middle);
            quicksort(arr,middle+1,high);
        }

    }



}
