package SortingAlgorithm;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
    int[] ar= new int[]{7,4,1,8,0,9,2,3,6};
        System.out.println(Arrays.toString(ar));
        selectionSort(ar);
        System.out.println(Arrays.toString(ar));
    }

    public static void selectionSort(int[] ar){
        for(int i=0;i<ar.length;i++)
        {
            int last = ar.length-i-1;
            int maxIndex = getMaxIndex(ar,0,last);
            swap(ar,maxIndex,last);
        }
    }
    public static int getMaxIndex(int[]ar,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++)
        {
            if(ar[max] < ar[i])
            {
                max=i;
            }
        }
        return max;
    }
    public static void swap(int[] ar,int first,int sec)
    {
        int temp=ar[first];
        ar[first]=ar[sec];
        ar[sec]=temp;
    }

}
