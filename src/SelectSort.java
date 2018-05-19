public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {31,34,6,56,7,856,8,9,6767,76};

        //选择排序：每次选取最小的放前面
        for (int i = 0; i < arr.length; i++) {
            int minid = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[minid] > arr[j]){
                    minid = j;
                }
            }
            if (arr[minid] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[minid];
                arr[minid] = temp;

            }

        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
