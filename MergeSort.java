import java.util.Random;

public class MergeSort {


    public static void main(String[] args) {

        Random random = new Random();
        int n= random.nextInt(100);
        System.out.println(n);
        int[] nums = new int[n];
        for(int i=0;i<n;i++)nums[i] = random.nextInt(100);
        System.out.println("Before sorting");
        printArray(nums);

        MergeSort(nums,0,nums.length);

        System.out.println("\nAfter sorting");
        printArray(nums);
    }
    private static void MergeSort(int[] ar,int s,int e)
    {
        if(e-s== 1) return;
        int mid=s+(e-s)/2;

        MergeSort(ar,s,mid);
        MergeSort(ar,mid,e);

        merge(ar,s,mid,e);
    }
    private static void merge(int[]ar, int s,int m,int e)
    {
        int[] mix = new int[e-s];
        int i=s,j=m,k=0;
        while(i<m && j<e)
        {
            if(ar[i] < ar[j])
            {
                mix[k++]=ar[i++];
            }else{
                mix[k++]=ar[j++];
            }
        }
        while(i<m)
        {
            mix[k++]=ar[i++];
        }
        while(j<e)
        {
            mix[k++]=ar[j++];
        }

        for(int x=0;x< mix.length;x++)
        {
            ar[s+x] = mix[x];
        }
    }

    private static void printArray(int[] nums)
    {
        System.out.println();
        for(int i=0;i<nums.length;i++) System.out.print(nums[i]+" ");
        System.out.println();
    }
}
