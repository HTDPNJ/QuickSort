import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
            int[] data={5,4,9,7,6,1,8,3,10,2};
            quicksort(data,0,data.length-1);
        System.out.println(Arrays.toString(data));
    }
    public static void quicksort(int[]arr,int l,int r){
        if(l<r){
            int q=partion(arr,l,r);
            quicksort(arr,l,q-1);
            quicksort(arr,q+1,r);
        }
    }
    public static int  partion(int []arr,int l,int r){
        int parpoi=l;
        int tem=arr[parpoi];
        while (l<r){
            while(l<r&&arr[r]>=tem){
                r--;
            }
            if(l<r){
                arr[parpoi]=arr[r];
                parpoi=r;
                l++;
            }
            while(l<r&&arr[l]<=tem){
                l++;
            }
            if(l<r){
                arr[parpoi]=arr[l];
                parpoi=l;
                r--;
            }
        }
        arr[parpoi]=tem;
        return parpoi;
    }
}
