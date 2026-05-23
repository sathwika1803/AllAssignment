package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class string {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Sathwika");
        list.add("Vaishnavi");
        list.add("vani");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        list.add(1,"guddu");
        System.out.println(list);
        list.set(0,"vaagdevi");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.remove("Vaishnavi");
        System.out.println(list);
        System.out.println(list.contains("guddu"));
        Collections.sort(list);
        System.out.println(list);

        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
    }
}
