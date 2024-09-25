public class Rotated_sorted_search {
    public static int search(int arr[], int tar, int si, int ei){
        if(si > ei){
            return -1;
        }

        int mid = si+(ei-si)/2;

        //Case Found
        if(arr[mid] == tar){
            return mid;
        }

        //mid on L1
        if(arr[si] <= arr[mid]){
            //Case a : left
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            }
            //Case b : right
            else{
                return search(arr, tar, mid+1, ei);
            }
        }
        //mid on L2
        else{
            //Case c : right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            //Case d : left
            else{
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 6;
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }
} 
