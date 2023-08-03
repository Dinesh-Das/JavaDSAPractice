import  java.util.Arrays;
public class MergeSortDemo1 {
    public static void main(String[] args) {
        int[] ar = {1,4,7,9,2,51,88,52,3,57,90,11,55,23,94,52,31};
        ar = Divide(ar);
        for(int i=0;i<ar.length;i++)
            System.out.println(ar[i]);

    }

    private static int[] Divide(int[] ar)
    {
        if(ar.length == 1)
        {
            return ar;
        }
        int mid= ar.length/2;

        int[] left  = Divide(Arrays.copyOfRange(ar,0,mid));
        int[] right = Divide(Arrays.copyOfRange(ar,mid,ar.length));

        return Conquer(left,right);

    }

    private static int[] Conquer(int[] a, int[] b)
    {
        int[] mix = new int[a.length+b.length];
        int i=0,j=0,k=0;

        while(i < a.length && j < b.length)
        {
            if(a[i] < b[j])
            {
                mix[k++]=a[i++];
            }else{
                mix[k++]=b[j++];
            }
        }

        while(i < a.length)
        {
            mix[k++]=a[i++];
        }

        while(j < b.length)
        {
            mix[k++]=b[j++];
        }

        return mix;
    }
}
