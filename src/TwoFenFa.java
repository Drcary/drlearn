public class TwoFenFa {
    public static int TwoSearch(int[] arr,int k){
        int low = 0;
        int high = arr.length-1;

        while (low <= high){
            int mid = (low + high)/2;

            if ( k > arr[mid]){
                low = mid + 1;
            }else if (k < arr[mid]){
                high = mid - 1;
            }else
                return mid;
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {3,22,4,56,78,9,99,65,33,34};
        QuickSort.sort(arr,0,arr.length-1);
        //排序完：3 4 9 22 33 34 56 65 78 99
        int find = TwoSearch(arr,56);
        if (find != -1){
            System.out.println(arr[find]+":"+find);
        }else
            System.out.println("Not find");
        int a = 7/2;//向下
        System.out.println(a);
    }
}
