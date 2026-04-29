import java.util.*;

public class operatorArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add element in array list(add(element)).
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("add element : " + list);

        // add element with index (add(index, element))
        list.add(1, 2);
        System.out.println("add element in index : " + list);

        // print index element using (get(index))
        System.out.println("print element: " + list.get(4));

        // remove element using index (remove(index)).
        list.remove(3);
        System.out.println("remove element in index : " + list);

        // find the element (contains(element)).
        System.out.println("element find : " + list.contains(2));

        // find length (size()).
        System.out.println("length of array : " + list.size());
    }
}