package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionDemo4 {
    public static void main(String[] args) {
        long s, e;
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>(); // 삽입, 삭제에 유리

        s = System.nanoTime();
        for(int i = 0; i < 100000; i++) {
            al.addFirst(i);
        e = System.nanoTime();
        System.out.println(e - s);

        s = System.nanoTime();
        for(int i = 0; i < 100000; i++) {
            ll.add(0, i);
        }
    }
}
