package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class integer {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(34);
        num.add(45);
        num.add(78);
        num.add(67);
        num.add(90);
        System.out.println(num);
        System.out.println(num.get(0));
        System.out.println(num.get(1));
        System.out.println(num.get(2));
        System.out.println(num.get(3));
        System.out.println(num.get(4));
        num.add(0,12);
        System.out.println(num);
        num.set(0,44);
        System.out.println(num);
        num.remove(0);
        System.out.println(num);
        Collections.sort(num);
        System.out.println(num);
        
        num.clear();
        System.out.println(num);
        System.out.println(num.isEmpty());
    }
}
