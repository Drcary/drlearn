//找第二大
public class ArrayFindSecond {
    public static void main(String[] args) {
        int[] arr = {86,86,86,86,1};
        int max_first = arr[0];
        int max_second = Integer.MIN_VALUE;
        boolean a =true;
        for (int i = 0; i < arr.length; i++) {
            a = true;
            if (arr[i] > max_second) {
                if (arr[i] == max_first)
                    a = false;
                if (a && arr[i] > max_first ) {
                    max_second = max_first;//原来最大值变第二大
                    max_first =arr[i];//最大值更新为当前值
                } else if(a){
                    max_second = arr[i];//当前值为第二大
                }
            }
        }
        if (max_second == Integer.MIN_VALUE){
            System.out.println("不存在第二大的值");
        }
        if (arr == null)
            System.out.println("不存在");
        System.out.println(max_first+":"+max_second);
    }
}
