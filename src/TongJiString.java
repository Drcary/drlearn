import java.util.*;

public class TongJiString  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        char[] c = string.toCharArray();

        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for (Character ch : c) {
            if(!hm.containsKey(ch)){
                hm.put(ch,1);
            }else {
                hm.put(ch,hm.get(ch)+1);
            }
        }
        //Iterator<Map.Entry<String,String>>iterator=map.entrySet().iterator();
        //while(iterator.hasNext()){
        //  Map.Entry<String,String>entry=iterator.next();
        //  entry.getKey();
        //  entry.getValue();}

        //  Iterator 不能用两次it.next（）
        Iterator<Character> it = hm.keySet().iterator();
        while (it.hasNext()){
            //Object key = it.next();
            //System.out.println(key+":"+hm.get(key));
            System.out.println(it.next());
        }
        //删除最少的
        Collection<Integer> collection =hm.values();
        int min = Collections.min(collection);

        StringBuffer stringBuffer =new StringBuffer("");
        for(char c1 : c){
            if (hm.get(c1) != min){
                stringBuffer.append(c1);
            }
        }
        System.out.println(stringBuffer.toString());
    }
}
