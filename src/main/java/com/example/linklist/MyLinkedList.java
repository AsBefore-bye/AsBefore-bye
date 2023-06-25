package com.example.linklist;

public class MyLinkedList extends Node {//模拟LinkedList
    //对于每一个LinkedList集合，都有一个首节点和一个尾节点：
    private Node first;//首节点
    private Node last;//尾节点

    public void add(Object obj){
        Node n=new Node();
        if(first==null){	//证明我放入的是第一个节点
            //创建一个独立的节点：
            n.setPrevious(null);
            n.setObj(obj);
            n.setNext(null);

            //将我想象的这个链中的首节点，位节点都设置为n
            first=n;
        }else{	//放入的是第二个节点，第三个节点。。。。。
            //创建一个独立的节点：
            n.setPrevious(last);
            n.setObj(obj);
            n.setNext(null);

            //将链表的最后一个的下一个指向为n
            last.setNext(n);

            //将链表的最后一个指向n
        }
        last=n;
    }

    public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList();
        list.add("java");
        list.add("css");
        list.add("solr");
        list.add("jsp");
        System.out.println(getObj());
    }
}


