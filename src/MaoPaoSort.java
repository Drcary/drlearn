public class MaoPaoSort {
    public static void main(String[] args) {
        //冒泡
        int[] arr = {3,736,333,56,6,4,54,5,66};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int c:arr){
            System.out.println(c);
        }
    }
}
