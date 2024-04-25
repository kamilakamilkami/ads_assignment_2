import Lists.MyArrayList;
import Lists.MyList;

/**
 * This Main class demonstrates the usage of the MyArrayList class,
 * specifically adding elements to the list, removing elements, and retrieving elements by index.
 */
public class Main {
    public static void main(String[] args) {
        MyList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1, 0);
        myArrayList.add(2, 1);
        myArrayList.add(5);
        System.out.println(myArrayList);

        myArrayList.remove(0);
        System.out.println(myArrayList);

        System.out.println(myArrayList.get(2));
    }

}
