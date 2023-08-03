package SearchingAlgorithm;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] ar = {123,32,21,5,6,-12,-465,67,-43,-216,789};
        int target =1167;
        int result=linearSearch(ar,target);
        if(result > 0)
            System.out.println("Element fount at index :"+result+" value :"+ar[result]);
        else
            System.out.println("Element not found");

        System.out.println("Character present in string : "+linearSearchString("Dinesh",'D'));

        int[][] ar2={
                {12,56,27,9,0,1},
                {24,79,62,1},
                {13,45},
                {0,68,-4,12,3}
        };
        int[] res=search2D(ar2,45);
        System.out.println("Searching value in 2D array : "+ Arrays.toString(res));
    }
    public static int[] search2D(int[][] ar,int target)
    {
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar[i].length;j++)
            {
                if(target == ar[i][j])
                {
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};

    }
    public static int linearSearch(int[] ar, int target)
    {
        if(ar.length ==0)
        {
            return -1;
        }
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    public static int linearSearchInRange(int[] ar, int target,int start,int end)
    {
        if(ar.length ==0)
        {
            return -1;
        }
        for(int i=start;i<end;i++)
        {
            if(ar[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    public static boolean linearSearchString(String str, char target)
    {
        if(str.length() == 0)
        {
            return false;
        }

        for(char ch:str.toCharArray())
        {
            if(ch==target)
                return true;
        }


        return false;
    }
}
