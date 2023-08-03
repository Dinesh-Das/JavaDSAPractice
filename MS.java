import java.sql.SQLOutput;
import java.util.Random;

public class MS {
    public static void main(String[] args) {
        Random obj = new Random();
        int n= obj.nextInt(100);
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = obj.nextInt(500);
        System.out.println("Array before sorting\n");
        for (int i=0;i<n;i++) System.out.print(arr[i] + " ");
        myfun(arr,0,n);
        System.out.println("\nArray after sorting\n");
        for (int i=0;i<n;i++) System.out.print(arr[i] + " ");
    }
    private static void myfun(int[] x,int s,int e)
    {
        if(e-s == 1) return;

        int mid = s+ (e-s)/2;
        myfun(x,s,mid);
        myfun(x,mid,e);
        conquer(x,s,mid,e);
    }

    private static void conquer(int[] ar,int s,int m,int e){

        int[] mix = new int[e-s];
        int i,j,k;
        i=s;
        j=m;
        k=0;
        while(i<m && j <e)
        {
            if(ar[i] < ar[j])
            {
                mix[k++]=ar[i++];
            }else {
                mix[k++]= ar[j++];
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
            ar[x+s]=mix[x];
        }

    }

}
