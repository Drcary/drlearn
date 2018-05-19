import java.util.ArrayList;
import java.util.Iterator;

//素数：除了1和它本身外没有别的公因数。1不是素数。
public class FindSuShu {
    public static void main(String[] args) {
        boolean k = true;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 3; i < 100; i+=2) {
            k = true;
            for (int j = 3;j <= Math.sqrt(i); j++) {
                if ( i % j == 0){
                    k = false;
                    break;
                }
            }
            if (k){
                arrayList.add(i);
            }
        }
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
