package SortingAlgorithm;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] ar= {9,7,8,1,5,6,4,3,2,0};
        cyclicSort(ar);
        System.out.println(Arrays.toString(ar));

    }
    public static void cyclicSort(int[] ar)
    {
        int i=0;

        while(i < ar.length)
        {
            int correct=ar[i];
            if(ar[i] != ar[correct])
            {
                int tmp=ar[i];
                ar[i]=ar[correct];
                ar[correct]=tmp;

            }else{
                i++;
            }
        }


    }
}

