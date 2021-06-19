import java.util.*;

public class Collections {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        Deque<String> deque = new ArrayDeque<>();
        Queue<String> queue = new PriorityQueue<>();
        Set<String> hashSet = new HashSet<>();
        HashMap<Integer, String> hashMap = new HashMap<>();

        arrayList.add("Some text1");
        arrayList.add(1, "Some text2");

        deque.offer("linked list add 1");
        deque.offer("linked list add 2");

        queue.offer("queue add 1");
        queue.offer("queue add 2");

        hashSet.add("Set add 1");
        hashSet.add("Set add 2");

        hashMap.put(1, "map add 1");
        hashMap.put(2, "map add 2");

        arrayList.forEach(System.out::println);
        System.out.print(" \n ");
        deque.forEach(System.out::println);
        System.out.print(" \n ");
        queue.forEach(System.out::println);
        System.out.print(" \n ");
        hashSet.forEach(System.out::println);
        System.out.print(" \n ");
        System.out.println(hashMap.entrySet());


        Iterator<String> dIterator = deque.iterator();


        for (Iterator<String> it = arrayList.iterator(); it.hasNext(); ) {
            String element = it.next();
            it.remove();
        }

        for (Iterator<String> it = queue.iterator(); it.hasNext(); ) {
            String element = it.next();
            it.remove();
        }

        for (Iterator<String> it = deque.iterator(); it.hasNext(); ) {
            String element = it.next();
            it.remove();
        }

        for (Iterator<String> it = hashSet.iterator(); it.hasNext(); ) {
            String element = it.next();
            it.remove();
        }

        Set<Integer> keySet = hashMap.keySet();

        for (Iterator<Integer> it = keySet.iterator(); it.hasNext(); ) {
            Integer element = it.next();
            hashMap.remove(it);
            it.remove();
        }

        System.out.println(arrayList.isEmpty());
        System.out.println(queue.isEmpty());
        System.out.println(deque.isEmpty());
        System.out.println(hashSet.isEmpty());
        System.out.println(hashMap.isEmpty());

    }

}

