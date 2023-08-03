package SearchingAlgorithm;

public class InfiniteArrayBinarySearchAmazonProblem {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);

    }
    static int binarySearch(int[] ar,int target,int start,int end)
    {
        while(start <= end)
        {
            int mid=start + (end-start) /2;
            if(target < ar[mid])
            {
                end=mid-1;
            }else if(target > ar[mid])
            {
                start=mid+1;
            }else{
                return  mid;
            }
        }
        return -1;
    }
}
