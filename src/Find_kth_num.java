import java.util.Arrays;

public class Find_kth_num
{
    public static void main(String[] args)
    {
            int[] data={5,4,9,7,6,1,8,3,10,2,1,111,1,};
            int ans=find_K(data,0,data.length-1,5);
        System.out.println(ans);
    }
    public static int find_K(int[]arr,int l,int r,int k){
            int pivot=partion(arr,l,r);
        //pivot-start+1表示快排的前半段元素的个数（包括中轴）
        //当查了一次后，就划分了两边，大的在左边，小的在右边
            if(pivot-l+1==k){
                return arr[pivot];
            }else if(k>pivot-l+1){
                //说明第k大的元素在后半段，所以往后面查，start=pivot+1，k-（pivot-start+1）。
                // 为什么这样更新，想一下，我们虽然往后查，但查的还是整个数组的第k大，
                // 第一次快排枢纽的时候，已经把大的放右边了。
                return find_K(arr,pivot+1,r,k-pivot+l-1);
            }else{
                return find_K(arr,l,pivot-1,k);
            }
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
