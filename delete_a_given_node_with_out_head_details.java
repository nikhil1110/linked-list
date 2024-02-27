package practice2024;
import java.util.*;
import java.io.*;
import java.lang.*;

class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

class delete_a_given_node_with_out_head_details {

    public static void main(String args[])
    {
        Node head=new Node(10);
        head.next=new Node(20);
        Node ptr=new Node(30);
        head.next.next=ptr;
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(25);
        printlist(head);
        deleteNode(ptr);
        printlist(head);
    }

    static void deleteNode(Node ptr){
        ptr.data=ptr.next.data;
         ptr.next=ptr.next.next;
    }

    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}

