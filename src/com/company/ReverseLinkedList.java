package com.company;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static LinkedList reverseLinkedList(LinkedList head) {
        LinkedList current = head;
        LinkedList temp = null;
        LinkedList next = null;
        while (current != null){
            temp = current.next;
            current.next = next;
            next = current;
            current = temp;
        }
            return next;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
