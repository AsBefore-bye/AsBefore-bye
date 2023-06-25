package com.example.linklist;

public class Node {//节点类
    private static Object previous;//每个节点的前一个指向
    private static Object obj;//每个节点中间位置用来存放你存储的东西
    private static Object next;//每个节点的后一个指向

    public static Object getPrevious() {
        return previous;
    }
    public void setPrevious(Object previous) {
        Node.previous = previous;
    }
    public static Object getObj() {
        return obj;
    }
    public void setObj(Object obj) {
        Node.obj = obj;
    }
    public static Object getNext() {
        return next;
    }
    public void setNext(Object next) {
        Node.next = next;
    }
}

