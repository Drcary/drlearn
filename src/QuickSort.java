public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {3,42,5,6,7,88,96,45};

        sort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static void sort(int[] arr ,int s,int e){
        if (s<e){
            int num = sortnum(arr,s,e);
            sort(arr,s,num-1);
            sort(arr,num+1,e);
        }
    }

    static int sortnum(int[] arr ,int s, int e){
        int i = s;
        int j = e;
        int number = arr[s];
        while (i < j){
            while (i < j){
                if (arr[i] >= number){
                    arr[j] = arr[i];
                    break;
                }else {
                    i++;
                }
            }
            while (i < j){
                if (arr[j] < number){
                    arr[i] = arr[j];
                    break;
                }else {
                    j--;
                }
            }

        }
        arr[i] = number;
        return i;
    }
}
