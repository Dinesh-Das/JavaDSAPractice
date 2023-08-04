package SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ar = {9,8,7,6,5,4,3,2,1};
//        ar=new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(ar));
        bubbleSort(ar);
        System.out.println(Arrays.toString(ar));
    }

    public static void bubbleSort(int[] ar) {
        boolean isSwapped;
        for(int i=0;i<ar.length;i++){
            isSwapped=false;
            for(int j=1;j<ar.length-i;j++) {
                if(ar[j] < ar[j-1]) {
                    int tmp= ar[j];
                    ar[j]=ar[j-1];
                    ar[j-1]=tmp;
                    isSwapped=true;
                }
            }
            if(!isSwapped) break;
        }

    }
}
