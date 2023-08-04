package SearchingAlgorithm;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] ar;={1,2,3,4,5,6,7,8,9,12,34,56,78,99};
        int[]ar={99,98,88,78,77,68,67,66,55,44,40,35,34,33,22,11,1};
        int target =34;
        int ans=orderAgnosticBinarySearch(ar,target);
        System.out.println(ans);

    }
    static int orderAgnosticBinarySearch(int[] ar,int target)
    {
        int start=0;
        int end=ar.length -1;
        boolean isAsc = ar[start] < ar[end];
        while(start <= end)
        {
            int mid=start + (end-start)/2;
            if(target==ar[mid]) return mid;
            if(isAsc){
                if(target < ar[mid])
                {
                    end=mid-1;
                }else
                {
                    start=mid+1;
                }
            }else {
                if(target > ar[mid])
                {
                    end=mid-1;
                }else
                {
                    start=mid+1;
                }
            }

        }
        return -1;
    }
    static int binarySearchDesc(int[] ar,int target)
    {
        int start=0;
        int end=ar.length -1;
        while(start >= end)
        {
            int mid=start + (end-start)/2;

            if(target > ar[mid])
            {
                end=mid-1;
            }else if(target < ar[mid])
            {
                start=mid+1;
            }else{
                return mid;
            }
        }

        return -1;
    }

    static int binarySearchAsc(int[] ar,int target)
    {
        int start=0;
        int end=ar.length -1;
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
