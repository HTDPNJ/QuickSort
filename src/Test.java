import java.util.Arrays;

public class Test
{
    public static void main(String[] args)
    {
            int[] data={5,4,9,7,6,1,8,3,10,2};
            int ans=quicksort(data,0,data.length-1);
        System.out.println(Arrays.toString(data));
    }
    public static int quicksort(int[]arr,int l,int r){
        if(l<r){
            int q=partion(arr,l,r);
            quicksort(arr,l,q-1);
            quicksort(arr,q+1,r);
        }
        return 0;
    }
    public static int  partion(int []arr,int l,int r){
        int key=arr[l];
        while (l<r){
            while(l<r&&arr[r]>=key){
                r--;
            }
            if(l<r){
                arr[l]=arr[r];
                l++;
            }
            while(l<r&&arr[l]<=key){
                l++;
            }
            if(l<r){
                arr[r]=arr[l];
                r--;
            }
        }
        arr[l]=key;
        return l;
    }
}
