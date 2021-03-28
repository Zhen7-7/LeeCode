package cn.zhen77;

import java.sql.SQLOutput;
import java.util.ArrayList;

/**
 * @author : zhen77
 * @date: 2021/3/28 - 03 - 28 - 14:35
 * @Description: cn.zhen77
 * @version: 1.0
 */
public class ReverseLinkedList {
    //每个链表都会有头结点
    //单向链表
    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            value = data;
        }
    }
    //双向链表
    public static class DoubleNode{
        public int value;
        public DoubleNode last;
        public DoubleNode next;
        public DoubleNode(int data){
            value = data;
        }
    }
    //1.单双向链表如何实现反转:
    /*
    * 单链表: 分成如下几部
    * 给出两个节点pre 和 next
    * 1.让next记录头结点的下一个节点以免丢失
    * 2.让头结点指向上一个节点
    * 3.上一个节点pre往下走
    * 4.head往下走
    *
    * */
    public static Node reverseLinkList(Node head){
        Node pre = null;
        Node next = null;
        while(head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return head;
    }
    /*
    * 2双向链表
    * 1.*/
    public static DoubleNode reserveDoubleLinkedList(DoubleNode head){
        DoubleNode pre = null;
        DoubleNode next = null;
        while(head!=null){
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }
        return head;

    }
    //对数器之testLinkedList
    public static Node TestLinkedList(Node head){
        if(head==null){
            return null;
        }
        ArrayList<Node> list = new ArrayList<>();
        while(head!=null){
            list.add(head);
            head= head.next;
        }
        list.get(0).next = null;
        int  n=list.size();
        for(int i = 1 ; i<n ; i++){
            list.get(i).next = list.get(i-1);
        }
        return  head;

    }

    public static Node generateRandomLinkedList(int length,int value){
        int size  = (int)(Math.random()*(length+1));
        if (size==0) return  null;
        size--;//真鸡儿细节啊;
        Node head = new Node((int) Math.random() * (value + 1));
        Node pre = head;//记录head好返回
        while(size!=0){
            Node cur = new Node((int)Math.random()*(value+1));
            pre.next = cur;
            pre = cur;
            size--;
        }
        return head;
    }
    //测试:
    public static boolean checkLinkedList(Node head1 , Node head2){

        while (head1!=null && head2!=null){
            if(head1.value != head2.value){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return  true;

    }

    public static void main(String[] args) {
        Node head = generateRandomLinkedList(50, 14);
        Node head1 = reverseLinkList(head);
        Node head2 = TestLinkedList(head1);
        boolean isequal = checkLinkedList(head2, head);
        if (isequal==true){
            System.out.println("success");
        }else{
            System.out.println("false");
        }


    }
}
