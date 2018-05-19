import java.util.LinkedHashMap;

public class FindFirstSee {
    public static void main(String[] args) {
        int[] arr = {23,23,2,23,4,4,1};

        LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<>();

        for (int i :arr) {
            if (!hm.containsKey(i)){
                hm.put(i,1);
            }else
                hm.put(i,hm.get(i)+1);
        }
        for (int j: hm.keySet()){
            if (hm.get(j) == 1) {
                System.out.println(j);
                break;
            }
        }
    }
}
