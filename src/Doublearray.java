//合并数组
public class Doublearray {
    public static int[] getarr(int[] arr1,int[] arr2){
        int i = 0;
        int j = 0;
        int[] arr = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                arr[i+j] = arr1[i];
                i++;
            }else {
                arr[i+j] = arr2[j];
                j++;
            }
        }
        while (i < arr1.length){
            arr[i+j] = arr1[i];
            i++;
        }
        while (j < arr2.length){
            arr[i+j] = arr2[j];
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9,11,14};
        int[] arr2 = {2,4,6,8,10};

        int[] a = getarr(arr1,arr2);

        for (int i:a) {
            System.out.println(i);
        }
    }
}
