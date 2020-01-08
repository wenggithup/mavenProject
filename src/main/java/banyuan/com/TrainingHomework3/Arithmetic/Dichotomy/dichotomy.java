package banyuan.com.TrainingHomework3.Arithmetic.Dichotomy;


public class dichotomy {
    /**
     * 非递归方法，直接查找
     */
    public static int binSearch(Integer [] arr,int key){
        int start=0;
        int end=arr.length-1;
        int mid;
        while (start<=end){
            mid=(start+end)/2+start;
            if(arr[mid]>key){
                start=mid+1;
            }else if(arr[mid]<key){
                end=mid-1;
            }else {
                return mid;
            }
        }

        return -1;
    }
    /**
     * 递归
      */
    public static int binSearch2(Integer []arr,int key,int start,int end){
        int mid=(start+end)/2+start;
        if(start>=end){
            return -1;
        }else {
            if(mid>key){
             return  binSearch2(arr,key,start,mid-1);
            }
            if(mid<key){
            return binSearch2(arr,key,mid+1,end);
            }else {
                return mid;
            }
        }

    }
}
