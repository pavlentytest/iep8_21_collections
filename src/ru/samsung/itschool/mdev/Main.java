package ru.samsung.itschool.mdev;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Collections
        // List-ы (списки)
        // Реализации: ArrayList, LinkedList, Queue, Stack
        // FIFO - First In First Out (Queue)
        // LIFO - Last In First Out (Stack)
        //ArrayList<String> arrayList = new ArrayList<>();
        // Set-ы (множества)
        // Реализации: TreeSet, HashSet
        // Map-ы (словари)
        // (key, value)
        // Реализации: Hashtable, HashMap, LinkedHashmap, TreeMap

        // Collections - вспомог. класс

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long start = System.nanoTime();
        for(int i=0; i<100000; i++) {
            arrayList.add(0,i);
        }
        long end = System.nanoTime();
        System.out.println("Arraylist add to the begin: "+(end-start));

        start = System.nanoTime();
        for(int i=0; i<100000; i++) {
            linkedList.add(0,i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList add to the begin: "+(end-start));

        start = System.nanoTime();
        for(int i=30000; i<70000; i++) {
            arrayList.get(i);
        }
        end = System.nanoTime();
        System.out.println("Arraylist get from the middle: "+(end-start));

        start = System.nanoTime();
        for(int i=30000; i<70000; i++) {
            linkedList.get(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList get from the middle: "+(end-start));


        start = System.nanoTime();
        for(int i=0; i<50000; i++) {
            arrayList.add(i);
        }
        end = System.nanoTime();
        System.out.println("Arraylist add to the end: "+(end-start));

        start = System.nanoTime();
        for(int i=0; i<50000; i++) {
            linkedList.add(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList add to the end: "+(end-start));

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        String[] str = {"1","2","3","4","5"};
        for(String s: str) {
            stack.push(s); // кладем в стек
            queue.offer(s);
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
        while(!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }


        ArrayList<Integer> arrayList1 = new ArrayList<>();
        Collections.addAll(arrayList1,5,23,45,2,5,234,33460,4,5345);
        Collections.sort(arrayList1);
        int find = Collections.binarySearch(arrayList1,33460); // <0

        class City implements Comparable<City>{
            private String name;
            private int region;

            public City(String name, int region) {
                this.name = name;
                this.region = region;
            }

            @Override
            public int compareTo(City o) {
                return this.region-o.region;
            }
        }

        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Kazan",16));
        cities.add(new City("Nijny Novgorod",52));
        cities.add(new City("Kostroma",44));
        cities.add(new City("Stary Oskol",31));

        Comparator<City> comparator = new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                //return o1.name.compareTo(o2.name);
                return o1.region - o2.region;
            }
        };

        Collections.sort(cities);

        for(City c: cities)
            System.out.println(c.name + " " + c.region);


    }
}
