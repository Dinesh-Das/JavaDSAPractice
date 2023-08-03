import java.util.Arrays;

public class MergeSortInPlace {
        public static void main(String[] args) {
            int[] ar = {1,4,7,9,2,51,88,52,3,57,90,11,55,23,94,52,31};
            Divide(ar,0,ar.length);
            for(int i=0;i<ar.length;i++)
                System.out.println(ar[i]);

        }

        private static void Divide(int[] ar, int s,int e)
        {
            if(e-s == 1)
            {
                return ;
            }
            int mid= s+ (e-s)/2;
             Divide(ar,s,mid);
             Divide(ar,mid,e);
             Conquer(ar,s,mid,e);
        }

        private static void Conquer(int[] ar, int s,int m,int e)
        {
            int[] mix = new int[e-s];
            int i=s,j=m,k=0;
            while(i < m && j < e)
            {
                if(ar[i] < ar[j])
                {
                    mix[k++]=ar[i++];
                }else{
                    mix[k++]=ar[j++];
                }
            }
            while(i < m)
            {
                mix[k++]=ar[i++];
            }
            while(j < e)
            {
                mix[k++]=ar[j++];
            }
            for(int l=0;l<mix.length;l++)
            {
                ar[s+l]=mix[l];
            }
        }
}
