package com.demo.exceptions;

import java.util.*;

public class Arr {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<Integer>();
        ls.add(10);
        ls.add(50);
        ls.add(5);
        ls.add(6);
        System.out.println(ls);
        Collections.sort(ls);
        ls.add(2,89);


        System.out.println(ls);
        LinkedList<Integer> l=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        PriorityQueue<Integer> q= new PriorityQueue<>();
        q.offer(24);
        q.offer(154);
        System.out.println(q.poll());

    }


}
