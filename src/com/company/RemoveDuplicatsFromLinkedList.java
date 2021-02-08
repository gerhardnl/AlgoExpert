package com.company;

public class RemoveDuplicatsFromLinkedList {
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        if (linkedList.next != null){
            if (linkedList.value == linkedList.next.value){
                if (linkedList.next.next == null){
                    linkedList.next = null;
                }else {
                    linkedList.next = linkedList.next.next;
                }
                removeDuplicatesFromLinkedList(linkedList);
            }else {
                removeDuplicatesFromLinkedList(linkedList.next);
            }

        }

        return linkedList;
    }
}
