package banyuan.com.TrainingHomework5.Arithmetic;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr={1,3,5,9,20,37,40,66,88,101};
        System.out.println(binarysearch(arr, 66));
    }
    public static int binarysearch(int []arr,int num){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            int mid = (start + end) / 2;
            if (arr[mid] > num) {
                end = mid - 1;
            } else if (arr[mid] < num) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}

