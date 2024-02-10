package main;

import list.List;

public class main {
    public static void main(String[] args) {


        List ll = new List(5);
        ll.add(5);
        ll.add(6);
        ll.add(42);
        ll.add(15);
        ll.add(12);
        ll.add(17);
        ll.add(187);

        ll.remove(15);
//        ll.add(10);
//        ll.add(9);
//        ll.remove(9);
//        ll.remove(56);
        System.out.println(ll.getsize());



        ll.print();

    }
}
