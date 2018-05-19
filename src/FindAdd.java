import java.util.HashMap;

//找出指定数字的加数组合 8 = 1:7
public class FindAdd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,9};//先排序:Arrays.sort()
        int[] a = twoSum(arr,11);
//        int sum = 0;
////        int think_number = 8;
////        int i = 0;
////        int j =arr.length-1;
////        while(sum != think_number){
////            sum = arr[i] +arr[j];
////            if (sum > think_number){
////                j--;
////            }
////            if (sum < think_number)
////                i++;
////        }
////        System.out.println(arr[i]+":"+arr[j]);

    }
    static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        if(numbers==null || numbers.length<2)
            return null;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<numbers.length;i++)
        {
            if(map.containsKey(target-numbers[i]))
            {
                res[0]=map.get(target-numbers[i])+1;
                res[1]=i+1;
                System.out.println(res[0]+":"+res[1]);
                return res;

            }
            map.put(numbers[i],i);
        }
        return null;
    }
}
